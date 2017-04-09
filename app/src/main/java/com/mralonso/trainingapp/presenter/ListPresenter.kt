package com.mralonso.trainingapp.presenter

import com.mralonso.trainingapp.view.viewInterfaces.ListView

/**
 * Created by miguel on 9/4/17.
 */
class ListPresenter(val view: ListView) {

    fun startShowing(){
        view.showItems()
    }

    fun itemSelected(id: Long){
        view.showItemDetail(id)
    }
}