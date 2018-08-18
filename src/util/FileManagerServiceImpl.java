package util;

import bean.Config;
import bean.User;
import initialize.Initialize;
import inter.FileManagerServiceInter;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class FileManagerServiceImpl implements FileManagerServiceInter {
    public static  String fileName = "fmsconfig.ser";

    public  void printAllSubFilesAndFolders(String folderPath) {

        File folder = new File(folderPath);
        Path file = folder.toPath();
        if (Files.isDirectory(file)) {
            File[] files = folder.listFiles();
            for (File f : files) {
                System.out.println("f.getAbsolutePath()" + f.getAbsolutePath());

            }
        } else if (Files.isRegularFile(file)) {
            System.out.println("folderPath" + folderPath);
        }
    }


    public  void printAllSubFilesAndFolders() {
        String path = askForPath();
        boolean hasAccess = checkUserAccessToFile(path);
        if (hasAccess) {
            printAllSubFilesAndFolders(path);
        } else {
            System.out.println("You don't have an access");
        }
    }

    public  String askForPath() {
        System.out.println("pathi daxil et");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        return path;
    }
    public  boolean checkUserAccessToFile(String fileOrFolderPath) {
        User user =getLoggedInUser();
        List<String> nonAccessibleFileOrFolders = user.getNonAccessableFileOorFolders();
        boolean hasAccess = !nonAccessibleFileOrFolders.contains(fileOrFolderPath);
        return hasAccess;
    }

    public User getLoggedInUser() {
        return Initialize.config.getLoggedInUser();

    }

    public  boolean refreshConfig(){
        return WriteAndReadObjectfromFile.writeObjectToFile(Initialize.config,fileName);
    }
    public  Config readConfig() throws Exception {
        return (Config) WriteAndReadObjectfromFile.readObjectFromFile(fileName);
    }

}
