package com.eduardo.fonseca.testyape.ui.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.eduardo.fonseca.model.entity.Recipe;
import com.eduardo.fonseca.testyape.databinding.ItemRecipeBinding;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001dB\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\n2\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0013H\u0016J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0013H\u0016J\u001e\u0010\u001b\u001a\u00020\n2\u0016\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006R(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0007\u00a8\u0006\u001e"}, d2 = {"Lcom/eduardo/fonseca/testyape/ui/adapter/RecipeAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/eduardo/fonseca/testyape/ui/adapter/RecipeAdapter$RecipeViewHolder;", "recipe", "Ljava/util/ArrayList;", "Lcom/eduardo/fonseca/model/entity/Recipe;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "onItemClick", "Lkotlin/Function1;", "", "getOnItemClick", "()Lkotlin/jvm/functions/Function1;", "setOnItemClick", "(Lkotlin/jvm/functions/Function1;)V", "getRecipe", "()Ljava/util/ArrayList;", "setRecipe", "getItemCount", "", "onBindViewHolder", "pvh", "position", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "viewType", "updateItemList", "newRecipes", "RecipeViewHolder", "presentation_debug"})
public final class RecipeAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.eduardo.fonseca.testyape.ui.adapter.RecipeAdapter.RecipeViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.eduardo.fonseca.model.entity.Recipe> recipe;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super com.eduardo.fonseca.model.entity.Recipe, kotlin.Unit> onItemClick;
    
    public RecipeAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.eduardo.fonseca.model.entity.Recipe> recipe) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.eduardo.fonseca.model.entity.Recipe> getRecipe() {
        return null;
    }
    
    public final void setRecipe(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.eduardo.fonseca.model.entity.Recipe> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function1<com.eduardo.fonseca.model.entity.Recipe, kotlin.Unit> getOnItemClick() {
        return null;
    }
    
    public final void setOnItemClick(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function1<? super com.eduardo.fonseca.model.entity.Recipe, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.eduardo.fonseca.testyape.ui.adapter.RecipeAdapter.RecipeViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup viewGroup, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.eduardo.fonseca.testyape.ui.adapter.RecipeAdapter.RecipeViewHolder pvh, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void updateItemList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.eduardo.fonseca.model.entity.Recipe> newRecipes) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/eduardo/fonseca/testyape/ui/adapter/RecipeAdapter$RecipeViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/eduardo/fonseca/testyape/databinding/ItemRecipeBinding;", "(Lcom/eduardo/fonseca/testyape/ui/adapter/RecipeAdapter;Lcom/eduardo/fonseca/testyape/databinding/ItemRecipeBinding;)V", "getBinding", "()Lcom/eduardo/fonseca/testyape/databinding/ItemRecipeBinding;", "presentation_debug"})
    public final class RecipeViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.eduardo.fonseca.testyape.databinding.ItemRecipeBinding binding = null;
        
        public RecipeViewHolder(@org.jetbrains.annotations.NotNull()
        com.eduardo.fonseca.testyape.databinding.ItemRecipeBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.eduardo.fonseca.testyape.databinding.ItemRecipeBinding getBinding() {
            return null;
        }
    }
}