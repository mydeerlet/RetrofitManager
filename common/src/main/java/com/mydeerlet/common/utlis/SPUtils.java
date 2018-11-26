package com.mydeerlet.common.utlis;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;

import com.google.gson.Gson;
import com.mydeerlet.common.bean.User;


/**
 * Created by ray_L_Pain on 2017/7/29.
 */

public class SPUtils {
    private static SharedPreferences sp;
    public static String PREF_COOKIES = "cookie";
    public static String UPGRADE = "upgrade";
    public static String DOT = "dot";
    public static synchronized SharedPreferences getInstance(Context context){
        if (sp == null){
            sp = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        }
        return sp;
    }

    public static String getString(Context context, String key){
        return getInstance(context).getString(key,"");
    }

    public static void putString(Context context, String key, String value){
        getInstance(context).edit().putString(key,value).commit();
    }

    public static boolean getBoolean(Context context, String key){
        return getInstance(context).getBoolean(key,false);
    }

    public static  boolean exists(Context context, String key){
        return getInstance(context).contains(key) && !TextUtils.isEmpty(getString(context,key));
    }

    public static User getCurrentUser(Context context){
        //取数据
        if (exists(context,"user")){
            Gson gson = new Gson();
            User user = gson.fromJson(getString(context,"user"),User.class);
            return user;
        }
        return null;
    }

    public static void setCurrentUser(Context context, User user){
        //存放数据
        if (!TextUtils.isEmpty(user.getUserid())){
            Gson gson = new Gson();
            String json = gson.toJson(user);
            putString(context,"user",json);
        }
    }

    public static boolean isLogin(Context context){
        return getCurrentUser(context) != null;
    }

    public static void loginOut(Context context){
        getInstance(context).edit().remove("user").commit();
    }

    public static String getUpgrade(Context context){
        if (exists(context,UPGRADE)){
            return getString(context,UPGRADE);
        }
        return null;
    }

    public static void setUpgrade(Context context, String value){
        getInstance(context).edit().putString(UPGRADE,value).commit();
    }

    public static String getDot(Context context){
        if (exists(context,DOT)){
            return getString(context,DOT);
        }
        return null;
    }

    public static void setDot(Context context, String value){
        getInstance(context).edit().putString(DOT,value).commit();
    }
}
