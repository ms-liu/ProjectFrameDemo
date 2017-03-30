package com.mmyz.mvc.m;

import android.util.Base64;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * ==============================================
 * <p>
 * 类名：
 * <p>
 * 作者：M-Liu
 * <p>
 * 时间：2017/3/30
 * <p>
 * 邮箱：ms_liu163@163.com
 * <p>
 * ==============================================
 */

public class MvcModel {
    public String explain ="MVC中的View对应的是Layout布局文件，受限于Layout本身，只能做的简单布局；所以在使用MVC" +
            "的过程中，往往会发现Activity内部的代码非常臃肿，既具需要做大量事件的分发，还需要改变UI，有时需要操作数据，" +
            "耦合程度非常高，很难测试，更加难以维护";
    public String name ;
    public String password ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        try {
            MessageDigest md5= MessageDigest.getInstance("MD5");
            this.password = new BigInteger(1, md5.digest(password.getBytes())).toString(16);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

    }
}
