package daoimpl;

import bean.User;
import initialize.Initialize;
import inter.FileManagerServiceInter;
import inter.UserServiceInter;
import daointer.*;
import util.DI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserDaoImpl implements UserDaoInter {
    FileManagerServiceInter fms = DI.file();
    public   boolean add(User user) {
        List<User> list= getAllUsers();
        list.add(user);
        return fms.refreshConfig();
    }
    public  boolean save(User user){
        return  fms.refreshConfig();

    }
    public  List<User> getAllUsers() {

        return Initialize.config.getAllusers();
    }

    @Override
    public List<User> getAllActiveUsers() {
        List<User> allUsers = getAllUsers();
        if(allUsers==null || allUsers.size()==0){
            return Collections.emptyList();
        }

        List<User> activeUsers = new ArrayList<>();

        for(User u: allUsers){
            if(u.getStatus()==1){
                activeUsers.add(u);
            }
        }
        return activeUsers;
    }





    @Override
    public List<User> getAllInAactiveUsers() {
        List<User> allUsers = getAllUsers();
        if(allUsers==null || allUsers.size()==0){
            return Collections.emptyList();
        }

        List<User> inactiveUsers = new ArrayList<>();

        for(User u: allUsers){
            if(u.getStatus()==0){
                inactiveUsers.add(u);
            }
        }
        return inactiveUsers;
    }

    }



