package com.rabbit.translation.exception;

/**
 * 自定义错误
 *
 * @Author 廖凡
 * @Date 2020/3/20 17:00
 */
public class TranException extends RuntimeException {
    public TranException() {
        super();
    }

    public TranException(String message) {
        super(message);
    }
}
