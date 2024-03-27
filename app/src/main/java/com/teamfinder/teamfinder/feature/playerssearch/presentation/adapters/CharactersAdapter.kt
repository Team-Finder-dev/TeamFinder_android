package com.teamfinder.teamfinder.feature.playerssearch.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.teamfinder.teamfinder.databinding.ItemCharacterRadiobuttonBinding

class CharactersAdapter(private val characterList: List<String>) :
    RecyclerView.Adapter<CharactersAdapter.CharactersViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharactersViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemCharacterRadiobuttonBinding.inflate(inflater, parent, false)

        return CharactersViewHolder(binding)
    }

    override fun getItemCount(): Int = characterList.size

    override fun onBindViewHolder(holder: CharactersViewHolder, position: Int) {
        holder.bind(characterList[position])
    }

    class CharactersViewHolder(val binding: ItemCharacterRadiobuttonBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(char: String) {
            binding.tvTextItem.text = char
        }
    }
}