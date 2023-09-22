package com.example.notes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AllNotesRVAdapter(val notesList: ArrayList<AllNotesModel>):
    RecyclerView.Adapter<AllNotesRVAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        lateinit var noteText: TextView

        init {
            noteText = itemView.findViewById(R.id.note_text)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(
            R.layout.all_notes_item,parent,false)
        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {
        return notesList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.noteText.setText(notesList[position].text)
    }
}