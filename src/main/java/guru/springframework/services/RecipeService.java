package guru.springframework.services;

import guru.springframework.domain.Recipe;

import java.util.Optional;
import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();

    public Recipe findById(Long l);

}
