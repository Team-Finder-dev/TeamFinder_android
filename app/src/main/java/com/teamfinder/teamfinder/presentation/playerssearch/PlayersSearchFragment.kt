package com.teamfinder.teamfinder.presentation.playerssearch

import android.view.View
import android.widget.AdapterView
import android.widget.Spinner
import androidx.fragment.app.viewModels
import com.teamfinder.teamfinder.R
import com.teamfinder.teamfinder.base.BaseFragment
import com.teamfinder.teamfinder.databinding.FragmentPlayersSearchBinding
import com.teamfinder.teamfinder.presentation.playerssearch.adapters.CustomArrayAdapter

class PlayersSearchFragment :
    BaseFragment<FragmentPlayersSearchBinding, PlayersSearchViewModel>(FragmentPlayersSearchBinding::inflate) {
    override val viewModel by viewModels<PlayersSearchViewModel>()


    override fun initViews() {
        super.initViews()
        initSpinners()
    }

    private fun initSpinners() = with(binding) {
        initSpinner(resources.getStringArray(R.array.sport_type), spinnerSportType)
    }

    private fun initSpinner(stringArray: Array<String>, spinner: Spinner) {
        val adapter =
            CustomArrayAdapter(requireContext(), R.layout.item_dropdown_spinner, stringArray)
        spinner.adapter = adapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                if (position > 0) {
                    viewModel.filterData()
                } else {
                    viewModel.showData()
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>?) = Unit
        }
    }

    private fun searchInputListener() = Unit

}