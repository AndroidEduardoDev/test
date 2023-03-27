package com.eduardo.fonseca.testyape.ui.fragment

import android.os.Bundle
import android.view.View
import com.bumptech.glide.Glide
import androidx.core.os.bundleOf
import com.eduardo.fonseca.testyape.R
import com.eduardo.fonseca.model.entity.Recipe
import androidx.navigation.fragment.findNavController
import com.eduardo.fonseca.testyape.base.BaseFragment
import com.eduardo.fonseca.testyape.databinding.FragmentRecipeDetailBinding
import com.eduardo.fonseca.testyape.viewmodel.RecipeViewModel.Companion.RECIPE
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RecipeDetailFragment : BaseFragment<FragmentRecipeDetailBinding>() {

    override fun getViewBinding() = FragmentRecipeDetailBinding.inflate(layoutInflater)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        observeViewModel()
    }

    private fun observeViewModel() {
        val recipe = arguments?.getSerializable(RECIPE) as Recipe?
        recipe?.let {
            var ingredients = ""; var steps = ""
            binding.name.text = it.name
            binding.description.text = it.description
            Glide.with(binding.root).load(it.image).into(binding.image)
            it.ingredients.map { ingredient -> ingredients += "${ingredient}\n" }
            it.steps.map { step -> steps += "${step.replace("%", "")}\n" }
            binding.ingredients.text = ingredients
            binding.steps.text = steps
            binding.btnMap.setOnClickListener { _ ->
                findNavController().navigate(
                    R.id.action_recipeDetailFragment_to_recipeMapFragment, bundleOf(RECIPE to it)
                )
            }
        }
    }

}