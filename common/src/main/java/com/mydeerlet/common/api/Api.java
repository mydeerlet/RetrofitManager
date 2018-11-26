package com.mydeerlet.common.api;


import com.mydeerlet.common.Constant;


/**
 *
 * base_url 请求地址
 */

public final class Api {

    public static final String BASE_URL;

    static {
        if (Constant.DEBUG_MODE){
            BASE_URL = "http://wthrcdn.etouch.cn/";
        } else {
            BASE_URL = "http://wthrcdn.etouch.cn/";
        }
    }
}
