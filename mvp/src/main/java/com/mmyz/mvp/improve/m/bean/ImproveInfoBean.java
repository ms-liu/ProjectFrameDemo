package com.mmyz.mvp.improve.m.bean;

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

public class ImproveInfoBean {
    public String explain =
            "相较于普通的MVP架构，这是一个增强型的MVP架构，可以更加贴合并满足业务相对较重的项目，实际开发的需求，" +
            "在这个MVP的架构中，增加了对于V生命周期的管理，同时在V和P之间增加了代理层Proxy，相对减轻了P层业务处理任务，" +
            "在面对业务相对复杂的项目或者页面时，让P层代码更加轻量，更加便于维护，同时存在生命周期的管控，可以" +
            "避免一些由于View的生命周期发生改变，从而引发的BUG";
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
