package inter;

import bean.Config;
import bean.User;
import initialize.Initialize;
import util.WriteAndReadObjectfromFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public interface FileManagerServiceInter {
    void printAllSubFilesAndFolders(String folderPath);


    void printAllSubFilesAndFolders();

    String askForPath();

    boolean checkUserAccessToFile(String fileOrFolderPath);

    User getLoggedInUser();

    boolean refreshConfig();

    Config readConfig() throws Exception;
}
