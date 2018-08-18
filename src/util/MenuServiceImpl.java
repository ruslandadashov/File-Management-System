package util;

import bean.User;
import inter.FileManagerServiceInter;
import inter.MenuServiceInter;
import inter.UserServiceInter;
import  daointer.*;
import bean.*;

import java.io.File;
import java.util.Scanner;

public class MenuServiceImpl implements MenuServiceInter {
FileManagerServiceInter fms = DI.file();
    @Override
    public int showMenu() {
        Scanner sc = new Scanner(System.in);
        User loggedInUser = fms.getLoggedInUser();
        if(loggedInUser!=null) {
            if (loggedInUser.isAdmin()) {
                System.out.println(MenuMessage.menuAfterLoginAdmin);
            }else{
                System.out.println(MenuMessage.menuAfterLoginUser);
            }
        }else{
            System.out.println(MenuMessage.menuBeforeLogin);
        }
        int selectedMenu =  sc.nextInt();
        return selectedMenu;
    }
}
