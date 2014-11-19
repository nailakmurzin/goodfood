package models;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by dizman on 11/18/14.
 */
@Entity
@Table(name = "Recipes", schema = "GoodFood", catalog = "postgres")
public class RecipesEntity {
    private String name;
    private String content;
    private Date publicDate;
    private Integer category;
    private Integer preparationTime;
    private int user;
    private int id;

    @Basic
    @Column(name = "Name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "Content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Basic
    @Column(name = "Public_date")
    public Date getPublicDate() {
        return publicDate;
    }

    public void setPublicDate(Date publicDate) {
        this.publicDate = publicDate;
    }

    @Basic
    @Column(name = "Category")
    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    @Basic
    @Column(name = "Preparation_time")
    public Integer getPreparationTime() {
        return preparationTime;
    }

    public void setPreparationTime(Integer preparationTime) {
        this.preparationTime = preparationTime;
    }

    @Basic
    @Column(name = "User")
    public int getUser() {
        return user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RecipesEntity that = (RecipesEntity) o;

        if (id != that.id) return false;
        if (user != that.user) return false;
        if (category != null ? !category.equals(that.category) : that.category != null) return false;
        if (content != null ? !content.equals(that.content) : that.content != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (preparationTime != null ? !preparationTime.equals(that.preparationTime) : that.preparationTime != null)
            return false;
        if (publicDate != null ? !publicDate.equals(that.publicDate) : that.publicDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (content != null ? content.hashCode() : 0);
        result = 31 * result + (publicDate != null ? publicDate.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (preparationTime != null ? preparationTime.hashCode() : 0);
        result = 31 * result + user;
        result = 31 * result + id;
        return result;
    }
}
