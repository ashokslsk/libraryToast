package com.ashokslsk.librarytest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ashokslsk.helloworld.TestToast;

public class MainActivity extends AppCompatActivity {

    TestToast Check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Check = new TestToast(getApplicationContext(),"Hellow World");
    }
}
