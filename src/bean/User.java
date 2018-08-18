package bean;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

public class User implements Serializable {
    private String id;
    private String name;
    private String surname;
    private String username;
    private String password;
    private int status;
    private int pozition;
    private List<String>nonAccessableFileOorFolders;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String name, String surname, String username, String password) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.surname = surname;
        this.username = username;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getPozition() {
        return pozition;
    }

    public void setPozition(int pozition) {
        this.pozition = pozition;
    }

    public List<String> getNonAccessableFileOorFolders() {
        return nonAccessableFileOorFolders;
    }

    public void setNonAccessableFileOorFolders(List<String> nonAccessableFileOorFolders) {
        this.nonAccessableFileOorFolders = nonAccessableFileOorFolders;
    }
    public   boolean isAdmin(){
        return pozition==1;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                ", pozition=" + pozition +
                ", nonAccessableFileOorFolders=" + nonAccessableFileOorFolders +
                '}';
    }
}
