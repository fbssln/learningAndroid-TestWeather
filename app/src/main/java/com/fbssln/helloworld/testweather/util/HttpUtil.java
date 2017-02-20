package com.fbssln.helloworld.testweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by dev7-fub on 2017/2/20.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
