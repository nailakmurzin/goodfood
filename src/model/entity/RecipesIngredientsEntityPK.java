package models;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by dizman on 11/18/14.
 */
public class RecipesIngredientsEntityPK implements Serializable {
    private int idRecipe;
    private int idIngredient;

    @Column(name = "id_recipe")
    @Id
    public int getIdRecipe() {
        return idRecipe;
    }

    public void setIdRecipe(int idRecipe) {
        this.idRecipe = idRecipe;
    }

    @Column(name = "id_ingredient")
    @Id
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

        RecipesIngredientsEntityPK that = (RecipesIngredientsEntityPK) o;

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
