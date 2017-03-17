package com.android.demo.design.decorator;

import android.util.Log;

/**
 * 项目名称：DesignDemo
 * 包名称： com.android.demo.design.decorator
 * 类描述： 被装饰类：人对象
 * author: yuwenqian
 * 创建时间：2017/2/15
 */
public class Person {

    private String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }


    public void show() {
        Log.e("ywq", "被装饰的人：" + name);
    }
}
