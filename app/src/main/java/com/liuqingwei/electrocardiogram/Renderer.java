package com.liuqingwei.electrocardiogram;

import android.graphics.Color;
import android.graphics.Typeface;

import java.io.Serializable;

/**
 * 心率图渲染器类
 * Created by Meteoral.Liu On MacOS
 * User: Meteoral
 * Date: 14-10-10
 * WebSite: http://www.liuqingwei.com
 * QQ: 120599662
 */
public class Renderer implements Serializable{
    /** 表格标题 */
    private String ECGChartLabel = "";
    /** 是否显示标题 */
    private boolean ECGShowLabel = false;
    /** 表格字体 */
    private float ECGChartTextSize = 24;
    /** 没有颜色值 */
    public static final int NO_COLOR = 0;
    /** 默认背景颜色-灰白色 */
    public static final int BACKGROUND_COLOR = 0xFFF0F0F0;
    /** 默认字体颜色 */
    public static final int TEXT_COLOR = Color.BLACK;
    /** 建立一个普通的字体样式 */
    private static final Typeface REGULAR_TEXT_FONT = Typeface
            .create(Typeface.SERIF, Typeface.NORMAL);
    /** 字体名 */
    private String ECGTextTypefaceName = REGULAR_TEXT_FONT.toString();
    /** 字体样式 */
    private int ECGTextTypefaceStyle = Typeface.NORMAL;
    /** 字体typeface */
    private Typeface ECGTextTypeface;
    /** 表格的背景颜色 */
    private int ECGBackgroundColor;
    /** 坐标轴是否可见 */
    private boolean ECGShowAxes = true;
    /** 坐标轴颜色 */
    private int ECGAxesColor = Color.RED;
    /** 坐标标签是否可见 */
    private int ECGLineStep = 1;
    /** 设置表格是否可滑动翻页 */
    private boolean ECGScrollable = true;

    /**
     * 获取表格标题
     * @return 返回表格标题
     */
    public String getECGChartLabel() {
        return ECGChartLabel;
    }

    /**
     * 设置表格标题
     * @param ECGChartLabel 字符串 表格标题
     */
    public void setECGChartLabel(String ECGChartLabel) {
        this.ECGChartLabel = ECGChartLabel;
    }

    /**
     * 获取表格标题字体大小
     * @return 返回表格标题字体大小
     */
    public float getECGChartTextSize() {
        return ECGChartTextSize;
    }

    /**
     * 设置表格标题字体大小
     * @param ECGChartTextSize 字体大小
     */
    public void setECGChartTextSize(float ECGChartTextSize) {
        this.ECGChartTextSize = ECGChartTextSize;
    }

    /**
     * 获取表格标题字体样式
     * @return 返回表格标题字体样式
     */
    public static Typeface getRegularTextFont() {
        return REGULAR_TEXT_FONT;
    }

    /**
     * 获取表格标题字体样式名称
     * @return 返回样式名称
     */
    public String getECGTextTypefaceName() {
        return ECGTextTypefaceName;
    }

    /**
     * 设置表格标题字体样式
     * @param ECGTextTypefaceName 字体样式名
     */
    public void setECGTextTypefaceName(String ECGTextTypefaceName) {
        this.ECGTextTypefaceName = ECGTextTypefaceName;
    }

    /**
     * 获取表格FaceStyle
     * @return FaceStyle
     */
    public int getECGTextTypefaceStyle() {
        return ECGTextTypefaceStyle;
    }

    /**
     * 设置表格FaceStyle
     * @param ECGTextTypefaceStyle Facestyle属性
     */
    public void setECGTextTypefaceStyle(int ECGTextTypefaceStyle) {
        this.ECGTextTypefaceStyle = ECGTextTypefaceStyle;
    }

    /**
     * 获取表格背景横纵轴直线的颜色
     * @return 返回颜色值
     */
    public int getECGAxesColor() {
        return ECGAxesColor;
    }

    /**
     * 设置表格背景横纵轴直线的颜色
     * @param ECGAxesColor 需设置的颜色值
     */
    public void setECGAxesColor(int ECGAxesColor) {
        this.ECGAxesColor = ECGAxesColor;
    }

    /**
     * 获取表格主背景色
     * @return 返回背景色值
     */
    public int getECGBackgroundColor() {
        return ECGBackgroundColor;
    }

    /**
     * 设置表格主背景色
     * @param ECGBackgroundColor 需设置的背景色值
     */
    public void setECGBackgroundColor(int ECGBackgroundColor) {
        this.ECGBackgroundColor = ECGBackgroundColor;
    }

    /**
     * 获取字体Tyepface
     * @return 字体的Tyepface
     */
    public Typeface getECGTextTypeface() {
        return ECGTextTypeface;
    }

    /**
     * 设置字体的Typeface
     * @param ECGTextTypeface 字体Typeface
     */
    public void setECGTextTypeface(Typeface ECGTextTypeface) {
        this.ECGTextTypeface = ECGTextTypeface;
    }

    /**
     * 是否显示背景的横纵轴
     * @return true显示，false不显示
     */
    public boolean isECGShowAxes() {
        return ECGShowAxes;
    }

    /**
     * 设置是否显示背景的横纵轴
     * @param ECGShowAxes true显示，false不显示
     */
    public void setECGShowAxes(boolean ECGShowAxes) {
        this.ECGShowAxes = ECGShowAxes;
    }

    /**
     * 获取表格中数据的步进值
     * @return 步进值大小
     */
    public int getECGLineStep() {
        return ECGLineStep;
    }

    /**
     * 设置表格中数据的步进值
     * 步进值越大，表格中数据绘制越快，绘制的质量越低
     * 步进值越小，表格中数据绘制越慢，绘制越精细
     * @param ECGLineStep 步进值，最小为1.最大为10
     */
    public void setECGLineStep(int ECGLineStep) {
        if(ECGLineStep<1) ECGLineStep=1;
        if(ECGLineStep>10) ECGLineStep=10;
        this.ECGLineStep = ECGLineStep;
    }

    /**
     * 查询表格是否可以左右滑动加载数据
     * @return true可滑动加载，false不可滑动加载
     */
    public boolean isECGScrollable() {
        return ECGScrollable;
    }

    /**
     * 设置表格左右滑动加载数据开关
     * @param ECGScrollable true可滑动加载数据，false不可滑动加载数据
     */
    public void setECGScrollable(boolean ECGScrollable) {
        this.ECGScrollable = ECGScrollable;
    }

    /**
     * 是否显示表格的标题
     * @return true显示表格标题，false不显示表格标题
     */
    public boolean isECGShowLabel() {
        return ECGShowLabel;
    }

    /**
     * 设置是否显示表格的标题
     * @param ECGShowLabel true显示表格标题，false不显示表格标题
     */
    public void setECGShowLabel(boolean ECGShowLabel) {
        this.ECGShowLabel = ECGShowLabel;
    }
}
