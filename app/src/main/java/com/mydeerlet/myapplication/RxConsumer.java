package com.mydeerlet.myapplication;


import com.mydeerlet.common.Constant;
import com.mydeerlet.common.utlis.ToastFactory;

import io.reactivex.functions.Consumer;

public abstract class RxConsumer<T> implements Consumer<HttpResult<T>> {

    @Override
    public void accept(HttpResult<T> tHttpResult) {
        if (tHttpResult.SUCCESS()){
            try {
                onSuccess(tHttpResult.getData());
            } catch (Exception e){
                onError(e.getMessage());
                e.printStackTrace();
            }
        } else {
            onError(tHttpResult.getMsg());
        }
    }

    public abstract void onSuccess(T t);

    public void onError(String msg){
        ToastFactory.getToast(Constant.getInstance().getContext(),msg).show();
    }
}
