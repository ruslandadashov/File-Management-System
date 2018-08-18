package util;

import daoimpl.UserDaoImpl;
import inter.FileManagerServiceInter;
import daointer.*;
import inter.MenuServiceInter;
import inter.UserServiceInter;

public class DI {
    private static UserDaoInter userDaoInter = null;
    private static FileManagerServiceInter filemanager = null;
    private  static MenuServiceInter menu = null;
    private static UserServiceInter userservice =null;
    public static UserServiceInter userservice(){
        if(userservice==null){
            userservice = new UserServiceImpl();
        }
        return  userservice;
    }
    public static MenuServiceInter menuservice(){
        if(menu==null){
            menu= new MenuServiceImpl();
        }
        return  menu;

    }

    public static UserDaoInter userDao() {
        if (userDaoInter == null) {
            userDaoInter = new UserDaoImpl();
        }
        return userDaoInter;
    }

    public static FileManagerServiceInter file() {
        if (filemanager == null) {
            filemanager = new FileManagerServiceImpl();
        }
        return filemanager;
    }
}
