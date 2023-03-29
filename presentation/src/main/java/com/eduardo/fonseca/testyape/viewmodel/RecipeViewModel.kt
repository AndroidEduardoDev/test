package com.eduardo.fonseca.testyape.viewmodel

import kotlinx.coroutines.launch
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.MutableLiveData
import com.eduardo.fonseca.model.entity.Response
import com.eduardo.fonseca.model.usecase.GetRecipesUseCase
import com.eduardo.fonseca.testyape.viewmodel.state.RecipeState
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RecipeViewModel @Inject constructor(
    private val getRecipeUseCase: GetRecipesUseCase
) : ViewModel() {
    private val _recipeState = MutableLiveData<RecipeState>()
    val recipeState = _recipeState

    init {
        viewModelScope.launch { fetchRecipes() }
    }

    private suspend fun fetchRecipes() {
        getRecipeUseCase().collect { result ->
            when (result) {
                is Response.Success -> _recipeState.value = RecipeState(recipes = result.data)
                is Response.Error -> _recipeState.value = RecipeState(error = result.e)
                is Response.Loading -> _recipeState.value = RecipeState(isLoading = true)
            }
        }
    }

    companion object{
        const val RECIPE = "RECIPE"
        const val FILTERS = "FILTERS"
        const val INGREDIENTS = "INGREDIENTS"
        const val NAME = "NAME"
    }
}