package com.lzw.javalibrary;

import android.content.Context;

/**
 * 描述：
 *  资源工具类
 */
public class ResourcesUtils {
    /**
     * 获取状态栏高度
     * @return 状态栏高度
     */
    public static int getStatusBarHeight(Context context) {
        //获取status_bar_height资源的ID
        int resourceId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            //根据资源ID获取响应的尺寸值
            return context.getResources().getDimensionPixelSize(resourceId);
        } else {
            return dip2px(context,40f);
        }
    }

    /**
     * dp 转 px(像素)
     */
    public static int dip2px(Context context, Float dpValue) {
        float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

    /**
     * px(像素) 的单位 转 dp
     */
    public static int px2dip(Context context, Float pxValue) {
        float scale = context.getResources().getDisplayMetrics().density;
        return (int) (pxValue / scale + 0.5f);
    }
}
