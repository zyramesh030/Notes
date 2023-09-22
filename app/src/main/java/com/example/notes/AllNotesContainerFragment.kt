package com.example.notes

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class AllNotesContainerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_all_notes_container, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val allNotesRV: RecyclerView = view.findViewById(R.id.all_notes_rv)
        allNotesRV.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        val notesList: ArrayList<AllNotesModel> = ArrayList()

        val note1 = AllNotesModel("Hello")
        val note2 = AllNotesModel("I am Ramesh")
        val note3 = AllNotesModel("I am building a Notes App")
        val note4 = AllNotesModel("This is a clone app of Notes App by Xiaomi")
        val note5 = AllNotesModel("I am trying to add everything what Xiaomi did")
        val note6 = AllNotesModel("But it is taking more time than I expected")
        val note7 = AllNotesModel("Please keep supporting me")
        val note8 = AllNotesModel("!!Thank You!!")
        val note9 = AllNotesModel("See you on the next episode!")

        notesList.add(note1)
        notesList.add(note2)
        notesList.add(note3)
        notesList.add(note4)
        notesList.add(note5)
        notesList.add(note6)
        notesList.add(note7)
        notesList.add(note8)
        notesList.add(note9)

        val allNotesRVAdapter: AllNotesRVAdapter = AllNotesRVAdapter(notesList)
        allNotesRV.adapter = allNotesRVAdapter

    }

}