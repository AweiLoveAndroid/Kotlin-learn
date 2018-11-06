package com.lzw.kotlinandjavademo

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast

// 我们把lib库里面的导包去掉 换成本包名里面的对应文件
//import com.lzw.javalibrary.ResourcesUtils
import com.lzw.kotlinandjavademo.util.ResourcesUtils


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init(this)
    }

    fun init(context: Context) {
        val statusBarHeight = ResourcesUtils.getStatusBarHeight(context)
        Toast.makeText(context, "状态栏高度为：$statusBarHeight 像素", Toast.LENGTH_SHORT).show()
        Log.e("tag", "状态栏高度为：$statusBarHeight 像素")// 110 px
    }
}