package util;

import bean.User;
import initialize.Initialize;
import inter.UserServiceInter;
import daointer.UserDaoInter;

import java.util.*;


public class UserServiceImpl extends AbstractUserService {
    private UserDaoInter dao= DI.userDao();


    public User registerUser() {
        Scanner sc = new Scanner(System.in);
        List<User> users = new ArrayList<>();
        System.out.println("name:");
        String name = sc.nextLine();

        System.out.println("surname:");
        String surname = sc.nextLine();

        System.out.println("username:");
        String username = sc.nextLine();

        System.out.println("password");
        String password = sc.nextLine();
        User user = new User(name, surname, username, password);


        return user;


    }
    public  List<String> getAllNonAccessibeFileOrFolders() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many file or folder nonaccess?");
        int count = sc.nextInt();
        sc.nextLine();
        List<String> listnonaccess = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            System.out.println("Type nonaccess file or folders ");
            String list = sc.nextLine();
            listnonaccess.add(list);
        }
        return listnonaccess;
    }

    public  void setNonAccessibleFileOrFoldersForUser() {
        System.out.println("id daxil edin");
        String id = askForId();
        User user =getUserByteId(id);
        List<String> naf = getAllNonAccessibeFileOrFolders();
        user.setNonAccessableFileOorFolders(naf);
       dao.save(user);
    }


    public List<User> getAllUsers() {
        return dao.getAllUsers();
    }

    public List<User> getAllActiveUsers() {
        return dao.getAllActiveUsers();
    }



    public List<User> getAllInActiveUsers() {
        return dao.getAllInAactiveUsers();
    }


    public boolean approveUser() {
        System.out.println("Which user you want to approve");
        Scanner sc = new Scanner(System.in);
        List<User> inActiveusers = getAllInActiveUsers();
        if (inActiveusers.size() == 0) {
            System.out.println("There is not any user");
            return false;
        }

        String id = askForId();
        User user = getUserByteId(id);
        user.setStatus(1);
        return dao.save(user);
    }


    public String askForId() {
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        return id;
    }


    public User askUsernameAndPassword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("username:");
        String username = sc.nextLine();
        System.out.println("password");
        String password = sc.nextLine();
        User user = new User(username, password);
        return user;

    }



    public boolean register() {
        User user = registerUser();
        return dao.add(user);
    }




}



