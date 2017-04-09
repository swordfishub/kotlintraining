package com.mralonso.trainingapp.view.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import com.mralonso.trainingapp.R
import com.mralonso.trainingapp.model.getItems
import com.mralonso.trainingapp.navigation.Navigator
import com.mralonso.trainingapp.presenter.ListPresenter
import com.mralonso.trainingapp.view.adapters.ItemAdapter
import com.mralonso.trainingapp.view.viewInterfaces.ListView
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by miguel.rodriguez on 7/4/17.
 */

class ListActivity : AppCompatActivity(), ListView {

    val presenter: ListPresenter = ListPresenter(this)
    val navigator = Navigator(this)

    private fun init() {
        list.layoutManager = GridLayoutManager(this, 2)
        list.adapter = ItemAdapter { (id) -> presenter.itemSelected(id) }
    }

    //region AppCompatActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        presenter.startShowing()
    }

    //endregion AppCompatActivity

    //region ListView

    override fun showItemDetail(id: Long) {
        navigator.goToDetail(id)
    }

    override fun showItems() {
        if(list.adapter is ItemAdapter){
            (list.adapter as ItemAdapter).addItems(getItems())
        }
    }

    //endregion ListView
}
