package com.eduardo.fonseca.testyape.viewmodel.state

import com.eduardo.fonseca.model.entity.Recipe

data class RecipeState (
    val isLoading: Boolean = false,
    val recipes: List<Recipe>? = null,
    val error: Throwable? = null
)