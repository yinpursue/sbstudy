package com.example.sbstudy.result;

public class ResultVO<T> {
    private int code;
    private String message;
    private T t;

    public ResultVO() {
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getT() {
        return t;
    }

    public ResultVO(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResultVO(int code, String message, T t) {
        this.code = code;
        this.message = message;
        this.t = t;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setT(T t) {
        this.t = t;
    }

}
