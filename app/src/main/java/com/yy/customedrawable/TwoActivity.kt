package com.yy.customedrawable

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import androidx.fragment.app.FragmentActivity
import kotlinx.android.synthetic.main.activity_two.*

/**
 * Created by andy on 2020/11/11.
 */
class TwoActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        LayoutInflater.from(this).factory2 = object : LayoutInflater.Factory2 {
            override fun onCreateView(
                parent: View?,
                name: String,
                context: Context,
                attrs: AttributeSet
            ): View? {
                var view: View? = null
                if (name == "Button") {
                    view = Button(baseContext)
                    val typeArray =
                        context.obtainStyledAttributes(attrs, R.styleable.CustomeDrawable)
                    val radius =
                        typeArray.getDimension(R.styleable.CustomeDrawable_corner_radius, 0f)
                    val color = typeArray.getString(R.styleable.CustomeDrawable_my_color)

                    if (radius > 0) {
                        val drawable = GradientDrawable()
                        drawable.cornerRadius = radius
                        color?.let {
                            drawable.setColor((Color.parseColor(color)))
                        }
                        view?.background = drawable
                    }
                    typeArray.recycle()
                }

                return view
            }

            override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
                return null;
            }

        }
        setContentView(R.layout.activity_two)
        tv_app_compat?.setOnClickListener {
            startActivity(Intent(baseContext, ThreeActivity::class.java))
        }
    }

}