package com.android.demo.design.proxy;

/**
 * 项目名称：DesignDemo
 * 包名称： com.android.demo.design.proxy
 * 类描述： 追求者对象
 * author: yuwenqian
 * 创建时间：2017/2/15
 */
public class Pursuer implements GiveGift {

    private String name;

    public Pursuer(String name) {
        this.name = name;
    }

    @Override
    public String giveDoll() {
        return "送" + name + "洋娃娃";
    }

    @Override
    public String giveChocolate() {
        return "送" + name + "巧克力";
    }

    @Override
    public String giveFlowers() {
        return "送" + name + "鲜花";
    }
}
