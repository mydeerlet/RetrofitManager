package com.mydeerlet.common.utlis;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;


public class SPUtils {
    private static SharedPreferences sp;
    public static String PREF_COOKIES = "cookie";

    public static synchronized SharedPreferences getInstance(Context context){
        if (sp == null){
            sp = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        }
        return sp;
    }
}
