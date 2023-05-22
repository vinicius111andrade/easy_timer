package com.vdemelo.easytimer.sdk

import android.view.View

fun View.visible() {
    visibility = View.VISIBLE
}

fun View.invisible() {
    visibility = View.INVISIBLE
}

fun View.gone() {
    visibility = View.GONE
}

val View.isVisible: Boolean
    get() = visibility == View.VISIBLE

fun View.isVisibleMethod(): Boolean {
    return visibility == View.VISIBLE
}

fun View.isNotVisible(): Boolean {
    return visibility != View.VISIBLE
}
