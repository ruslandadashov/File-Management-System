package inter;

import bean.User;
import initialize.Initialize;
import util.UserServiceImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public interface UserServiceInter {
    public List<User> getAllUsers();
    public List<User> getAllInActiveUsers();

    public List<User> getAllActiveUsers();
    User registerUser();

    List<User> printAllUsers();

    List<User> printAllActiveuser();

    List<User> printInActiveUsers();


    boolean approveUser();


    String askForId();

    User getUserByteId(String id);

    User askUsernameAndPassword();

    User login();


    void prinyMySelf();
     List<String> getAllNonAccessibeFileOrFolders();

  void setNonAccessibleFileOrFoldersForUser() ;
    boolean register();

}
