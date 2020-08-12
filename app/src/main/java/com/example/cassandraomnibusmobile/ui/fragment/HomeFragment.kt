package com.example.cassandraomnibusmobile.ui.fragment

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.cassandraomnibusmobile.R

class HomeFragment : Fragment(), View.OnClickListener {
    companion object {
        fun newInstance() = HomeFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.home_layout, container, false)

        val genInfoButton: Button = v.findViewById(R.id.gen_info_button)

        genInfoButton.setOnClickListener(this)

        return v
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.gen_info_button -> {
                goToActivity(Intent("com.example.cassandraomnibusmobile.ui.GEN_INFO"))
            }
        }
    }


    private fun goToActivity(intent: Intent){
        startActivity(intent)
    }

}