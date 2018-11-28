package com.mydeerlet.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;

import com.mydeerlet.common.Constant;
import com.mydeerlet.common.base.BaseActivity;

public class MainActivity extends BaseActivity {


    @SuppressLint("CheckResult")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //初始化
        Constant.getInstance().init(this,true,
                true,"http://wthrcdn.etouch.cn/");

//
//        RetrofitManager.getInstance(this)
//                .create(Service.class)
//                .getMessage("北京")
//                .compose(this.<UpdateModel>scheduleSingle())
//                .subscribe(new Consumer<UpdateModel>() {
//                    @Override
//                    public void accept(UpdateModel updateModel) throws Exception {
//                        LogUtils.i("aaa",updateModel.getData().getGanmao());
//                    }
//                },new RxException<Throwable>());
//
//
//        Log.i("aaa",Constant.BASE_URL);
    }

    @Override
    public View needOffSet() {
        return null;
    }
}
