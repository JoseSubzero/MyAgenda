package com.example.myagenda.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myagenda.ContactProvider.Companion.ContactList
import com.example.myagenda.Contacts
import com.example.myagenda.R

class ContactAdapter (private val contactList: List<Contacts>) : RecyclerView.Adapter<ContactsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ContactsViewHolder(layoutInflater.inflate(R.layout.contact_item, parent, false))
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        val item = ContactList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = ContactList.size
}