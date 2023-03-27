package com.eduardo.fonseca.model.entity


data class Recipe(
    val image: String,
    val name: String,
    val ingredients: List<String>,
    val description: String,
    val steps: List<String>,
    val lat: Double,
    val long: Double
):java.io.Serializable
