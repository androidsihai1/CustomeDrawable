package com.yy.customedrawable;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.noober.background.drawable.DrawableCreator;


/**
 * Created by andy on 2020/11/17.
 */
public class ThreeActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        //方式1 ,颜色变化
        TextView tv = findViewById(R.id.test_view1);
        tv.setClickable(true);
        ColorStateList colors = new DrawableCreator.Builder().setPressedTextColor(Color.RED
        ).setUnPressedTextColor(Color.BLUE).buildTextColor();
        tv.setTextColor(colors);

        //方式1
        Button btn1 = findViewById(R.id.button_view1);
        Drawable build = new DrawableCreator.Builder().setCornersRadius(180).setSolidColor(
                Color.parseColor("#ff00ff")).setPressedSolidColor(Color.parseColor(
                "#ff0000"), Color.parseColor("#00ff00")).setSelectedTextColor(Color.parseColor("#8935ff")).build();
        btn1.setBackground(build);

        //方式2  注册factory2，xml直接使用自定义属性


        //方式3 自定义控件，加上自定义属性
    }
}
