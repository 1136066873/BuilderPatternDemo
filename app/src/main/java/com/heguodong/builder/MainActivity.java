package com.heguodong.builder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.heguodong.builder.classic.Cookies;
import com.heguodong.builder.classic.Director;
import com.heguodong.builder.classic.RoundCookiesBuilder;
import com.heguodong.builder.classic.SquareCookiesBuilder;
import com.heguodong.builder.variant.Person;


/**
 *
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tv_classic ,tv_variant;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_classic = findViewById(R.id.tv_classic);
        tv_variant = findViewById(R.id.tv_variant);
        tv_classic.setOnClickListener(this);
        tv_variant.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_classic :
                //使用经典 builder 模式创建对象，解决的问题主要是啥？
                //经典的Builder模式重点在于抽象出对象创建的步骤，并通过调用不同的具体实现类从而得到不同的结果
                //(new Director(new SquareCookiesBuilder()).createCookies())
                Cookies squareCookies = new Director(new SquareCookiesBuilder()).createCookies().getCookies();
                Log.e("heguodong"," squareCookies ==> " + squareCookies.toString());
                Cookies roundCookies = new Director(new RoundCookiesBuilder()).createCookies().getCookies();
                Log.e("heguodong"," roundCookies ==> " + roundCookies.toString());



                break;
            case R.id.tv_variant :
                //使用变种的 builder 模式创建对象，解决的主要问题是啥？
                //变种的Builder模式的目的在于减少对象创建过程中引入的多个重载构造函数，可选参数以及setters过度使用导致的不必要的复杂性
                Person.Builder builder = new Person.Builder();
                Person person = builder.name("张三")
                                        .age(16)
                                        .height(180.00)
                                        .weight(180.00)
                                        .build();
                Log.e("heguodong"," person ==> " + person.toString());
                break;
        }
    }
}
