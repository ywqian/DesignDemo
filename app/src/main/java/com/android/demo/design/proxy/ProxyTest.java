package com.android.demo.design.proxy;

/**
 * 项目名称：DesignDemo
 * 包名称： com.android.demo.design.proxy
 * 类描述： 代理模式测试类
 * author: yuwenqian
 * 创建时间：2017/2/15
 */
public class ProxyTest {

    public static void main(String[] args) {

        Girl girl = new Girl("娇娇");

        Proxy proxy = new Proxy(girl);
//        proxy.giveFlowers();
//        proxy.giveDoll();
//        proxy.giveChocolate();

        System.out.println(proxy.giveFlowers() + " " + proxy.giveDoll() + " " + proxy.giveChocolate());

    }
}
