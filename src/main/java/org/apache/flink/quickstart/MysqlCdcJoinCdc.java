package org.apache.flink.quickstart;

import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.table.api.EnvironmentSettings;
import org.apache.flink.table.api.bridge.java.StreamTableEnvironment;
import org.apache.flink.util.MysqlTableDDLBuilder;

public class MysqlCdcJoinCdc {
    public static void main(String[] args)throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        StreamTableEnvironment tEnv = StreamTableEnvironment.create(env,
                EnvironmentSettings.newInstance().useBlinkPlanner().inStreamingMode().build());

        MysqlTableDDLBuilder builder = new MysqlTableDDLBuilder("localhost", "3306",
                "jerryjzhang", "tme");
        String sourceDDL = builder.getCdcTableDDL("jerry", "products",
                "id", "update_time", -10);
        String source2DDL = builder.getCdcTableDDL("jerry", "products_sink",
                "id", "update_time", 0);
        System.out.println(sourceDDL);
        System.out.println(source2DDL);

        String sinkDDL = "CREATE TABLE sinkTable (" +
                " a INT," +
                " b INT," +
                " name STRING," +
                " ut TIMESTAMP(9)," +
                " PRIMARY KEY (a) NOT ENFORCED" +
                ") WITH (" +
                " 'connector' = 'print'" +
                ")";

        tEnv.executeSql("CREATE DATABASE IF NOT EXISTS jerry");
        tEnv.executeSql(sourceDDL);
        tEnv.executeSql(source2DDL);
        tEnv.executeSql(sinkDDL);

        tEnv.executeSql("insert into sinkTable " +
                "select T.id, D.id, T.name, T.update_time " +
                "from jerry.products AS T " +
                "LEFT JOIN jerry.products_sink FOR SYSTEM_TIME AS OF T.update_time AS D " +
                "ON T.id = D.id");
    }
}