package com.eduardo.fonseca.infrestructure.service

import com.eduardo.fonseca.infrestructure.BuildConfig
import com.eduardo.fonseca.infrestructure.api.RecipeApi
import com.eduardo.fonseca.infrestructure.dto.value.`object`.toRecipeDomain
import com.eduardo.fonseca.model.entity.Recipe
import com.eduardo.fonseca.model.model.RecipeRepository
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Inject

class RecipeRepositoryImplementation @Inject constructor() : RecipeRepository {

    private val api: RecipeApi = Retrofit.Builder()
        .baseUrl(BuildConfig.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(RecipeApi::class.java)

    override suspend fun getRecipes(): List<Recipe> {
        return api.getRecipes().recipes.toRecipeDomain()
    }
}