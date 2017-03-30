package com.mmyz.mvp.exception;

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

public class NotBindViewException extends RuntimeException {
    public NotBindViewException(){
        super("% 未绑定IView %");
    }
}
