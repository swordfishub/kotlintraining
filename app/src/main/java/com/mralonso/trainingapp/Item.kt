package com.mralonso.trainingapp

fun getItems(): List<Item>{
    return (1..10).map { Item(it.toLong(), "Title $it", "http://lorempixel.com/400/400/cats/$it/")}
}

/**
 * Created by miguel.rodriguez on 7/4/17.
 */
data class Item(val id: Long, val title:String, val url:String)