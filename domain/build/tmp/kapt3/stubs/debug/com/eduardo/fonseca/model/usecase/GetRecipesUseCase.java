package com.eduardo.fonseca.model.usecase;

import com.eduardo.fonseca.model.entity.Recipe;
import com.eduardo.fonseca.model.entity.Response;
import com.eduardo.fonseca.model.model.RecipeRepository;
import kotlinx.coroutines.flow.Flow;
import java.io.IOException;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006H\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/eduardo/fonseca/model/usecase/GetRecipesUseCase;", "", "repository", "Lcom/eduardo/fonseca/model/model/RecipeRepository;", "(Lcom/eduardo/fonseca/model/model/RecipeRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/eduardo/fonseca/model/entity/Response;", "", "Lcom/eduardo/fonseca/model/entity/Recipe;", "domain_debug"})
public final class GetRecipesUseCase {
    private final com.eduardo.fonseca.model.model.RecipeRepository repository = null;
    
    @javax.inject.Inject()
    public GetRecipesUseCase(@org.jetbrains.annotations.NotNull()
    com.eduardo.fonseca.model.model.RecipeRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.eduardo.fonseca.model.entity.Response<java.util.List<com.eduardo.fonseca.model.entity.Recipe>>> invoke() {
        return null;
    }
}