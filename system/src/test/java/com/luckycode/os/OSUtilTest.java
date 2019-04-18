package com.luckycode.os;

import org.junit.Test;

public class OSUtilTest {

    @Test
    public void getPidTest() throws InterruptedException {
        System.out.println(OSUtil.getPid());
        Thread.sleep(10000);
    }

}
