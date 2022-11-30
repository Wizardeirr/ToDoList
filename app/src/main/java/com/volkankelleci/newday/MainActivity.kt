package com.volkankelleci.newday

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import java.time.Duration


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val menuInflater=menuInflater
        menuInflater.inflate(R.menu.bottom_menu,menu)
        return super.onCreateOptionsMenu(menu)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId==R.id.eklemeTusu){
            val action=HomeFragmentDirections.actionHomeFragmentToEklemeFragment2()
            Navigation.findNavController(this,R.id.fragmentContainerView).navigate(action)
        }
        if(item.itemId==R.id.evTusu){
            val action=HomeFragmentDirections.actionHomeFragmentSelf2()
            Navigation.findNavController(this,R.id.fragmentContainerView).navigate(action)
        }

        if(item.itemId==R.id.yapilacaklarTusu){
            val action=HomeFragmentDirections.actionHomeFragmentToYapilacaklarFragment()
            Navigation.findNavController(this,R.id.fragmentContainerView).navigate(action)

        }

            return super.onOptionsItemSelected(item)
        }


    }
