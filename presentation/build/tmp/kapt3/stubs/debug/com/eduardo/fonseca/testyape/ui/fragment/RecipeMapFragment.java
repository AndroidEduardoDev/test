package com.eduardo.fonseca.testyape.ui.fragment;

import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.eduardo.fonseca.testyape.R;
import dagger.hilt.android.AndroidEntryPoint;
import com.eduardo.fonseca.model.entity.Recipe;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.eduardo.fonseca.testyape.databinding.FragmentRecipeMapBinding;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/eduardo/fonseca/testyape/ui/fragment/RecipeMapFragment;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "Lcom/eduardo/fonseca/testyape/databinding/FragmentRecipeMapBinding;", "callback", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "onCreateView", "Landroid/view/View;", "i", "Landroid/view/LayoutInflater;", "vg", "Landroid/view/ViewGroup;", "b", "Landroid/os/Bundle;", "onViewCreated", "", "view", "savedInstanceState", "presentation_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class RecipeMapFragment extends androidx.fragment.app.Fragment {
    private com.eduardo.fonseca.testyape.databinding.FragmentRecipeMapBinding binding;
    private final com.google.android.gms.maps.OnMapReadyCallback callback = null;
    
    public RecipeMapFragment() {
        super();
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
}