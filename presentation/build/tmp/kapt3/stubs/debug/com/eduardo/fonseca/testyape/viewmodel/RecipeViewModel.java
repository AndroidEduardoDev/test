package com.eduardo.fonseca.testyape.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.MutableLiveData;
import com.eduardo.fonseca.model.entity.Response;
import com.eduardo.fonseca.model.usecase.GetRecipesUseCase;
import com.eduardo.fonseca.testyape.viewmodel.state.RecipeState;
import com.eduardo.fonseca.infrestructure.service.RecipeRepositoryImplementation;
import com.eduardo.fonseca.model.entity.Recipe;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u000b\u001a\u00020\fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/eduardo/fonseca/testyape/viewmodel/RecipeViewModel;", "Landroidx/lifecycle/ViewModel;", "getRecipeUseCase", "Lcom/eduardo/fonseca/model/usecase/GetRecipesUseCase;", "(Lcom/eduardo/fonseca/model/usecase/GetRecipesUseCase;)V", "_recipeState", "Landroidx/lifecycle/MutableLiveData;", "Lcom/eduardo/fonseca/testyape/viewmodel/state/RecipeState;", "recipeState", "getRecipeState", "()Landroidx/lifecycle/MutableLiveData;", "fetchRecipes", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "presentation_debug"})
public final class RecipeViewModel extends androidx.lifecycle.ViewModel {
    private final com.eduardo.fonseca.model.usecase.GetRecipesUseCase getRecipeUseCase = null;
    private final androidx.lifecycle.MutableLiveData<com.eduardo.fonseca.testyape.viewmodel.state.RecipeState> _recipeState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.eduardo.fonseca.testyape.viewmodel.state.RecipeState> recipeState = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.eduardo.fonseca.testyape.viewmodel.RecipeViewModel.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String RECIPE = "RECIPE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FILTERS = "FILTERS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String INGREDIENTS = "INGREDIENTS";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String NAME = "NAME";
    
    @javax.inject.Inject()
    public RecipeViewModel(@org.jetbrains.annotations.NotNull()
    com.eduardo.fonseca.model.usecase.GetRecipesUseCase getRecipeUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.eduardo.fonseca.testyape.viewmodel.state.RecipeState> getRecipeState() {
        return null;
    }
    
    private final java.lang.Object fetchRecipes(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/eduardo/fonseca/testyape/viewmodel/RecipeViewModel$Companion;", "", "()V", "FILTERS", "", "INGREDIENTS", "NAME", "RECIPE", "presentation_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}