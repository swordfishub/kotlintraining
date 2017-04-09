package com.mralonso.trainingapp.view.activities

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import com.mralonso.trainingapp.R
import com.mralonso.trainingapp.model.getItems
import com.mralonso.trainingapp.presenter.MainPresenter
import com.mralonso.trainingapp.view.activities.DetailActivity
import com.mralonso.trainingapp.view.adapters.ItemAdapter
import com.mralonso.trainingapp.view.viewInterfaces.MainView
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by miguel.rodriguez on 7/4/17.
 */

class MainActivity : AppCompatActivity(), MainView {

    val presenter: MainPresenter = MainPresenter(this)

    //region AppCompatActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        presenter.startShowing()
    }

    private fun init() {
        list.layoutManager = GridLayoutManager(this, 2)
        list.adapter = ItemAdapter { (id) -> presenter.itemSelected(id) }
    }

    //endregion AppCompatActivity

    //region MainView

    override fun goToDetail(id: Long) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra(DetailActivity.EXTRA_ID, id)
        startActivity(intent)
    }

    override fun showItems() {
        if(list.adapter is ItemAdapter){
            (list.adapter as ItemAdapter).addItems(getItems())
        }
    }

    //endregion MainView
}
