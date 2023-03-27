package com.eduardo.fonseca.testyape.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBinding;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\r\u0010\n\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\tJ&\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0012\u0010\u0005\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00028\u00008F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0015"}, d2 = {"Lcom/eduardo/fonseca/testyape/base/BaseFragment;", "VB", "Landroidx/viewbinding/ViewBinding;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Landroidx/viewbinding/ViewBinding;", "binding", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "getViewBinding", "onCreateView", "Landroid/view/View;", "i", "Landroid/view/LayoutInflater;", "vg", "Landroid/view/ViewGroup;", "b", "Landroid/os/Bundle;", "onDestroyView", "", "presentation_debug"})
public abstract class BaseFragment<VB extends androidx.viewbinding.ViewBinding> extends androidx.fragment.app.Fragment {
    private VB _binding;
    
    public BaseFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final VB getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater i, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup vg, @org.jetbrains.annotations.Nullable()
    android.os.Bundle b) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract VB getViewBinding();
    
    @java.lang.Override()
    public void onDestroyView() {
    }
}