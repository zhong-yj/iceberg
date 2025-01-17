/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.iceberg.util;

import java.util.Map;

public class PropertyUtil {

  private PropertyUtil() {
  }

  public static boolean propertyAsBoolean(Map<String, String> properties,
                                          String property, boolean defaultValue) {
    String value = properties.get(property);
    if (value != null) {
      return Boolean.parseBoolean(value);
    }
    return defaultValue;
  }

  public static double propertyAsDouble(Map<String, String> properties,
      String property, double defaultValue) {
    String value = properties.get(property);
    if (value != null) {
      return Double.parseDouble(value);
    }
    return defaultValue;
  }

  public static int propertyAsInt(Map<String, String> properties,
                                  String property, int defaultValue) {
    String value = properties.get(property);
    if (value != null) {
      return Integer.parseInt(value);
    }
    return defaultValue;
  }

  public static long propertyAsLong(Map<String, String> properties,
                                    String property, long defaultValue) {
    String value = properties.get(property);
    if (value != null) {
      return Long.parseLong(value);
    }
    return defaultValue;
  }

  public static String propertyAsString(Map<String, String> properties,
                                        String property, String defaultValue) {
    String value = properties.get(property);
    if (value != null) {
      return value;
    }
    return defaultValue;
  }
}
