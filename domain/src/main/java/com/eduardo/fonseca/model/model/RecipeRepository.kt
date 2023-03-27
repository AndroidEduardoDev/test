package com.eduardo.fonseca.model.model

import com.eduardo.fonseca.model.entity.Recipe

interface RecipeRepository {

   suspend fun getRecipes(): List<Recipe>

}