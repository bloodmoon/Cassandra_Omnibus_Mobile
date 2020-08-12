package com.example.cassandraomnibusmobile.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.cassandraomnibusmobile.R


/**
 *  Adapted from: Phillips, Stewart, and Marsicano, Big Nerd Ranch Guide to Android Development, 3rd ed.
 */

abstract class SingleFragmentActivity : AppCompatActivity() {

    abstract fun createFrag():Fragment

    private fun getLayoutResId():Int{return R.layout.single_fragment_activity
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(getLayoutResId())

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, createFrag())
                .commit()
        }
    }
}
