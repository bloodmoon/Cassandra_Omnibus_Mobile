package com.example.cassandraomnibusmobile.ui.fragment

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.cassandraomnibusmobile.R

class SplashFragment : Fragment(){
    companion object {
        fun newInstance() = SplashFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.splash_layout, container, false)
    }

    override fun onStart() {
        super.onStart()
        val waitTime:Long = 1250
        Handler().postDelayed({
            activity?.finish()
            startActivity(Intent("com.example.cassandraomnibusmobile.ui.HOME"))
        }, waitTime)
    }
}