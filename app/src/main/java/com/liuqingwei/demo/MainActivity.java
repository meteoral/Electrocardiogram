package com.liuqingwei.demo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.liuqingwei.electrocardiogram.ChartView;
import com.liuqingwei.electrocardiogram.R;
import com.liuqingwei.electrocardiogram.Renderer;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init() {
        LinearLayout layout=(LinearLayout) findViewById(R.id.root);
        Renderer renderer = new Renderer();
        renderer.setECGShowLabel(true);
        renderer.setECGChartLabel("这是测试的心电图");
        renderer.setECGLineStep(1);
        renderer.setECGScrollable(true);

        ChartView view=new ChartView(this,renderer);
        view.setMinimumHeight(400);
        view.setMinimumWidth(500);

        //通知view组件重绘
        view.invalidate();
        layout.addView(view);
    }
}
