package com.example.testjitpackholder;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.simplejavalib.SimpleJavaLib;
import com.example.simplelib.SimpleUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = findViewById(R.id.tv_hello);
        String newContent = tv.getText()+ SimpleUtils.getStr();
        tv.setText(newContent);
        String s = SimpleJavaLib.getString();
    }
}