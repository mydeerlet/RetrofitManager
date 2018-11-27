
package com.mydeerlet.common;

import android.content.Context;

public final class Constant {

    private static Constant constant;

    public static boolean DEBUG_MODE = false;  //调试debug_mode
    public static boolean DEBUG_MODE_LOG = false; //debugLog
    public static String BASE_URL;   //Retrofit 设置的 baseURL


    private Context context;
    private Constant(){

    }

    public static Constant getInstance(){
        if (constant == null){
            synchronized (Constant.class){
                if (constant == null){
                    constant = new Constant();
                }
            }
        }
        return constant;
    }

    /**
     * 在 appcation 中初始化
     * DEBUG_MODE RetrofitLog是否打印Log  HttpLoggingInterceptor okhttpLog 日志级别为e
     * DEBUG_MODE_LOG LogUtils是否打印Log
     * @param context
     */
    public void init(Context context,boolean DEBUG_MODE, boolean DEBUG_MODE_LOG,String BASE_URL){
        this.context = context;
        Constant.DEBUG_MODE =DEBUG_MODE;
        Constant.DEBUG_MODE_LOG=DEBUG_MODE_LOG;
        Constant.BASE_URL=BASE_URL;
    }

    public Context getContext(){
            return context;
        }
}
