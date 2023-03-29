package com.eduardo.fonseca.testyape.ui.fragment

import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.view.LayoutInflater
import androidx.core.os.bundleOf
import androidx.fragment.app.commit
import androidx.fragment.app.Fragment
import com.eduardo.fonseca.model.entity.Recipe
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.eduardo.fonseca.testyape.R
import com.eduardo.fonseca.testyape.base.BaseFragment
import com.eduardo.fonseca.testyape.ui.adapter.RecipeAdapter
import com.eduardo.fonseca.testyape.viewmodel.RecipeViewModel
import com.eduardo.fonseca.testyape.ui.utils.TransparentLoadScreenDialog
import com.eduardo.fonseca.testyape.databinding.FragmentRecipeListBinding
import com.eduardo.fonseca.testyape.viewmodel.RecipeViewModel.Companion.FILTERS
import com.eduardo.fonseca.testyape.viewmodel.RecipeViewModel.Companion.INGREDIENTS
import com.eduardo.fonseca.testyape.viewmodel.RecipeViewModel.Companion.NAME
import com.eduardo.fonseca.testyape.viewmodel.RecipeViewModel.Companion.RECIPE
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RecipeListFragment : BaseFragment<FragmentRecipeListBinding>() {
    override fun getViewBinding() = FragmentRecipeListBinding.inflate(layoutInflater)
    private val recipeViewModel: RecipeViewModel by viewModels()
    private lateinit var recipeAdapter: RecipeAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        TransparentLoadScreenDialog.show(requireContext())
        createFilterView(savedInstanceState)
        createAdapterView()
        observeViewModel()
        resultListenerView()
    }

    private fun resultListenerView() {
        childFragmentManager.setFragmentResultListener(FILTERS, viewLifecycleOwner) { _, bundle ->
            val result = bundle.getString(NAME)
            val ingredients = bundle.getStringArrayList(INGREDIENTS)
            val listFilterByName = ArrayList<Recipe>()
            if (!result.isNullOrEmpty() || ingredients?.isNotEmpty() == true) {
                recipeViewModel.recipeState.value?.recipes?.map { recipe ->
                    if (recipe.name.lowercase().contains(result?.lowercase().toString())) {
                        listFilterByName.add(recipe)
                    }
                }
                recipeViewModel.recipeState.value?.recipes?.map { recipe ->
                    recipe.ingredients.map { ingredient ->
                        ingredients?.map { box ->
                            if (ingredient.lowercase().contains(box.lowercase()) &&
                                !listFilterByName.contains(recipe)
                            )
                                listFilterByName.add(recipe)
                        }
                    }
                }
                if (listFilterByName.size > 0) {
                    recipeAdapter.updateItemList(listFilterByName)
                } else {
                    recipeAdapter.updateItemList(arrayListOf())
                }
            } else {
                recipeAdapter.updateItemList(recipeViewModel.recipeState.value?.recipes as ArrayList<Recipe>)
            }
        }
    }

    private fun createFilterView(savedInstanceState: Bundle?) {
        if (savedInstanceState == null) {
            childFragmentManager.commit {
                setReorderingAllowed(true)
                add(binding.fragmentContainerView.id, RecipeFilterFragment())
            }
        }
    }

    private fun observeViewModel() {
        recipeViewModel.recipeState.observe(viewLifecycleOwner) {
            if (!it.isLoading) {
                TransparentLoadScreenDialog.hide()
            }
            it.recipes?.let { recipes ->
                recipeAdapter.updateItemList(recipes as ArrayList<Recipe>)
            }
        }
    }

    private fun createAdapterView() {
        recipeAdapter = RecipeAdapter(arrayListOf())
        binding.recyclerView.layoutManager = GridLayoutManager(requireContext(), 2)
        binding.recyclerView.adapter = recipeAdapter
        recipeAdapter.onItemClick = {
            findNavController().navigate(
                R.id.action_recipeListFragment_to_recipeDetailFragment,
                bundleOf(RECIPE to it)
            )
        }
    }

}
