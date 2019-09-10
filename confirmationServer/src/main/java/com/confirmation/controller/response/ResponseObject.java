package com.confirmation.controller.response;



import java.text.MessageFormat;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.support.RequestContext;

public class ResponseObject {

    String code;

    Object data;

    String msg;

    public static ResponseObject generateSuccessResponse() {
        ResponseObject result = new ResponseObject();
        result.setCode(ResultCode.SUCCESS.getCode());
        return result;
    }

    public static ResponseObject generateSuccessResponse(Object data) {
        ResponseObject result = new ResponseObject();
        result.setCode(ResultCode.SUCCESS.getCode());
        result.setData(data);
        return result;
    }
   
    public static ResponseObject generateFailResponse(ResultCode resultCode,Object... args) {
        HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
        RequestContext requestContext = new RequestContext(request);
      
        String code = resultCode.getCode();
        String msg = requestContext.getMessage(code);
        if (StringUtils.isNotBlank(msg) && args != null && args.length>0) {
            msg = MessageFormat.format(msg, args);
        }
        ResponseObject result = new ResponseObject();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
    
    public static ResponseObject generateFailResponse(ResultCode resultCodes) {
        return generateFailResponse(resultCodes,null);
    }
    
    public static ResponseObject generateFailResponse() {
        return  generateFailResponse(ResultCode.UNKOWN_ERROR);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String message) {
        this.msg = message;
    }

}
