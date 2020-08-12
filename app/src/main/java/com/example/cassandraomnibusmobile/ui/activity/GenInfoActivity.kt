package com.example.cassandraomnibusmobile.ui.activity

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.cassandraomnibusmobile.R
import com.example.cassandraomnibusmobile.ui.fragment.GeneralInfoFragment
import com.example.cassandraomnibusmobile.ui.fragment.HomeFragment
import com.example.cassandraomnibusmobile.ui.fragment.SplashFragment

class GenInfoActivity : SingleFragmentActivity() {

    override fun createFrag(): Fragment {
        return GeneralInfoFragment.newInstance()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.single_fragment_activity)
        window.decorView.setBackgroundColor(Color.WHITE);
    }

}