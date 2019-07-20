package com.samgu.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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
//        btn03.setOnClickListener(btn03Lin);
//        btn04.setOnClickListener(btn04Lin);
//        btn05.setOnClickListener(btn05Lin);
//        btn06.setOnClickListener(btn06Lin);

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

        }
    };


}
