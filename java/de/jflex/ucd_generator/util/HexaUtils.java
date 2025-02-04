/*
 * Copyright (C) 2019-2020 Google, LLC.
 * SPDX-License-Identifier: BSD-3-Clause
 */
package de.jflex.ucd_generator.util;

import com.google.common.base.Strings;

public class HexaUtils {
  private HexaUtils() {}

  public static Integer intFromHexa(String string) {
    if (Strings.isNullOrEmpty(string)) {
      return null;
    }
    return Integer.valueOf(string, 16);
  }
}
