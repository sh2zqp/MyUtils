package com.zjut.myutils;

import android.content.Context;

/**
 * Created by ScienceHistory on 16/5/17.
 * dp与px互转的工具类
 * dp(dip):设备独立像素，与像素密度(dpi)密切相关。dp是一种与设备无关的单位，它可以保障一套UI在不同机器上面上适配，
 * 而显示效果不会出现很大偏差。
 * px:像素，1px代表屏幕上的一个物理像素点。
 * 160dpi：1dp ＝ 1px；320dpi：1dp ＝ 2pdx
 */

public class DensityUtil {
    /**
     * 根据手机的分辨率从dip的单位转换成为像素px
     */
    public static int dip2px(Context context,float dpValue) {
        try {
            final float scale = context.getResources().getDisplayMetrics().density;
            return (int) (dpValue*scale+0.5f); //强制类型转换是直接舍去小数位，此处加上0.5是为了进行四舍五入
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (int) dpValue;
    }

    /**
     * 根据手机的分辨率从像素px转换为单位dip
     */
    public static int px2dip(Context context,float pxValue) {
        try {
            final float scale = context.getResources().getDisplayMetrics().density;
            return (int) (pxValue/scale+0.5f); //强制类型转换是直接舍去小数位，此处加上0.5是为了进行四舍五入
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (int) pxValue;
    }
}

