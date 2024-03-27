package com.teamfinder.teamfinder.feature.playerssearch.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.teamfinder.teamfinder.R
import com.teamfinder.teamfinder.databinding.BottomSheetSingleSelectorBinding
import com.teamfinder.teamfinder.feature.playerssearch.presentation.adapters.CharactersAdapter

class BottomSheetFragment(layoutId: Int, private val stringsArr: Array<CharSequence>) :
    BottomSheetDialogFragment(layoutId) {
    private var _binding: BottomSheetSingleSelectorBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = BottomSheetSingleSelectorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private fun initViews() = with(binding) {
        tvTitle.text = stringsArr[0]
        val subArray = stringsArr.sliceArray(1..stringsArr.lastIndex)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = CharactersAdapter(subArray.map { it.toString() })
    }
}