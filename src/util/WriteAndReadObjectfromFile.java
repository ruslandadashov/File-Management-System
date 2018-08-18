package util;

import java.io.*;

public class WriteAndReadObjectfromFile {

        public static boolean writeObjectToFile(Object object, String name) {
            FileOutputStream fout = null;
            ObjectOutputStream oos = null;

            try {//try-with-resources

                fout = new FileOutputStream(name);
                oos = new ObjectOutputStream(fout);
                oos.writeObject(object);
                return  true;

            } catch (Exception ex) {

               throw  new RuntimeException(ex);

            } finally {

                if (fout != null) {
                    try {
                        fout.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                if (oos != null) {
                    try {
                        oos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }
        }


        public static Object readObjectFromFile(String name) throws Exception {

            Object obj=null;
            try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(name))){
                obj = in.readObject();
            }finally{
                return obj;
            }
        }


        public static void writeObjectByObject(Object[] objects, String fileName, boolean append) throws Exception {
            FileOutputStream fos = new FileOutputStream(fileName, append);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (int i = 0; i < objects.length; i++) {
                Object c = objects[i];
                oos.writeObject(c);
            }
        }

        public static Object[] readObjectByObject(int count, String fileName) throws Exception {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream input = new ObjectInputStream(fis);
            Object[] objects = new Object[count];
            for (int i = 0; i < 2; i++) {
                Object obj = input.readObject();
                objects[i] = obj;
            }

            return objects;
        }
    }




