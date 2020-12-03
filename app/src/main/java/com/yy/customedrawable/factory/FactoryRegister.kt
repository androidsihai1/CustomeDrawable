package com.yy.customedrawable.factory

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater

/**
 * Created by andy on 2020/11/11.
 */
object FactoryRegister {

    @JvmStatic
    fun inject(context: Context): LayoutInflater {
        var inflater: LayoutInflater? = null
        inflater = if (context is Activity) {
            context.layoutInflater
        } else {
            LayoutInflater.from(context)
        }
        return inflater
    }
}