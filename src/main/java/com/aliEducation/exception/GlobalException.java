package com.aliEducation.exception;

public class GlobalException extends RuntimeException {

    private String msg;

    public GlobalException(String msg){
        super(msg);
        this.msg = msg;
    }

    @Override
    public String getMessage(){
        return msg;
    }
}
