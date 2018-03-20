package com.heguodong.builder.classic;

/**
 * Created by 何国栋 on 2018/3/20.
 *
 * 经典的Builder模式重点在于抽象出对象创建的步骤，
 * 并通过调用不同的具体实现类从而得到不同的结果
 *
 * 经典Buider模式：Builder:抽象接口。
 */

public interface Builder {

    void setShap();

    Cookies getCookie();
}
