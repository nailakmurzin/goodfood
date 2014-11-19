package models;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by dizman on 11/18/14.
 */
@Entity
@Table(name = "Ingredient", schema = "GoodFood", catalog = "postgres")
public class IngredientEntity {
    private int id;
    private String name;
    private int price;
    private int unit;
    private Integer foodValue;
    private Date priceDate;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "Price")
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Basic
    @Column(name = "Unit")
    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    @Basic
    @Column(name = "Food_value")
    public Integer getFoodValue() {
        return foodValue;
    }

    public void setFoodValue(Integer foodValue) {
        this.foodValue = foodValue;
    }

    @Basic
    @Column(name = "Price_date")
    public Date getPriceDate() {
        return priceDate;
    }

    public void setPriceDate(Date priceDate) {
        this.priceDate = priceDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IngredientEntity that = (IngredientEntity) o;

        if (id != that.id) return false;
        if (price != that.price) return false;
        if (unit != that.unit) return false;
        if (foodValue != null ? !foodValue.equals(that.foodValue) : that.foodValue != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (priceDate != null ? !priceDate.equals(that.priceDate) : that.priceDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + price;
        result = 31 * result + unit;
        result = 31 * result + (foodValue != null ? foodValue.hashCode() : 0);
        result = 31 * result + (priceDate != null ? priceDate.hashCode() : 0);
        return result;
    }
}
