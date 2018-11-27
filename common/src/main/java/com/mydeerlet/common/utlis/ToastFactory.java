package com.mydeerlet.common.utlis;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

/**
 * toast 工具类
 */
public class ToastFactory {

    private static Context context = null;
    private static Toast toast = null;

    public static Toast getToast(Context context, String text) {
        if (ToastFactory.context == context) {
            // toast.cancel();
            toast.setText(text);
            toast.setDuration(Toast.LENGTH_SHORT);
        } else {
            ToastFactory.context = context.getApplicationContext();
            toast = Toast.makeText(context.getApplicationContext(), text, Toast.LENGTH_SHORT);
        }
        toast.setGravity(Gravity.CENTER,0,0);
        return toast;
    }

    public static void cancelToast() {
        if (toast != null) {
            toast.cancel();
        }
    }
}
