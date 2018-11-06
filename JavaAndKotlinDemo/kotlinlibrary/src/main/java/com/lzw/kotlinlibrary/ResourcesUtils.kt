package com.lzw.kotlinlibrary

import android.content.Context

/**
 * 描述：
 * 资源工具类
 */
class ResourcesUtils {

    // 伴生对象   这里面包裹的方法  实际上类似于java的静态方法
    companion object {
        /**
         * 获取状态栏高度
         * @return 状态栏高度
         */
        fun getStatusBarHeight(context: Context): Int {
            //获取status_bar_height资源的ID
            val resourceId = context.resources.getIdentifier("status_bar_height", "dimen", "android")
            return if (resourceId > 0) {
                //根据资源ID获取响应的尺寸值
                context.resources.getDimensionPixelSize(resourceId)
            } else {
                dip2px(context, 40f)
            }
        }

        /**
         * dp 转 px(像素)
         */
        fun dip2px(context: Context, dpValue: Float?): Int {
            val scale = context.resources.displayMetrics.density
            return (dpValue!! * scale + 0.5f).toInt()
        }

        /**
         * px(像素) 的单位 转 dp
         */
        fun px2dip(context: Context, pxValue: Float?): Int {
            val scale = context.resources.displayMetrics.density
            return (pxValue!! / scale + 0.5f).toInt()
        }

    }

}
