package com.mydeerlet.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.mydeerlet.common.api.RetrofitManager;
import com.mydeerlet.common.api.RxException;
import com.mydeerlet.common.base.BaseActivity;

import io.reactivex.functions.Consumer;

public class MainActivity extends BaseActivity {


    @SuppressLint("CheckResult")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        StatusBarUtil.setDarkMode(MainActivity.this);
//        StatusBarUtil.setColor(MainActivity.this, ContextCompat.getColor(MainActivity.this,R.color.colorAccent),0);



        RetrofitManager.getInstance(this)
                .create(Service.class)
                .getMessage("北京")
                .compose(this.<UpdateModel>scheduleSingle())
                .subscribe(new Consumer<UpdateModel>() {
                    @Override
                    public void accept(UpdateModel updateModel) throws Exception {
                        Log.e("TAG", "response == " +  updateModel.getData().getGanmao());
                    }
                },new RxException<Throwable>());
    }
    @Override
    public View needOffSet() {
        return null;
    }
}
