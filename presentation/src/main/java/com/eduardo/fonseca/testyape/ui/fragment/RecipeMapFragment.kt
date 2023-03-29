package com.eduardo.fonseca.testyape.ui.fragment


import android.os.Bundle
import android.view.View
import com.eduardo.fonseca.testyape.R
import dagger.hilt.android.AndroidEntryPoint
import com.eduardo.fonseca.model.entity.Recipe
import com.eduardo.fonseca.testyape.base.BaseFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.MarkerOptions
import com.google.android.gms.maps.CameraUpdateFactory
import com.eduardo.fonseca.testyape.databinding.FragmentRecipeMapBinding
import com.eduardo.fonseca.testyape.viewmodel.RecipeViewModel.Companion.RECIPE

@AndroidEntryPoint
class RecipeMapFragment : BaseFragment<FragmentRecipeMapBinding>() {
    override fun getViewBinding() = FragmentRecipeMapBinding.inflate(layoutInflater)
    private val callback = OnMapReadyCallback { googleMap ->
        val recipe = arguments?.getSerializable(RECIPE) as Recipe?
        val sydney = LatLng(recipe?.lat ?: 0.0, recipe?.long ?: 0.0)
        googleMap.addMarker(MarkerOptions().position(sydney).title(recipe?.name))
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 10f))
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val mapFragment = childFragmentManager.findFragmentById(R.id.map) as SupportMapFragment?
        mapFragment?.getMapAsync(callback)
    }

}