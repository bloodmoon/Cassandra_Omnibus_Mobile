package com.example.cassandraomnibusmobile.ui.fragment

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.cassandraomnibusmobile.R

class GeneralInfoFragment : Fragment(), View.OnClickListener {
    companion object {
        fun newInstance() = GeneralInfoFragment()
    }

    private lateinit var tView: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val v = inflater.inflate(R.layout.gen_info_layout, container, false)

        tView = v.findViewById(R.id.patch_notes_tview)

        tView.setOnClickListener(this)

        return v
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.patch_notes_tview ->{
                //Display patch notes fragment
                //Grey out the color of the text a bit maybe to represent click
            }
        }
    }
}