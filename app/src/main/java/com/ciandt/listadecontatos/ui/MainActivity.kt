package com.ciandt.listadecontatos.ui

import android.app.Person
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.ciandt.listadecontatos.R
import com.ciandt.listadecontatos.data.model.ContactInfo
import com.ciandt.listadecontatos.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val recycler = binding.listView

        with(recycler){
            layoutManager = LinearLayoutManager(this@MainActivity, RecyclerView.VERTICAL, false)
            setHasFixedSize(true)
            adapter = com.ciandt.listadecontatos.ui.recyclerview.adapter.ListAdapter(getContact())
        }
    }

    private fun getContact():List<ContactInfo>{
        return listOf<ContactInfo>(
            ContactInfo("Caique","111111111"),
            ContactInfo("Lorena","222222222"),
            ContactInfo("Lorena","222222222"),
            ContactInfo("Lorena","222222222"),
            ContactInfo("Lorena","222222222"),
        )
    }
}