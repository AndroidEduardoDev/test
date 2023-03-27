package com.eduardo.fonseca.model.model;

import com.eduardo.fonseca.model.entity.Recipe;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/eduardo/fonseca/model/model/RecipeRepository;", "", "getRecipeByNameOrIngredient", "", "Lcom/eduardo/fonseca/model/entity/Recipe;", "string", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecipes", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_debug"})
public abstract interface RecipeRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getRecipes(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.eduardo.fonseca.model.entity.Recipe>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getRecipeByNameOrIngredient(@org.jetbrains.annotations.NotNull()
    java.lang.String string, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.eduardo.fonseca.model.entity.Recipe>> continuation);
}