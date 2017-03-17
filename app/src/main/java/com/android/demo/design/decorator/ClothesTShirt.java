package com.android.demo.design.decorator;

import android.util.Log;

/**
 * 项目名称：DesignDemo
 * 包名称： com.android.demo.design.decorator
 * 类描述： 具体的装饰对象：T恤衫
 * author: yuwenqian
 * 创建时间：2017/2/15
 */
public class ClothesTShirt extends Clothes {


    @Override
    public void show() {
        super.show();
        Log.e("ywq", "T恤衫");
    }
}
