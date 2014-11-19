package models;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by dizman on 11/18/14.
 */
@Entity
@Table(name = "Users", schema = "GoodFood", catalog = "postgres")
public class UsersEntity {
    private int id;
    private String nick;
    private Date date;
    private int type;

    @Basic
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @Column(name = "Nick")
    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Basic
    @Column(name = "Date")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Basic
    @Column(name = "Type")
    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UsersEntity that = (UsersEntity) o;

        if (id != that.id) return false;
        if (type != that.type) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (nick != null ? !nick.equals(that.nick) : that.nick != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (nick != null ? nick.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + type;
        return result;
    }
}
