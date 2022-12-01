package com.volkankelleci.newday.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.volkankelleci.newday.R
import com.volkankelleci.newday.adapter.RecyclerAdapter.RecyclerDondurVH
import kotlinx.android.synthetic.main.recycler_raw.view.*

class RecyclerAdapter(val veriListesi: ArrayList<String>) :
    RecyclerView.Adapter<RecyclerDondurVH>() {
    class RecyclerDondurVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerDondurVH {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.recycler_raw, parent, false)
        return RecyclerDondurVH(view)

    }

    override fun onBindViewHolder(holder: RecyclerDondurVH, position: Int) {


    }

    override fun getItemCount(): Int {

        return veriListesi.size
    }
    fun verileriGuncelle(yeniVeriListesi:List<String>){
        veriListesi.clear()
        veriListesi.addAll(yeniVeriListesi)

        notifyDataSetChanged()

    }

}