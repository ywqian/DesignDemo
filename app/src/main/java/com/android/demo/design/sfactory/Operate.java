package com.android.demo.design.sfactory;

import java.io.Serializable;

/**
 * 项目名称：DesignDemo
 * 包名称： com.android.demo.design.sfactory.bean
 * 类描述：
 * author: yuwenqian
 * 创建时间：2017/2/14
 */
public abstract class Operate {

    private double numberA;
    private double numberB;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    public abstract double operate();
}
