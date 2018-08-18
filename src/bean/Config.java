package bean;

import java.io.Serializable;
import java.util.List;

public class Config implements Serializable {

    private transient User loggedInUser;
    private  List<User>allusers;
    private  List<User> nonAccesibleFileOrFolder;

    public Config() {
    }



    public User getLoggedInUser() {
        return loggedInUser;
    }

    public void setLoggedInUser(User loggedInUser) {
        this.loggedInUser = loggedInUser;
    }

    public List<User> getAllusers() {
        return allusers;
    }

    public void setAllusers(List<User> allusers) {
    this.allusers = allusers;
    }

    public List<User> getNonAccesibleFileOrFolder() {
        return nonAccesibleFileOrFolder;
    }

    public void setNonAccesibleFileOrFolder(List<User> nonAccesibleFileOrFolder) {
      this.nonAccesibleFileOrFolder = nonAccesibleFileOrFolder;
    }
}
