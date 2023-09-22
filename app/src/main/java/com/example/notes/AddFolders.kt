package com.example.notes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AddFolders : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_folders)
        val textList: ArrayList<FolderNameModel> =ArrayList()
        val str = "Folder"

        for(i in 1..2) {
            val fname = FolderNameModel(str+i.toString())

            textList.add(fname)
        }

        val uncat = FolderNameModel("Uncategorized")
        textList.add(uncat)

        val rv = findViewById<RecyclerView>(R.id.add_folders)
        rv.layoutManager = LinearLayoutManager(applicationContext,LinearLayoutManager.VERTICAL,false)
        val adapter = AddFolderRVAdapter(textList)
        rv.adapter = adapter
    }
}