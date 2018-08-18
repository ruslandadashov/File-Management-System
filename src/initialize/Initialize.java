package initialize;

import bean.Config;
import bean.User;
import inter.FileManagerServiceInter;
import util.DI;
import util.WriteAndReadObjectfromFile;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Initialize implements Serializable {
    public static Config config;




    public static void initialize() throws Exception {
        FileManagerServiceInter fms = DI.file();
        config = fms.readConfig();
        if(config==null){
            User user  =  new User("admin","admin");
            user.setPozition(1);
            user.setStatus(1);
            config = new Config();
            List<User>list = new ArrayList<>();
            list.add(user);
            config.setAllusers(list);
           fms.refreshConfig();
            initialize();


        }
        else{
            List<User>list = new ArrayList<>(config.getAllusers());
            config.setAllusers(list);

        }


    }



}
