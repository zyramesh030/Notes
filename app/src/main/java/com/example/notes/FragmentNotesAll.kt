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
        val str1 = FolderNameModel("zhdgfkj")
        val str2 = FolderNameModel("fhaif")
        val str3 = FolderNameModel("afkjad")
        val str4 = FolderNameModel("ajjhf")
        val str5 = FolderNameModel("aid")
        val str6 = FolderNameModel("IDIs")

        textList.add(str1)
        textList.add(str2)
        textList.add(str3)
        textList.add(str4)
        textList.add(str5)
        textList.add(str6)

        val folderRVAdapter = FolderRVAdapter(textList)
        rv.adapter = folderRVAdapter
    }


}