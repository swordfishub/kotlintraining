package com.mralonso.trainingapp.view.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.mralonso.trainingapp.R
import com.mralonso.trainingapp.model.getItems
import com.mralonso.trainingapp.utils.loadUrl
import kotlinx.android.synthetic.main.activity_detail.*

/**
 * Created by miguel.rodriguez on 7/4/17.
 */

class DetailActivity : AppCompatActivity() {

    companion object {
        val EXTRA_ID = "DetailActivity:id"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val id = intent.getLongExtra(EXTRA_ID, -1)
        val item = getItems().firstOrNull(){ it.id == id }

        if(item!=null){
            item_image.loadUrl(item.url)
            item_title.text = item.title
        }
    }
}
