package com.eduardo.fonseca.infrestructure.dto.response

import org.junit.Test
import org.junit.Assert.assertEquals

class RecipeResponseTest {

    @Test
    fun testRecipes() {
        val recipe1 = RecipeResponse.Recipe("https://example.com/image1.jpg",
            "Recipe 1",
            listOf("Ingredient 1", "Ingredient 2"),
            "Description of recipe 1",
            listOf("Step 1", "Step 2"),
            40.7128,
            -74.0060)
        val recipe2 = RecipeResponse.Recipe("https://example.com/image2.jpg",
            "Recipe 2",
            listOf("Ingredient 3", "Ingredient 4"),
            "Description of recipe 2",
            listOf("Step 1", "Step 2", "Step 3"),
            51.5074,
            -0.1278)
        val recipeResponse = RecipeResponse(listOf(recipe1, recipe2))

        assertEquals(2, recipeResponse.recipes.size)
        assertEquals(recipe1, recipeResponse.recipes[0])
        assertEquals(recipe2, recipeResponse.recipes[1])
    }
}