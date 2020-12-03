package com.yy.customedrawable.factory

import android.content.Context
import android.util.ArrayMap
import android.view.View
import java.lang.reflect.Constructor
import java.util.jar.Attributes

/**
 * Created by andy on 2020/11/13.
 */
class Test {
    var sConsturctor = arrayOf(
        Context::class.java,
        Attributes::class.java
    )
    var mMap: Map<String, Constructor<out View?>> =
        ArrayMap()
}