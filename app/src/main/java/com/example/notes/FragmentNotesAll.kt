package com.example.notes

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.FragmentTransaction
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
        val frag: Fragment = AllNotesContainerFragment()

        val frTrans : FragmentTransaction = parentFragmentManager.beginTransaction()

        frTrans.replace(
            R.id.all_notes_container, frag).commit()

        val folderImg: ImageView = view.findViewById(R.id.folder_icon)
        folderImg.setOnClickListener(View.OnClickListener {
            val intent: Intent = Intent(context,AddFolders::class.java)
            startActivity(intent)
        })

        val tv: TextView = view.findViewById(R.id.text_all)
        tv.setOnClickListener(View.OnClickListener {
            val frag: Fragment = AllNotesContainerFragment()

            val frTrans : FragmentTransaction = parentFragmentManager.beginTransaction()

            frTrans.replace(
                R.id.all_notes_container, frag).commit()
        })

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