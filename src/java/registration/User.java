/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registration;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/** Test
/**
 *
 * @author Nail
 */
@ManagedBean
//@RequestScoped
public class User {

    private String name;

    public User(String _name) {
        this.name = _name;
    }

    public String getName() {
        return name;
    }

    public void registration() {

    }

}
