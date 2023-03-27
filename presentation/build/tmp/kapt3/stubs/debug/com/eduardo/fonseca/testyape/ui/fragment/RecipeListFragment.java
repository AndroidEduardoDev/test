package com.eduardo.fonseca.testyape.ui.fragment;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import com.eduardo.fonseca.model.entity.Recipe;
import androidx.recyclerview.widget.GridLayoutManager;
import com.eduardo.fonseca.testyape.R;
import com.eduardo.fonseca.testyape.ui.adapter.RecipeAdapter;
import com.eduardo.fonseca.testyape.viewmodel.RecipeViewModel;
import com.eduardo.fonseca.testyape.utils.TransparentLoadScreenDialog;
import com.eduardo.fonseca.testyape.databinding.FragmentRecipeListBinding;
import dagger.hilt.android.AndroidEntryPoint;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\b\u0010\u0012\u001a\u00020\u000eH\u0002J$\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0011H\u0016J\u001a\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00142\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u001c\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001d"}, d2 = {"Lcom/eduardo/fonseca/testyape/ui/fragment/RecipeListFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/eduardo/fonseca/testyape/databinding/FragmentRecipeListBinding;", "recipeAdapter", "Lcom/eduardo/fonseca/testyape/ui/adapter/RecipeAdapter;", "recipeViewModel", "Lcom/eduardo/fonseca/testyape/viewmodel/RecipeViewModel;", "getRecipeViewModel", "()Lcom/eduardo/fonseca/testyape/viewmodel/RecipeViewModel;", "recipeViewModel$delegate", "Lkotlin/Lazy;", "createAdapterView", "", "createFilterView", "savedInstanceState", "Landroid/os/Bundle;", "observeViewModel", "onCreateView", "Landroid/view/View;", "i", "Landroid/view/LayoutInflater;", "vg", "Landroid/view/ViewGroup;", "b", "onViewCreated", "view", "resultListenerView", "presentation_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class RecipeListFragment extends androidx.fragment.app.Fragment {
    private final kotlin.Lazy recipeViewModel$delegate = null;
    private com.eduardo.fonseca.testyape.ui.adapter.RecipeAdapter recipeAdapter;
    private com.eduardo.fonseca.testyape.databinding.FragmentRecipeListBinding binding;
    
    public RecipeListFragment() {
        super();
    }
    
    private final com.eduardo.fonseca.testyape.viewmodel.RecipeViewModel getRecipeViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater i, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup vg, @org.jetbrains.annotations.Nullable()
    android.os.Bundle b) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void resultListenerView() {
    }
    
    private final void createFilterView(android.os.Bundle savedInstanceState) {
    }
    
    private final void observeViewModel() {
    }
    
    private final void createAdapterView() {
    }
}