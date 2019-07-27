package com.samgu.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn01, btn02, btn03, btn04, btn05, btn06;
    EditText content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();


    }

    private void findViews() {
        btn01 = findViewById(R.id.btn01);
        btn02 = findViewById(R.id.btn02);
        btn03 = findViewById(R.id.btn03);
        btn04 = findViewById(R.id.btn04);
        btn05 = findViewById(R.id.btn05);
        btn06 = findViewById(R.id.btn06);
        content = findViewById(R.id.content);

        btn01.setOnClickListener(btn01Lin);
        btn02.setOnClickListener(btn02Lin);
        btn03.setOnClickListener(btn03Lin);
        btn04.setOnClickListener(btn04Lin);
        btn05.setOnClickListener(btn05Lin);
        btn06.setOnClickListener(btn06Lin);

    }


    private Button.OnClickListener btn01Lin = new Button.OnClickListener() {
        public void onClick(View view) {
            Intent it = new Intent(); //new Intent(MainActivity.this, Main2Activity.class) 另一種寫法
            it.setClass(MainActivity.this, Main2Activity.class);
            startActivity(it); //開始Activity (it)
        }
    };

    private Button.OnClickListener btn02Lin = new Button.OnClickListener() {
        public void onClick(View view) {
//第一種寫法
            /*
            Intent it = new Intent(getApplicationContext(), Main2Activity.class);
            Bundle bundle = new Bundle();//打包資料
            bundle.putString("name", "Sam");//放入資料(Key,Value)
            bundle.putInt("age", 20);
            String[] data = {"Sam", "Gu", "Tammy", "John"};
            bundle.putStringArray("namelist", data);
            it.putExtras(bundle);//把打包好的bundle放入 it傳送
            startActivity(it);
*/
            //第二種 用Intent 快速傳遞資料
            Intent it = new Intent(getApplicationContext(), Main2Activity.class);
            Bundle bundle = new Bundle();
            it.putExtra("sex", "男"); //透過Intent 直接putExtra (Key,Value)
            it.putExtra("height", 20);
            startActivity(it);


        }
    };


    private Button.OnClickListener btn03Lin = new Button.OnClickListener() {
        public void onClick(View view) {

        }
    };


    private Button.OnClickListener btn04Lin = new Button.OnClickListener() {
        public void onClick(View view) {

        }
    };


    private Button.OnClickListener btn05Lin = new Button.OnClickListener() {
        public void onClick(View view) {

        }
    };


    private Button.OnClickListener btn06Lin = new Button.OnClickListener() {
        public void onClick(View view) {

        }
    };

}
