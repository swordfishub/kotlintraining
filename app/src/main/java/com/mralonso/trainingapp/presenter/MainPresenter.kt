package com.mralonso.trainingapp.presenter

import com.mralonso.trainingapp.view.viewInterfaces.MainView

/**
 * Created by miguel on 9/4/17.
 */
class MainPresenter(val view: MainView) {

    fun startShowing(){
        view.showItems()
    }

    fun itemSelected(id: Long){
        view.goToDetail(id)
    }
}