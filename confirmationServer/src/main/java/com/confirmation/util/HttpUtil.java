package com.confirmation.util;





import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

public class HttpUtil {

    public static String sentPost(String url, Map param) throws Exception {
        return sentPost(url,null, param);
    }
    public static String sentPost(String url, Map header, Map param) throws Exception {
        HttpPost post = new HttpPost(url);

        if (header != null) {
            Iterator it = header.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry)it.next();
                post.addHeader((String)entry.getKey(), entry.getValue().toString());
            }
        }
        // 添加参数
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        Iterator it = param.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry)it.next();

            String paramName = (String)entry.getKey();
            Object value = (Object)entry.getValue();
            String vsValue = null;
            if (value == null) {
                vsValue = "";
            } else {
                vsValue = value.toString();
            }
            params.add(new BasicNameValuePair(paramName, vsValue));
        }

        post.setEntity(new UrlEncodedFormEntity(params, HTTP.UTF_8));
        post.addHeader("Content-Type", "application/x-www-form-urlencoded");
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            HttpResponse response = httpclient.execute(post);
            String result = EntityUtils.toString(response.getEntity(), "utf-8");
            return result;

        } finally {
            httpclient.close();
        }
    }
    public static String sentJsonPost(String url,String body) throws Exception {
        return sentJsonPost(url,null, body);
    }
    
    public static String sentJsonPost(String url,Map header, String body) throws Exception {
        HttpPost post = new HttpPost(url);
        if (header != null) {
            Iterator it = header.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry)it.next();
                post.addHeader((String)entry.getKey(), entry.getValue().toString());
            }
        }
        if (body != null) {
            StringEntity stringEntity = new StringEntity(body, "utf-8");// param参数，可以为"key1=value1&key2=value2"的一串字符串
            stringEntity.setContentType("application/json");
            stringEntity.setContentEncoding("utf-8");
            post.setEntity(stringEntity);
        }
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            HttpResponse response = httpclient.execute(post);

            HttpEntity entity = response.getEntity();
            if (entity == null) {
                return null;
            }
            String result = EntityUtils.toString(response.getEntity(), "utf-8");
            return result;

        } finally {
            httpclient.close();
        }
    }

    public static String sentStringParamPost(String url, String body) throws Exception {
        return sentStringParamPost(url,null,body);
    }
    public static String sentStringParamPost(String url, Map<String,String> header,String body) throws Exception {
        HttpPost post = new HttpPost(url);
        if (header != null) {
            Iterator it = header.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry)it.next();
                post.addHeader((String)entry.getKey(), entry.getValue().toString());
            }
        }
        if (body != null) {
            StringEntity stringEntity = new StringEntity(body, "utf-8");// param参数，可以为"key1=value1&key2=value2"的一串字符串
            stringEntity.setContentType("application/x-www-form-urlencoded");
            stringEntity.setContentEncoding("utf-8");
            post.setEntity(stringEntity);
        }
        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            HttpResponse response = httpclient.execute(post);

            HttpEntity entity = response.getEntity();
            if (entity == null) {
                return null;
            }
            String result = EntityUtils.toString(response.getEntity(), "utf-8");
            return result;

        } finally {
            httpclient.close();
        }
    }

    public static String sentGet(String url) throws Exception {
        HttpGet get = new HttpGet(url);

        CloseableHttpClient httpclient = HttpClients.createDefault();
        try {
            HttpResponse response = httpclient.execute(get);
            if (response.getStatusLine().getStatusCode() == 200) {
                String result = EntityUtils.toString(response.getEntity(), "utf-8");
                return result;
            } else {
                throw new Exception(EntityUtils.toString(response.getEntity(), "utf-8"));
            }
        } finally {
            httpclient.close();
        }
    }
}
