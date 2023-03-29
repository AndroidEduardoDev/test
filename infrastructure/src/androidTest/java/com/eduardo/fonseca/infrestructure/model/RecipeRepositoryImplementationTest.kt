import com.eduardo.fonseca.infrestructure.api.RecipeApi
import com.eduardo.fonseca.infrestructure.dto.response.RecipeResponse
import com.eduardo.fonseca.infrestructure.dto.value.`object`.toRecipeDomain
import com.eduardo.fonseca.infrestructure.model.RecipeRepositoryImplementation
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock

class RecipeRepositoryImplementationTest {

    private val recipeApi: RecipeApi = mock(RecipeApi::class.java)
    private val recipeRepository = RecipeRepositoryImplementation()

    @Test
    fun testGetRecipes() = runBlocking {
        val mockRecipes = listOf(
            RecipeResponse.Recipe(
                "https://google.com/image.jpg",
                "Recipe", listOf("Ingredient"), "Description", listOf("Step 1", "Step 2"),
                0.0, 0.0
            ),

            )
        val expectedRecipes = mockRecipes.toRecipeDomain()

        `when`(recipeApi.getRecipes()).thenReturn(RecipeResponse(mockRecipes))

        val actualRecipes = recipeRepository.getRecipes()

        assertEquals(expectedRecipes, actualRecipes)
    }
}