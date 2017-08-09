package com.atguigu.project;

import java.text.SimpleDateFormat;
import java.util.Date;


public class MyStringUtils {

    public static boolean isEmpty(String str){
        if(str==null){
            return true;
        }
        
        if(str.trim().equals("")){
            return true;
        }
        return false;
    }
    
    public static String formatSimpleDate(Date date){
      SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
      return format.format(date);
    }
}
