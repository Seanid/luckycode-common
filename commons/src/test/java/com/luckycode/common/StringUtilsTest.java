package com.luckycode.common;

import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void isBlankTest(){

        System.out.println(StringUtils.isBlank(""));
        System.out.println(StringUtils.isBlank(" "));
        System.out.println(StringUtils.isBlank(null));
        System.out.println(StringUtils.isBlank(" 测试"));

    }


    @Test
    public void isEmptyTest(){

        System.out.println(StringUtils.isEmpty(""));
        System.out.println(StringUtils.isEmpty(null));
        System.out.println(StringUtils.isBlank("test"));


    }


    @Test
    public void getRandomStringTest(){

        System.out.println(StringUtils.getRandomString());
        System.out.println(StringUtils.getRandomString(64));
    }




}
