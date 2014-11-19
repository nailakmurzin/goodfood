package models;

import javax.persistence.*;

/**
 * Created by dizman on 11/18/14.
 */
@Entity
@Table(name = "Recipes-Ingredients", schema = "GoodFood", catalog = "postgres")
@IdClass(RecipesIngredientsEntityPK.class)
public class RecipesIngredientsEntity {
    private int idRecipe;
    private int idIngredient;

    @Id
    @Column(name = "id_recipe")
    public int getIdRecipe() {
        return idRecipe;
    }

    public void setIdRecipe(int idRecipe) {
        this.idRecipe = idRecipe;
    }

    @Id
    @Column(name = "id_ingredient")
    public int getIdIngredient() {
        return idIngredient;
    }

    public void setIdIngredient(int idIngredient) {
        this.idIngredient = idIngredient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RecipesIngredientsEntity that = (RecipesIngredientsEntity) o;

        if (idIngredient != that.idIngredient) return false;
        if (idRecipe != that.idRecipe) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRecipe;
        result = 31 * result + idIngredient;
        return result;
    }
}
