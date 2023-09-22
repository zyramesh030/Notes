package com.example.notes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AddFolderRVAdapter(val textList: ArrayList<FolderNameModel>) : RecyclerView.Adapter<AddFolderRVAdapter.MyViewHolder>() {


    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        lateinit var name: TextView

        init {
            name = itemView.findViewById(R.id.add_folder_name)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.add_folders_item, parent,false)
        return MyViewHolder(v)

    }

    override fun onBindViewHolder(holder: AddFolderRVAdapter.MyViewHolder, position: Int) {
        holder.name.setText(textList[position].folderName)
    }

    override fun getItemCount(): Int {
        return textList.size
    }

}