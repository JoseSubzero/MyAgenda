package com.example.myagenda.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.myagenda.Contacts
import com.example.myagenda.databinding.ContactItemBinding

class ContactsViewHolder (view: View): RecyclerView.ViewHolder(view) {
    val binding = ContactItemBinding.bind(view)
    fun render(contactModel: Contacts){
        binding.tvName.text = contactModel.name
        binding.tvSurname.text = contactModel.surname
        binding.tvEmail.text = contactModel.email
        binding.tvPhone.text = contactModel.phone
    }
}