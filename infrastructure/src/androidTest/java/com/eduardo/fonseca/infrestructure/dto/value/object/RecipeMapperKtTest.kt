package com.eduardo.fonseca.infrestructure.dto.value.`object`

import com.eduardo.fonseca.infrestructure.dto.response.RecipeResponse
import org.junit.Assert.assertEquals
import org.junit.Test

class RecipeResponseTest {

    @Test
    fun testToRecipeDomain() {
        val recipeResponses = listOf(
            RecipeResponse.Recipe(
                "https://example.com/image1.jpg",
                "Tortilla",
                listOf("Ingredient 1"),
                "Example",
                listOf("Step 1"),
                0.0,
                0.0
            )
        )
        val recipes = recipeResponses.toRecipeDomain()
        assertEquals(2, recipes.size)
        assertEquals("https://example.com/image1.jpg", recipes[0].image)
    }
}
