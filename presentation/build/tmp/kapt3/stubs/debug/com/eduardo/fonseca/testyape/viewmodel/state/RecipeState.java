package com.eduardo.fonseca.testyape.viewmodel.state;

import com.eduardo.fonseca.model.entity.Recipe;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u00c6\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0019"}, d2 = {"Lcom/eduardo/fonseca/testyape/viewmodel/state/RecipeState;", "", "isLoading", "", "recipes", "", "Lcom/eduardo/fonseca/model/entity/Recipe;", "error", "", "(ZLjava/util/List;Ljava/lang/Throwable;)V", "getError", "()Ljava/lang/Throwable;", "()Z", "getRecipes", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "presentation_debug"})
public final class RecipeState {
    private final boolean isLoading = false;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.eduardo.fonseca.model.entity.Recipe> recipes = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Throwable error = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.eduardo.fonseca.testyape.viewmodel.state.RecipeState copy(boolean isLoading, @org.jetbrains.annotations.Nullable()
    java.util.List<com.eduardo.fonseca.model.entity.Recipe> recipes, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable error) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public RecipeState() {
        super();
    }
    
    public RecipeState(boolean isLoading, @org.jetbrains.annotations.Nullable()
    java.util.List<com.eduardo.fonseca.model.entity.Recipe> recipes, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable error) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.eduardo.fonseca.model.entity.Recipe> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.eduardo.fonseca.model.entity.Recipe> getRecipes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Throwable component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Throwable getError() {
        return null;
    }
}