package com.stu.buoi4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    private final String default_account[] = {"Admin", "admin"};
    TextView twStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        twStatus = findViewById(R.id.twStatus);

        Intent myIntent = getIntent();
        String username = myIntent.getStringExtra("username");
        String password = myIntent.getStringExtra("password");

        if(default_account[0].equals(username) && default_account[1].equals(password)){
            twStatus.setText("Đăng Nhập Thành Công");
        }else{
            twStatus.setText("Đăng Nhập Thất Bại");
        }
    }
}