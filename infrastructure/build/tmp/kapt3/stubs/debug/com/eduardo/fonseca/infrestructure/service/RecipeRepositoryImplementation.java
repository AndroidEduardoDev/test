package com.eduardo.fonseca.infrestructure.service;

import com.eduardo.fonseca.infrestructure.BuildConfig;
import com.eduardo.fonseca.infrestructure.api.RecipeApi;
import com.eduardo.fonseca.model.entity.Recipe;
import com.eduardo.fonseca.model.model.RecipeRepository;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/eduardo/fonseca/infrestructure/service/RecipeRepositoryImplementation;", "Lcom/eduardo/fonseca/model/model/RecipeRepository;", "()V", "api", "Lcom/eduardo/fonseca/infrestructure/api/RecipeApi;", "getRecipeByNameOrIngredient", "", "Lcom/eduardo/fonseca/model/entity/Recipe;", "string", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecipes", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "infrastructure_debug"})
public final class RecipeRepositoryImplementation implements com.eduardo.fonseca.model.model.RecipeRepository {
    private final com.eduardo.fonseca.infrestructure.api.RecipeApi api = null;
    
    @javax.inject.Inject()
    public RecipeRepositoryImplementation() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getRecipes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.eduardo.fonseca.model.entity.Recipe>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getRecipeByNameOrIngredient(@org.jetbrains.annotations.NotNull()
    java.lang.String string, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.eduardo.fonseca.model.entity.Recipe>> continuation) {
        return null;
    }
}