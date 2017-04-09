package com.mralonso.trainingapp.utils

import android.content.Context
import android.widget.Toast

/**
 * Created by miguel.rodriguez on 9/4/17.
 */

fun Context.toast(text:CharSequence, length:Int = Toast.LENGTH_SHORT){
    Toast.makeText(this, text, length).show()
}
