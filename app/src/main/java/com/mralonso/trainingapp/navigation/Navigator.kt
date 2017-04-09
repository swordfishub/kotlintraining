package com.mralonso.trainingapp.navigation

import android.content.Context
import android.content.Intent
import com.mralonso.trainingapp.view.activities.DetailActivity

/**
 * Created by miguel on 9/4/17.
 */
class Navigator(val context: Context) {

    val UNDEFINED_ID: Long = -1

    companion object {
        val EXTRA_ID = "DetailActivity:id"
    }

    fun goToDetail(id: Long){
        val intent = Intent(context, DetailActivity::class.java)
        intent.putExtra(EXTRA_ID, id)
        context.startActivity(intent)
    }

    fun obtainDetailId(intent: Intent) = intent.getLongExtra(Navigator.EXTRA_ID, UNDEFINED_ID)
}