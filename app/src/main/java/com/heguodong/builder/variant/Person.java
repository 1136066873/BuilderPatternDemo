package com.heguodong.builder.variant;

/**
 * Created by 何国栋 on 2018/3/20.
 *
 * Android builder 模式
 *
 * reference http://blog.csdn.net/jie1991liu/article/details/49640725
 *
 * 从代码可以看出：
 1.Person类的构造函数是私有的。这样就不能直接实例化这个类
 2.Person类是不可变的。里面的属性都是final的。只能在构造函数中初始化。然后提供了属性的get函数，可以去获取值。
 3.连贯性，这个Person的创建是：
 new Person.Builder().name("青蛙ing").gender("男").age("20").build();
 作者：青蛙要fly
 链接：https://www.jianshu.com/p/1ddb69f1f67e
 */

public class Person {

    private final  String name ;

    private final  int age ;

    private final double height ;

    private final double weight ;

    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.height = builder.height;
        this.weight = builder.weight;
    }

/*    public Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }*/

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public static class Builder {

        private String name ;

        private int age ;

        private double height ;

        private double weight ;

        public Builder name(String name){
            this.name = name ;
            return this;
        }

        public Builder age(int age){
            this.age = age ;
            return this;
        }

        public Builder height(double height){
            this.height = height ;
            return this;
        }

        public Builder weight(double weight){
            this.weight = weight ;
            return this;
        }

        public Person build(){
            return new Person(this);
        }
    }
}
