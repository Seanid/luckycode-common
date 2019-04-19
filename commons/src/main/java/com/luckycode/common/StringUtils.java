package com.luckycode.common;

import java.util.Random;

/**
 * 常用的字符串操作工具类
 * @ClassName StringUtils
 * @Author sean
 * @DATE 2019/4/1
 * @Version 1.0
 **/
public class StringUtils {

    //随机数粒度
    private static int RANDOM_BIT=32;

    //字符数组
    private static char[] str = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };


    private StringUtils(){/*不可实例化该类*/}



    /**
     * 判断对象是否为空
     * @return
     *
     * isEmpty("") true
     * isEmpty(null) true
     *
     *
     */
    public static  boolean isEmpty(Object object){
        return object==null||"".equals(object);
    }


    /**
     * 判断字符串是否为空
     * isBlank("") true
     * isBlank(null) true
     * isBlank(" ")  true
     * @param string
     * @return
     *

     *
     */
    public static boolean isBlank(String string){
        //先判断是否为空和字符串长度
        if (string==null||string.length()==0||("null").equals(string)){
            return true;
        }
        //去空格再判断一次
        if (string.trim().length()==0){
            return true;
        }
        //循环再判断一次
        for (int i=0;i<string.length();i++){
            if (Character.isWhitespace(string.charAt(i))==false){
                return false;
            }
        }
        return true;
    }


    /**
     * 返回32位随机字符串
     * @author Sean
     * @return
     */
    public static String getRandomString(){
        return getRandomString(RANDOM_BIT);
    }

    /**
     * 返回指定位数的随机字符串
     * @author Sean
     * @param bit	指定多少位
     * @return
     */
    public static String getRandomString(int bit){
        StringBuffer sb=new StringBuffer();
        Random random=new Random();
        for (int i = 0; i < bit; i++) {
            char tmp=str[random.nextInt(str.length)];
            sb.append(tmp);
        }
        return sb.toString();
    }


}
