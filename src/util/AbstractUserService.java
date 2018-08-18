package util;

import bean.User;
import initialize.Initialize;
import inter.UserServiceInter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public abstract class AbstractUserService implements UserServiceInter {



    public User getUserByteId(String id) {

        List<User> users = getAllUsers();
        if (users.size() == 0 && users == null) {
            return null;
        }
        for (User u : users) {
            if (u.getId() != null && u.getId().equals(id)) {
                return u;

            }
        }
        return null;

    }


    public User login() {

        User enteredUser = askUsernameAndPassword();
        List<User> allActiveUsers = getAllActiveUsers();
        for (User user : allActiveUsers) {
            if (user.getUsername().equals(enteredUser.getUsername()) &&
                    user.getPassword().equals(enteredUser.getPassword())) {
                Initialize.config.setLoggedInUser(user);
                return user;

            }
        }

        throw new IllegalArgumentException("Invalid username or password");
    }




    public void prinyMySelf() {
        User user = Initialize.config.getLoggedInUser();
        System.out.println(user);

    }
        public List<User> printAllUsers() {
        List<User> list = getAllUsers();
        System.out.println(list);
        return list;

    }

    public List<User> printAllActiveuser() {
        List<User> list = getAllActiveUsers();
        System.out.println(list);
        return list;

    }

    public List<User> printInActiveUsers() {
        List<User> list = getAllInActiveUsers();
        System.out.println(list);
        return list;
    }


}
