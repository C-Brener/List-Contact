package com.ciandt.listadecontatos.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ciandt.listadecontatos.data.model.ContactInfo
import com.ciandt.listadecontatos.databinding.ActivityMainBinding
import com.ciandt.listadecontatos.ui.recyclerview.adapter.ListContactAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding.listView) {
            layoutManager = LinearLayoutManager(this@MainActivity, RecyclerView.VERTICAL, false)
            adapter = ListContactAdapter(getContacts())
        }

    }

    fun getContacts(): List<ContactInfo> {
        return listOf<ContactInfo>(
            ContactInfo("Caique", "1684866816"),
            ContactInfo("Caique", "1684866816"),
            ContactInfo("Caique", "1684866816"),
            ContactInfo("Caique", "1684866816"),
            ContactInfo("Caique", "1684866816"),
            ContactInfo("Caique", "1684866816"),
            ContactInfo("Caique", "1684866816"),
            ContactInfo("Caique", "1684866816"),
        )
    }

}