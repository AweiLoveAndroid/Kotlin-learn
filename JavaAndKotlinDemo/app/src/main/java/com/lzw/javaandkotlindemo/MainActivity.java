package com.lzw.javaandkotlindemo;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.lzw.javaandkotlindemo.util.ResourcesUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init(this);
    }

    private void init(Context context) {
        int statusBarHeight = ResourcesUtils.Companion.getStatusBarHeight(context);
        Toast.makeText(context, "状态栏高度为：" + statusBarHeight + "像素",Toast.LENGTH_SHORT).show();
    }
}
