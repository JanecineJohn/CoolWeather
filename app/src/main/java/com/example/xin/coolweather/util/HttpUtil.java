package com.example.xin.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by xin on 2017/8/1.
 */

public class HttpUtil {
    //发起一条HTTP请求只需要调用此方法，传入请求地址，注册一个回调来处理服务器响应
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
