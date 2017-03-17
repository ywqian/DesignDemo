package com.android.demo.design.proxy;

/**
 * 项目名称：DesignDemo
 * 包名称： com.android.demo.design.proxy
 * 类描述： 被追求者对象-某女孩
 * author: yuwenqian
 * 创建时间：2017/2/15
 */
public class Girl {

    private String name;

    public Girl() {}

    public Girl(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
