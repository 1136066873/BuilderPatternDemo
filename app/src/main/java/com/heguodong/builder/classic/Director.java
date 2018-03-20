package com.heguodong.builder.classic;

/**
 * Created by 何国栋 on 2018/3/20.
 *
 *
 */

public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public Director createCookies(){ //???
        this.builder.setShap();
        return this;
    }

    public Cookies getCookies(){
        return this.builder.getCookie();
    }

}
