package com.eduardo.fonseca.testyape.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.eduardo.fonseca.model.entity.Recipe
import com.eduardo.fonseca.testyape.databinding.ItemRecipeBinding

class RecipeAdapter(var recipes: ArrayList<Recipe>) :
    RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder>() {
    var onItemClick: ((Recipe) -> Unit)? = null

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): RecipeViewHolder {
        return RecipeViewHolder(ItemRecipeBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false))
    }

    override fun onBindViewHolder(pvh: RecipeViewHolder, position: Int) {
        with(pvh) {
            val item = recipes[position]
            binding.name.text = item.name
            Glide.with(binding.root).load(item.image).into(binding.image)
            binding.item.setOnClickListener { onItemClick?.invoke(item) }
        }
    }

    override fun getItemCount() = recipes.size

    fun updateItemList(newRecipes: ArrayList<Recipe>) {
        recipes = (newRecipes)
        notifyDataSetChanged()
    }

    inner class RecipeViewHolder(val binding: ItemRecipeBinding): RecyclerView.ViewHolder(binding.root)
}