package com.android.demo.design.sfactory;

import android.widget.Toast;

import com.android.demo.design.MainActivity;

/**
 * 项目名称：DesignDemo
 * 包名称： com.android.demo.design.sfactory
 * 类描述：
 * author: yuwenqian
 * 创建时间：2017/2/14
 */
public class OperationFactory {

    public static Operate createOperate(String operate) {

        Operate o = null;

        switch (operate) {
            case "+":
                o = new OperateAdd();
                break;
            case "-":
                o = new OperateSub();
                break;
            case "*":
                o = new OperateMul();
                break;
            case "/":
                o = new OperateDiv();
                break;
        }

        return o;
    }

}
