package com.mralonso.trainingapp.presenter

import com.mralonso.trainingapp.model.getItems
import com.mralonso.trainingapp.view.viewInterfaces.DetailView

/**
 * Created by miguel on 9/4/17.
 */
class DetailPresenter(val view: DetailView) {

    fun startShowingWithId(id: Long){

        val item = getItems().firstOrNull { it.id == id }

        view.showItemDetail(item)
    }
}