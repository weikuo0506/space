package com.walker.space.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by wk on 2015/12/12.
 */
public class IDUtil {
    private static  final AtomicInteger ATOMICINTEGER = new AtomicInteger();
    public static long generateID(String tableId){
        StringBuffer codeSB = new StringBuffer(tableId);
        codeSB.append(new SimpleDateFormat("yyMMddHHmmss").format(new Date()));
        codeSB.append("000");
        long code = Long.parseLong(codeSB.toString());
        code += ATOMICINTEGER.incrementAndGet();
        return code;
    }
}
