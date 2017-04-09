package com.mralonso.trainingapp.model

/**
 * Created by miguel.rodriguez on 7/4/17.
 */

data class Item(val id: Long, val title:String, val url:String)

fun getItems(): List<Item>{
    return (1..10).map { Item(it.toLong(), "Title $it", "http://lorempixel.com/400/400/cats/$it/") }
}