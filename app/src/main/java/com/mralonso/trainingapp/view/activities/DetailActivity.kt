package com.mralonso.trainingapp.view.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.mralonso.trainingapp.R
import com.mralonso.trainingapp.model.Item
import com.mralonso.trainingapp.presenter.DetailPresenter
import com.mralonso.trainingapp.utils.loadUrl
import com.mralonso.trainingapp.view.viewInterfaces.DetailView
import kotlinx.android.synthetic.main.activity_detail.*

/**
 * Created by miguel.rodriguez on 7/4/17.
 */

class DetailActivity : AppCompatActivity(), DetailView {

    val presenter: DetailPresenter = DetailPresenter(this)

    companion object {
        val EXTRA_ID = "DetailActivity:id"
    }

    //region AppCompatActivity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        presenter.startShowing(intent)
    }

    //endregion AppCompatActivity

    //region DetailView

    override fun showItemDetail(item: Item) {
        if(item!=null){
            item_image.loadUrl(item.url)
            item_title.text = item.title
        }
    }

    //endregion DetailView
}
