package com.teamfinder.teamfinder.feature.playerssearch.presentation

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.teamfinder.teamfinder.R
import com.teamfinder.teamfinder.feature.playerssearch.presentation.adapters.CharactersAdapter

class BottomSheetFragment(layoutId: Int, private val stringsArr: Array<CharSequence>) :
    BottomSheetDialogFragment(layoutId) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.tv_title).text = stringsArr[0]
        val subArray = stringsArr.sliceArray(1..stringsArr.lastIndex)
        val recyclerView = view.findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = CharactersAdapter(subArray.map { it.toString() })
    }
}