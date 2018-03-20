package com.heguodong.builder.classic;

/**
 * Created by 何国栋 on 2018/3/20.
 *
 * 经典Buider模式：Product:被构造的复杂对象。
 */

public class Cookies {

    private String shape ;

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Cookies{" +
                "shape='" + shape + '\'' +
                '}';
    }
}
