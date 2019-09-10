package com.confirmation.controller.util;



import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

public class FileUploadUtil {
    
    public static List<Object> readUpLoadFile(HttpServletRequest request) throws IOException {
       // Map dataMap = new HashMap();
    	List<Object> dataList=new ArrayList<Object>();
        // 将当前上下文初始化给 CommonsMutipartResolver （多部分解析器）
        CommonsMultipartResolver multipartResolver =
            new CommonsMultipartResolver(request.getSession().getServletContext());
        if (multipartResolver.isMultipart(request)) {
            // 将request变成多部分request
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest)request;
            Map<String, MultipartFile> fileMap = multiRequest.getFileMap();
            // 循环遍历，取出单个文件
            for (Map.Entry<String, MultipartFile> entity : fileMap.entrySet()) {
                //String key = entity.getKey();
                MultipartFile file = entity.getValue();
                String fileNmae = file.getOriginalFilename();
                byte[] data = file.getBytes();
                dataList.add(new Object[] {fileNmae,data});
                //dataMap.put(key, new Object[] {fileNmae,data});
            }            
            
        }
        return dataList;
    }
}
