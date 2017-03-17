package com.android.demo.design.decorator;

import android.util.Log;

/**
 * 项目名称：DesignDemo
 * 包名称： com.android.demo.design.decorator
 * 类描述： 装饰的基类：衣服对象
 * author: yuwenqian
 * 创建时间：2017/2/15
 */
public abstract class Clothes extends Person {

    private Person person;
    private String clothesName;

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getClothesName() {
        return clothesName;
    }

    public void setClothesName(String clothesName) {
        this.clothesName = clothesName;
    }

    @Override
    public void show() {
        if (person != null) {
            person.show();
        }
    }
}
