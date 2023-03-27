package com.eduardo.fonseca.testyape.ui.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import androidx.appcompat.widget.SearchView;
import dagger.hilt.android.AndroidEntryPoint;
import android.widget.SearchView.OnQueryTextListener;
import com.eduardo.fonseca.testyape.base.BaseFragment;
import com.eduardo.fonseca.testyape.viewmodel.RecipeViewModel;
import com.eduardo.fonseca.testyape.databinding.FragmentRecipeFilterBinding;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0002H\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0002J\u001a\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lcom/eduardo/fonseca/testyape/ui/fragment/RecipeFilterFragment;", "Lcom/eduardo/fonseca/testyape/base/BaseFragment;", "Lcom/eduardo/fonseca/testyape/databinding/FragmentRecipeFilterBinding;", "()V", "ingredientsCheckBox", "Ljava/util/ArrayList;", "Landroid/widget/CheckBox;", "recipeViewModel", "Lcom/eduardo/fonseca/testyape/viewmodel/RecipeViewModel;", "getRecipeViewModel", "()Lcom/eduardo/fonseca/testyape/viewmodel/RecipeViewModel;", "recipeViewModel$delegate", "Lkotlin/Lazy;", "applyFilters", "", "getViewBinding", "observeViewModel", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "presentation_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class RecipeFilterFragment extends com.eduardo.fonseca.testyape.base.BaseFragment<com.eduardo.fonseca.testyape.databinding.FragmentRecipeFilterBinding> {
    private final kotlin.Lazy recipeViewModel$delegate = null;
    private final java.util.ArrayList<android.widget.CheckBox> ingredientsCheckBox = null;
    
    public RecipeFilterFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.eduardo.fonseca.testyape.databinding.FragmentRecipeFilterBinding getViewBinding() {
        return null;
    }
    
    private final com.eduardo.fonseca.testyape.viewmodel.RecipeViewModel getRecipeViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void observeViewModel() {
    }
    
    private final void applyFilters() {
    }
}