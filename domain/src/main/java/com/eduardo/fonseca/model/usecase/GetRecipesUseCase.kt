package com.eduardo.fonseca.model.usecase

import com.eduardo.fonseca.model.entity.Recipe
import com.eduardo.fonseca.model.entity.Response
import com.eduardo.fonseca.model.model.RecipeRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import java.io.IOException
import javax.inject.Inject

class GetRecipesUseCase @Inject constructor(
    private val repository: RecipeRepository
) {
    operator fun invoke(): Flow<Response<List<Recipe>>> = flow {
        try {
            emit(Response.Loading())
            val response = repository.getRecipes()
            emit(Response.Success(response))
        } catch (e: IOException) {
            emit(Response.Error(e))
        } catch (e: Exception) {
            emit(Response.Error(e))
        }
    }
}