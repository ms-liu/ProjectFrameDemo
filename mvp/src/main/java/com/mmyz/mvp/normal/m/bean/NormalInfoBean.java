package com.mmyz.mvp.normal.m.bean;

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

public class NormalInfoBean {
    public String explain ="这是一个普通MVP结构的案例，M与V之间不交互，P与V通过定义接口进行交互，达到控显数据目的，" +
            "但是当应对数据业务相对复杂的项目或者业务时，有可能会导致P层业务处理逻辑过重，代码过多，结构不清晰，不易于维护";
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
