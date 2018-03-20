package com.heguodong.builder.classic;

/**
 * Created by 何国栋 on 2018/3/20.
 *
 * 经典Buider模式：BuilderImpl:抽象接口的具体实现。
 */

public class SquareCookiesBuilder implements Builder{

    private Cookies cookies;

    public SquareCookiesBuilder() {

        this.cookies = new Cookies();
    }

    @Override
    public void setShap() {
        cookies.setShape("方形");
    }

    @Override
    public Cookies getCookie() {
        return this.cookies;
    }
}
