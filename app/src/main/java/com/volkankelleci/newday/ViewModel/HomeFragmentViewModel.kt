package com.volkankelleci.newday.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.volkankelleci.newday.Model.toDoList

class HomeFragmentViewModel: ViewModel() {
    val yapilacaklarListesi= MutableLiveData<List<toDoList>>()

    fun refreshData(){
        val yapilacak1=toDoList("BANYOYA GİRİLECEK","www.bombabomba.com")
        val yapilacak2=toDoList("Sebze Alinacak","www.tombis.com")
        val yapilacak3=toDoList("Markete Git","www.ponpis.com")
        val yapilacaklar= arrayListOf<toDoList>(yapilacak1,yapilacak2,yapilacak3)


        yapilacaklarListesi.value=yapilacaklar
    }

}