package com.android.demo.design.proxy;

/**
 * 项目名称：DesignDemo
 * 包名称： com.android.demo.design.proxy
 * 类描述： 代理对象：代理追求者 追 女孩
 * author: yuwenqian
 * 创建时间：2017/2/15
 */
public class Proxy implements GiveGift {

    /**
     * 含有被代理的对象：追求者
     */
    private Pursuer pursuer;

    public Proxy(Girl girl) {
        pursuer = new Pursuer(girl.getName());
    }


    @Override
    public String giveDoll() {
        return pursuer.giveDoll();
    }

    @Override
    public String giveChocolate() {
        return pursuer.giveChocolate();
    }

    @Override
    public String giveFlowers() {
        return pursuer.giveFlowers();
    }
}
