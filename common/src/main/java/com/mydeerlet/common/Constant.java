
package com.mydeerlet.common;

import android.content.Context;

public final class Constant {

    private static Constant constant;

    public static boolean DEBUG_MODE = true;  //调试debug_mode
    public static boolean DEBUG_MODE_LOG = true; //debugLog
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
     * 在appcation 中初始化
     * @param context
     */
    public void init(Context context){
        this.context = context;

    }

    public Context getContext(){
            return context;
        }
}
