package com.bp.mall.util;

/**
 * @Author yipeng
 * @Date 2020/10/9 14:14
 * @Version 1.0
 * @Desc 响应类
 */
public class BusinessResponse<T> {
    public static final int RESPONSE_OK = 0;
    public static final int RESPONSE_ERROR = 500000;
    public static final int RESPONSE_PARA_ERROR = 400003;

    private int code = 500000;
    private String message = null;
    private T data = null;

    public BusinessResponse() {
        this.code = RESPONSE_OK;
        this.message = "";
    }

    public boolean success() {
        return code == RESPONSE_OK;
    }

    public static BusinessResponse ok(Object data) {
        BusinessResponse<Object> response = new BusinessResponse();
        response.setData(data);
        response.setCode(RESPONSE_OK);
        response.setMessage("success");
        return response;
    }

    public static BusinessResponse fail(int code, String msg) {
        BusinessResponse response = new BusinessResponse();
        response.setCode(code);
        response.setMessage(msg);
        return response;
    }

    public int getCode() {
        return code;
    }

    public BusinessResponse setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public BusinessResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public T getData() {
        return data;
    }

    public BusinessResponse setData(T data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "BusinessResponse [code=" + code + ", message=" + message + ", data=" + data + "]";
    }
}

