package com.luckycode.os;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.Random;

public class OSUtil {

    private static String PROCESS_PID=null;

    public static final String getPid() {
        if (PROCESS_PID == null) {
            RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
            String processName = runtimeMXBean.getName();
            String pid = null;
            if (processName.indexOf(64) != -1) {
                pid = processName.substring(0, processName.indexOf(64));
            }
            PROCESS_PID = pid;
        }

        return PROCESS_PID;
    }



}
