package com.mralonso.trainingapp.utils

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by miguel on 9/4/17.
 */

fun ViewGroup.inflate(layoutRes: Int): View {
    return LayoutInflater.from(context).inflate(layoutRes, this, false)
}
