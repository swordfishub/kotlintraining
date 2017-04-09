package com.mralonso.trainingapp.presenter

import android.content.Intent
import com.mralonso.trainingapp.model.getItems
import com.mralonso.trainingapp.view.activities.DetailActivity
import com.mralonso.trainingapp.view.viewInterfaces.DetailView

/**
 * Created by miguel on 9/4/17.
 */
class DetailPresenter(val view: DetailView) {

    val UNDEFINED_ID: Long = -1

    fun startShowing(intent: Intent){

        val id = intent.getLongExtra(DetailActivity.EXTRA_ID, UNDEFINED_ID)

        val item = getItems().firstOrNull { it.id == id }

        if (item != null) {
            view.showItemDetail(item)
        }
    }
}