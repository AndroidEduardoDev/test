// Generated by Dagger (https://dagger.dev).
package com.eduardo.fonseca.model.usecase;

import com.eduardo.fonseca.model.model.RecipeRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class GetRecipesUseCase_Factory implements Factory<GetRecipesUseCase> {
  private final Provider<RecipeRepository> repositoryProvider;

  public GetRecipesUseCase_Factory(Provider<RecipeRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetRecipesUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetRecipesUseCase_Factory create(Provider<RecipeRepository> repositoryProvider) {
    return new GetRecipesUseCase_Factory(repositoryProvider);
  }

  public static GetRecipesUseCase newInstance(RecipeRepository repository) {
    return new GetRecipesUseCase(repository);
  }
}
