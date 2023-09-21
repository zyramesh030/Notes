package com.example.notes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FragmentNotesAll : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_notes_all, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val rv : RecyclerView = view.findViewById(R.id.rv_folders)
        rv.layoutManager = LinearLayoutManager(context,
            LinearLayoutManager.HORIZONTAL, false
        )

        val  textList : ArrayList<FolderNameModel> = ArrayList()
        val str = "Folder"


        for(i in 1..10) {
            val fname = FolderNameModel(str+i.toString())
            textList.add(fname)
        }

        val uncat = FolderNameModel("Uncategorized")
        textList.add(uncat)

        val folderRVAdapter = FolderRVAdapter(textList)
        rv.adapter = folderRVAdapter
    }


}