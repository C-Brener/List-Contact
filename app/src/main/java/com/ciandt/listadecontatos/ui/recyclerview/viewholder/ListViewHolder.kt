package com.ciandt.listadecontatos.ui.recyclerview.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.ciandt.listadecontatos.data.model.ContactInfo
import com.ciandt.listadecontatos.databinding.ItemListBinding

class ListViewHolder(binding: ItemListBinding) : RecyclerView.ViewHolder(binding.root) {

    private val name = binding.nameContact
    private val phone = binding.phoneContact

    fun bindingView(contact:ContactInfo){
        name.text = contact.name
        phone.text = contact.phone
    }
}