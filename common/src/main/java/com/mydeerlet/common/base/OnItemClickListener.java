package com.mydeerlet.common.base;

import android.view.View;

public interface OnItemClickListener<T> {

    void onClick(View view, int position, T data);
}
