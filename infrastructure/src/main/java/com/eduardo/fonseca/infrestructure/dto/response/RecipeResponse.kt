package com.eduardo.fonseca.infrestructure.dto.response

data class RecipeResponse (
    val recipes: List<Recipe>
){
    data class Recipe (
        val image: String,
        val name: String,
        val ingredients: List<String>,
        val description: String,
        val steps: List<String>,
        val lat: Double,
        val long: Double
    )
}

