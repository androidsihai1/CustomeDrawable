package com.yy.customedrawable

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        const val TAG = "MainActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        LayoutInflater.from(this).factory2 = object : LayoutInflater.Factory2 {
            override fun onCreateView(
                parent: View?,
                name: String,
                context: Context,
                attrs: AttributeSet
            ): View? {
                Log.i(TAG, "name=$name ")
                val view = this@MainActivity.delegate.createView(parent, name, context, attrs)
                val typeArray =
                    context.obtainStyledAttributes(attrs, R.styleable.CustomeDrawable)
                for (i in 0 until attrs.attributeCount) {
                    Log.i(
                        TAG,
                        " name ${attrs.getAttributeName(i)}   value=${attrs.getAttributeValue(i)}"
                    )
                }
                val radius =
                    typeArray.getDimension(R.styleable.CustomeDrawable_corner_radius, 0f)
                val color = typeArray.getString(R.styleable.CustomeDrawable_my_color)
                if (radius > 0) {
                    val drawable = GradientDrawable()
                    drawable.cornerRadius = radius
                    color?.let {
                        drawable.setColor(Color.parseColor(color))
                    }
                    view?.background = drawable
                }
                typeArray.recycle()
                return view
            }

            override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
                return null;
            }

        }
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_join?.setOnClickListener {
            startActivity(Intent(baseContext, TwoActivity::class.java))
        }
    }
}
