package com.eduardo.fonseca.infrestructure.dto.value.`object`

import com.eduardo.fonseca.infrestructure.dto.response.RecipeResponse
import com.eduardo.fonseca.model.entity.Recipe

fun List<RecipeResponse.Recipe>.toRecipeDomain(): List<Recipe> {
    val list = arrayListOf<Recipe>()
    map { recipe ->
        list.add(
            Recipe(
                image = recipe.image, name = recipe.name,
                ingredients = recipe.ingredients, description = recipe.description,
                steps = recipe.steps,
                lat = recipe.lat,
                long = recipe.long
            )
        )
    }
    return list
}
