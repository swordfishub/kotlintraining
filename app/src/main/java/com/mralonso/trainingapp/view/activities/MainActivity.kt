package com.mralonso.trainingapp.view.activities

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import com.mralonso.trainingapp.R
import com.mralonso.trainingapp.model.getItems
import com.mralonso.trainingapp.view.activities.DetailActivity
import com.mralonso.trainingapp.view.adapters.ItemAdapter
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by miguel.rodriguez on 7/4/17.
 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list.layoutManager = GridLayoutManager(this, 2)
        list.adapter = ItemAdapter(getItems()){ item ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(DetailActivity.EXTRA_ID, item.id)
            startActivity(intent)
        }

    }
}
