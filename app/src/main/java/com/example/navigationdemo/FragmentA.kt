package com.example.navigationdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import kotlinx.android.synthetic.main.fragment_a.*

class FragmentA : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_a,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        btnToB.setOnClickListener { view ->
            view.findNavController().navigate(FragmentADirections.actionFragmentAToFragmentB())
        }

        btnToC.setOnClickListener {view->
            view.findNavController().navigate(FragmentADirections.actionFragmentAToFragmentC())
        }
    }
}