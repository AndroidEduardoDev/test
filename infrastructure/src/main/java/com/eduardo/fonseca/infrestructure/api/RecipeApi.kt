package com.eduardo.fonseca.infrestructure.api

import com.eduardo.fonseca.infrestructure.dto.response.RecipeResponse
import retrofit2.http.GET

interface RecipeApi {

    @GET("recipes")
    suspend fun getRecipes(): RecipeResponse
}