package com.hazz.kotlinmvp

import android.content.Context
import android.support.v4.app.Fragment
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import java.net.URL

/**
 * Created by xuhao on 2017/11/14.
 */

fun Fragment.showToast(content: String): Toast {
    val toast = Toast.makeText(this.activity, content, Toast.LENGTH_SHORT)
    toast.show()
    return toast
}

fun Context.showToast(content: String): Toast {
    val toast = Toast.makeText(this, content, Toast.LENGTH_SHORT)
    toast.show()
    return toast
}


fun View.dip2px(dipValue: Float): Int {
    val scale = this.resources.displayMetrics.density
    return (dipValue * scale + 0.5f).toInt()
}

fun View.px2dip(pxValue: Float): Int {
    val scale = this.resources.displayMetrics.density
    return (pxValue / scale + 0.5f).toInt()
}

fun durationFormat(duration: Long?): String {
    val minute = duration!! / 60
    val second = duration % 60
    return if (minute <= 9) {
        if (second <= 9) {
            "0${minute}' 0${second}''"
        } else {
            "0${minute}' ${second}''"
        }
    } else {
        if (second <= 9) {
            "${minute}' 0${second}''"
        } else {
            "${minute}' ${second}''"
        }
    }
}




