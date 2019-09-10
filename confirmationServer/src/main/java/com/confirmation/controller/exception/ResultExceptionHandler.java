package com.confirmation.controller.exception;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.confirmation.controller.response.ResponseObject;
import com.confirmation.controller.response.ResultCode;

@ControllerAdvice
public class ResultExceptionHandler {

    private final static Logger logger = LoggerFactory.getLogger(ResultExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResponseObject handle(Exception e) {
        
        if (e instanceof ResultException) {
            ResultException msgException = (ResultException)e;
            return ResponseObject.generateFailResponse(msgException.getMessageCode(), msgException.getArgs());
        } else if (e instanceof NumberFormatException) {
            return ResponseObject.generateFailResponse(ResultCode.NUMBER_FORMAT_ERROR);
        } else {
            logger.error("system error ", e);
            return ResponseObject.generateFailResponse(ResultCode.UNKOWN_ERROR);
        }
    }
}
