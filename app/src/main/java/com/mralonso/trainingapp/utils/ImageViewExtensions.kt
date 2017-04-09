package com.mralonso.trainingapp.utils

import android.widget.ImageView
import com.squareup.picasso.Picasso

/**
 * Created by miguel.rodriguez on 7/4/17.
 */

fun ImageView.loadUrl(url: String){
    Picasso.with(context).load(url).into(this)
}