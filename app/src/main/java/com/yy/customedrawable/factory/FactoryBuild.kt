//package com.yy.customedrawable.factory
//
//import android.content.Context
//import android.util.ArrayMap
//import android.util.AttributeSet
//import android.view.LayoutInflater
//import android.view.View
//import com.yy.customedrawable.R
//import java.lang.reflect.Constructor
//
///**
// * Created by andy on 2020/11/11.
// */
//class FactoryBuild : LayoutInflater.Factory2 {
//    lateinit var mViewCreateFactory: LayoutInflater.Factory
//    lateinit var mViewCreateFactory2: LayoutInflater.Factory2
//    var mSConstuctorSignature =
//        arrayListOf(Context::class.java, AttributeSet::class.java)
//    var mConstructorArgs: Map<String, Constructor<out View>> = ArrayMap()
//
//    override fun onCreateView(
//        parent: View?,
//        name: String?,
//        context: Context?,
//        attrs: AttributeSet?
//    ): View? {
//        return onCreateView(name, context, attrs)
//    }
//
//    override fun onCreateView(name: String?, context: Context?, attrs: AttributeSet?): View? {
//        var view: View? = null
//        if (mViewCreateFactory2 != null) {
//            view = mViewCreateFactory2.onCreateView(name, context, attrs)
//        } else if (mViewCreateFactory != null) {
//            view = mViewCreateFactory.onCreateView(name, context, attrs)
//        }
//        return setViewBackground(name, context, attrs, view)
//    }
//
//    fun setViewBackground(
//        name: String?,
//        context: Context?,
//        attrs: AttributeSet?,
//        view: View?
//    ): View? {
//        context?.let {
//            val backGroundAttributes =
//                it.obtainStyledAttributes(attrs, R.styleable.background)
//
//            val pressAttrs =
//                it.obtainStyledAttributes(attrs, R.styleable.background_press)
//
//            if (backGroundAttributes.indexCount == 0 && pressAttrs.indexCount == 0) {
//                return view
//            }
//            var mView = view
//            if (mView == null) {
//                mView = createViewFromTag(context, name, attrs)
//            }
//            if(backGroundAttributes.indexCount > 0) {
//
//            }
//        }
//        return view
//    }
//}