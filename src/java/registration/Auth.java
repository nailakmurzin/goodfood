package registration;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Nail
 */
@ManagedBean
@SessionScoped
public class Auth {

    private User user;

    public String getUserName() {
        if (this.isEmpty()) {
            return "";
        }
        return user.getName();
    }

    public void setUserName(String _userName) {
        this.user = new User(_userName);
    }

    public boolean isEmpty() {
        return this.user == null;
    }

    public String processLogin() {
        return "index.xhtml";
    }

    public Auth() {
    }

}
