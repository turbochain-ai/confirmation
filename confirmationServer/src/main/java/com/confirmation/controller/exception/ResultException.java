package com.confirmation.controller.exception;



import com.confirmation.controller.response.ResultCode;

public class ResultException extends RuntimeException {

    private ResultCode messageCode;
    private Object[] args;
    
    public ResultException(ResultCode messageCode) {
        this.messageCode = messageCode;
    }
    /**
     * 
     * @param messageCode
     * @param args 用于messageCode中占位符替换
     */
    public ResultException(ResultCode messageCode,Object... args) {
        this.messageCode = messageCode;
        this.args = args;
    }
    
    public ResultCode getMessageCode() {
        return this.messageCode;
    }
    
    public Object[] getArgs() {
        return this.args;
    }
    
    public static void generateResultException(ResultCode messageCode) {
        throw new ResultException(messageCode);
    }
}
