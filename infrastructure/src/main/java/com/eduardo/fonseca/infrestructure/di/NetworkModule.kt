package com.eduardo.fonseca.infrestructure.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import javax.inject.Singleton
import dagger.hilt.components.SingletonComponent
import com.eduardo.fonseca.model.model.RecipeRepository
import com.eduardo.fonseca.infrestructure.service.RecipeRepositoryImplementation

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    @Provides
    fun provideRecipeRepository(): RecipeRepository {
        return RecipeRepositoryImplementation()
    }
}