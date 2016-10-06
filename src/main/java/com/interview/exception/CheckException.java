package com.interview.exception;

import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class CheckException {

    private static Logger logger = Logger.getLogger(CheckException.class);

    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("user/aa.txt");
        } catch (FileNotFoundException e) {
            logger.error("not found file", e);
        }

    }
}
