package com.holddie.design;

public class StringUtils {

  private StringUtils() {}

  public static boolean isBlank(String str) {
    return str == null || str.length() == 0;
  }
}
