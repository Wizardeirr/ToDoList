package com.volkankelleci.newday.Views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.get
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.volkankelleci.newday.R
import com.volkankelleci.newday.ViewModel.HomeFragmentViewModel
import com.volkankelleci.newday.adapter.RecyclerAdapter
import kotlinx.android.synthetic.main.fragment_ekleme.*
import kotlinx.android.synthetic.main.fragment_home.*

class EklemeFragment : Fragment() {

    private lateinit var viewModel:HomeFragmentViewModel
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

        viewModel=ViewModelProviders.of(this).get(HomeFragmentViewModel::class.java)
        viewModel.refreshData()
        yapilacaklarListesiRecycler.layoutManager=LinearLayoutManager(context)
        yapilacaklarListesiRecycler.adapter=yapilacaklarRecyclerAdapter

        observeLiveData()

    }
    fun observeLiveData(){

        viewModel.yapilacaklarListesi.observe(viewLifecycleOwner, Observer {
            it?.let {
                yapilacaklarRecyclerAdapter.verileriGuncelle(it)
            }
        })
    }



}