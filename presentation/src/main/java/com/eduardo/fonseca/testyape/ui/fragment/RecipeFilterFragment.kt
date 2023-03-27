package com.eduardo.fonseca.testyape.ui.fragment

import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import androidx.core.os.bundleOf
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.appcompat.widget.SearchView
import dagger.hilt.android.AndroidEntryPoint
import com.eduardo.fonseca.testyape.utils.show
import android.widget.SearchView.OnQueryTextListener
import com.eduardo.fonseca.testyape.base.BaseFragment
import com.eduardo.fonseca.testyape.viewmodel.RecipeViewModel
import com.eduardo.fonseca.testyape.databinding.FragmentRecipeFilterBinding
import com.eduardo.fonseca.testyape.viewmodel.RecipeViewModel.Companion.NAME
import com.eduardo.fonseca.testyape.viewmodel.RecipeViewModel.Companion.FILTERS
import com.eduardo.fonseca.testyape.viewmodel.RecipeViewModel.Companion.INGREDIENTS

@AndroidEntryPoint
class RecipeFilterFragment : BaseFragment<FragmentRecipeFilterBinding>() {
    override fun getViewBinding() = FragmentRecipeFilterBinding.inflate(layoutInflater)
    private val recipeViewModel: RecipeViewModel by viewModels()
    private val ingredientsCheckBox = ArrayList<CheckBox>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.iconFilter.setOnClickListener { binding.scroll.show(!binding.scroll.isVisible) }
        binding.btnApplyFilters.setOnClickListener { applyFilters() }
        binding.searchRecipes.setOnQueryTextListener(object : OnQueryTextListener,
            SearchView.OnQueryTextListener {
            override fun onQueryTextChange(newText: String): Boolean {
                parentFragmentManager.setFragmentResult(FILTERS, bundleOf(NAME to newText))
                applyFilters()
                return false
            }

            override fun onQueryTextSubmit(query: String): Boolean {
                parentFragmentManager.setFragmentResult(FILTERS, bundleOf(NAME to query))
                applyFilters()
                return false
            }
        })
        observeViewModel()
    }

    private fun observeViewModel() {
        recipeViewModel.recipeState.observe(viewLifecycleOwner) {
            it.recipes?.let { recipes ->
                binding.ingredientsList.removeAllViews()
                ingredientsCheckBox.clear()
                recipes.map { recipe ->
                    recipe.ingredients.map { ingredient ->
                        val box = CheckBox(requireContext())
                        try {
                            box.text = ingredient.split("%")[1].uppercase()
                        } catch (e: Exception) {
                            box.text = ingredient
                        }
                        ingredientsCheckBox.add(box)
                        binding.ingredientsList.addView(box)
                    }
                }
                binding.checkAll.setOnClickListener {
                    ingredientsCheckBox.map { box ->
                        box.isChecked = binding.checkAll.isChecked
                    }
                }
            }

        }
    }

    private fun applyFilters() {
        if (binding.scroll.isVisible) {
            var countFilters = 0
            val list = ArrayList<String>()
            ingredientsCheckBox.map {
                if (it.isChecked) {
                    list.add(it.text.toString())
                    countFilters++
                }
            }
            binding.count.show(countFilters > 0)
            parentFragmentManager.setFragmentResult(FILTERS, bundleOf(INGREDIENTS to list))
            binding.count.text = countFilters.toString()
            binding.scroll.show(false)
        }
    }

}