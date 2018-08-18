package daointer;

import bean.User;
import initialize.Initialize;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface UserDaoInter {
    public boolean add(User user);

    public boolean save(User user);

    public List<User> getAllUsers();

    public List<User> getAllActiveUsers();


    public List<User> getAllInAactiveUsers();


}
