package com.epam.demo;

import java.util.List;
import com.epam.utils.StringUtils;
import java.util.ArrayList;

public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
         if(args == null){
            return false;
        }
        List<String> temp = new ArrayList<>();
        for(String s : args){
            if(s.equals(" ")){
                return false;
            } else if (s.equals("")) {
                return false;
            } else if (s.equals("null")) {
                return false;
            }
            if(StringUtils.isPositiveNumber(s)){
                temp.add(s);
            }
        }
        return temp.size() == args.size();
    }
}
