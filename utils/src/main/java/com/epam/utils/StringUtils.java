package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
      if(str.isEmpty()){
            return false;
        }
        double d = Double.parseDouble(str);
        return d>0;
    }
}
