/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.flink.table.descriptors;

import org.apache.flink.table.api.ValidationException;

/**
  * Validator for {@link Json}.
  */
public class CsvValidator extends FormatDescriptorValidator {

	public static final String FORMAT_TYPE_VALUE = "csv";
	public static final String FORMAT_SCHEMA = "format.schema";
	public static final String FORMAT_CSV_FIELD_DELIMITER = "format.csv-field-delimiter";
	public static final String FORMAT_CSV_MAP_ENTRY_DELIMITER = "format.csv-map-entry-delimiter";
	public static final String FORMAT_CSV_MAP_KEY_DELIMITER = "format.csv-map-key-delimiter";

	@Override
	public void validate(DescriptorProperties properties) {
		super.validate(properties);
		properties.validateBoolean(FORMAT_DERIVE_SCHEMA(), true);
		final boolean hasSchema = properties.containsKey(FORMAT_SCHEMA);
		if (hasSchema) {
			properties.validateType(FORMAT_SCHEMA, false);
		}
	}
}
