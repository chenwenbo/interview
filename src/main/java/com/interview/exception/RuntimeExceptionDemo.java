package com.interview.exception;


import org.apache.log4j.Logger;

public class RuntimeExceptionDemo {
    private static final Logger logger = Logger.getLogger(RuntimeExceptionDemo.class);

    public static void main(String[] args) {
        int arrs[] = {1, 2, 3};
        try {
            int a = arrs[3];
        } catch (Exception e) {
            logger.error("arrays over", e);
        }
    }

}
