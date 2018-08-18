package util;

import bean.User;

import java.util.Scanner;

public class MenuUtil {
    //    public static int menuUtil() {
    public static final int menuDescriptionBeforeLogin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Register\n" +
                           "2.Login\n");

        int selectedmenu = sc.nextInt();
        return selectedmenu;


    }

    public static final int menuDescriptionAfterLoginAdmin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose menu:\n" +
                "3.Show users\n" +
                "4.Show active users\n" +
                "5.Show inactive users\n" +
                "6.Approve user\n " +
                "7.Set non accessible files or folders for user");
        int selectedmenu = sc.nextInt();
        return selectedmenu;
    }


    public static final int menuDescriptionAfterLoginUser()

    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose menu:\n" +
                "8.Show myself\n" +
                "9.Enter file or folder\n");
        int selectedmenu = sc.nextInt();
        return selectedmenu;
    }
//    public int showMenu() {
//        Scanner sc = new Scanner(System.in);
//        User loggedInUser = UserServiceImpl.getLoggedInUser();
//        if(loggedInUser!=null) {
//            if (loggedInUser.isAdmin()) {
//                System.out.println( menuDescriptionAfterLoginUser());
//            }else{
//                System.out.println(menuDescriptionAfterLoginUser());
//            }
//        }else{
//            System.out.println(menuDescriptionBeforeLogin());
//        }
//        int selectedMenu =  sc.nextInt();
//        return selectedMenu;
//    }
}







