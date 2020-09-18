package model;

import java.util.ArrayList;
import java.util.List;

public class IngredientsDao implements Ingredients {
    private List<Ingredient> ingredients = new ArrayList<>();

    @Override
    public Ingredient findByID(long id) {
        return ingredients.get((int)id -1);
    }

    @Override
    public long createIngredient(Ingredient ingredient) {
        ingredient.setId(ingredients.size() + 1);

        ingredients.add(ingredient);

        return ingredient.getId();
    }
}
