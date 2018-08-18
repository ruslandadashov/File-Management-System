import bean.User;
import initialize.Initialize;
import inter.FileManagerServiceInter;
import inter.MenuServiceInter;
import inter.UserServiceInter;
import util.*;
import daointer.*;

public class Main {
    private static FileManagerServiceInter fileManagerService = DI.file();
    private static MenuServiceInter menuService = DI.menuservice();
    private static UserServiceInter userservice = DI.userservice();


    public static void main(String[] args) throws Exception {
        Initialize.initialize();
        while (true) {
            int selectedMenu = menuService.showMenu();

        if (selectedMenu == 1) {
            userservice.printAllUsers();
        } else if (selectedMenu == 2) {
            userservice.printAllActiveuser();
        } else if (selectedMenu == 3) {
            userservice.printInActiveUsers();
        } else if (selectedMenu == 4) {
            userservice.approveUser();
        } else if (selectedMenu == 5) {
            userservice.prinyMySelf();
        } else if (selectedMenu == 6) {
            fileManagerService.printAllSubFilesAndFolders();
        } else if (selectedMenu == 7) {
            userservice.register();
        } else if (selectedMenu == 8) {
            userservice.login();
        } else if (selectedMenu == 9) {
            userservice.setNonAccessibleFileOrFoldersForUser();
        }
    }


    }
}







