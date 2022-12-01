package com.volkankelleci.newday.Views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.volkankelleci.newday.R
import com.volkankelleci.newday.adapter.RecyclerAdapter
import kotlinx.android.synthetic.main.fragment_ekleme.*
import kotlinx.android.synthetic.main.fragment_home.*

class EklemeFragment : Fragment() {
    private val yapilacaklarRecyclerAdapter=RecyclerAdapter(arrayListOf())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ekleme, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    kaydetButonu.setOnClickListener {
        val action=EklemeFragmentDirections.actionEklemeFragmentToHomeFragment()
        Navigation.findNavController(it).navigate(action)
    }

    }

    }
