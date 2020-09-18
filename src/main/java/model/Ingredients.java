package model;

public interface Ingredients {
    //method to find ingredients by id
Ingredient findByID(long id);


long createIngredient(Ingredient ingredient);


}
