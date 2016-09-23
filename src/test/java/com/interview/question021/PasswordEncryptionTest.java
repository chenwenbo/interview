package com.interview.question021;

import org.junit.Test;

import java.security.NoSuchAlgorithmException;

/**
 * 第 0021 题： 通常，登陆某个网站或者 APP，需要使用用户名和密码。密码是如何加密后存储起来的呢？请使用 Python 对密码加密。
 */
public class PasswordEncryptionTest {

    @Test
    public void md5EncryptionTest() throws NoSuchAlgorithmException {
        System.out.println(Encryption.md5Encryption("password"));
    }
}