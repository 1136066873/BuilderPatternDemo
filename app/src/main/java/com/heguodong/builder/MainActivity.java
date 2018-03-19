package com.heguodong.builder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


/**
 *定义：
 *建造者模式：将一个复杂的对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 *
 *实用范围
 *1、当创建复杂对象的算法应该独立于该对象的组成部分以及它们的装配方式时。
 *2、当构造过程必须允许被构造的对象有不同表示时。
 *
 *角色
 *在这样的设计模式中，有以下几个角色：
 *1、Builder：为创建一个产品对象的各个部件指定抽象接口。
 *2、ConcreteBuilder：实现Builder的接口以构造和装配该产品的各个部件，定义并明确它所创
 *   建的表示，并提供一个检索产品的接口。
 *3、Director：构造一个使用Builder接口的对象，指导构建过程。
 *4、Product：表示被构造的复杂对象。ConcreteBuilder创建该产品的内部表示并定义它的装配
 *   过程，包含定义组成部件的类，包括将这些部件装配成最终产品的接口。
 *http://blog.csdn.net/jason0539/article/details/44992733
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
