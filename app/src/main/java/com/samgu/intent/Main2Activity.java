package com.samgu.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView txtinfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txtinfo = findViewById(R.id.txtinfo);

        // 第一種寫法
//        Bundle bundle = getIntent().getExtras();//從bundle 去 Intent裡抓取資料
//        String name = bundle.getString("name");//從bundle裡去抓取放入的資料,key要對
//        int age = bundle.getInt("age");
//        String[] list = bundle.getStringArray("namelist");
//        txtinfo.setText(name + "-" + age + "-" + list[1]); //都抓取完後即可利用


        //第二種 用Intent 快速傳遞資料
        Intent it = getIntent(); //抓取Intent
        String sex = it.getStringExtra("sex");//需告字串sex 從Intent抓取字串getStringExtra("key")
        int height = it.getIntExtra("height", 0);//int 有default值
        txtinfo.setText(sex + "-" + height);
    }
}
