package com.yy.customedrawable

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.noober.background.BackgroundLibrary

/**
 * Created by andy on 2020/11/11.
 */
open class BaseActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        BackgroundLibrary.inject(this)
        super.onCreate(savedInstanceState)

    }
}