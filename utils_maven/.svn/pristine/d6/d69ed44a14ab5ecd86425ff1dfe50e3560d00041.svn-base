package com.itcast.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * 工具类
 */
public class Utils {

    public static String toStr(Date date,String time){

        SimpleDateFormat format1=new SimpleDateFormat(time);
        String format = format1.format(date);
        return  format;
    }


    public static Date toDate(String s,String geshi) throws ParseException {

        SimpleDateFormat format=new SimpleDateFormat(geshi);
        Date parse = format.parse(s);

        return  parse;
    }
}
