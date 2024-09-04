package com.tr.main;

import com.tr.entity.User;

import java.io.*;

public class MainApp {


    public static void main(String[] args) {

        User user = new User("miladrostami","123ert56rre","43553445345",18.45);

        try {
            //Serialization
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Parse\\Desktop\\MiladTask\\JavaCoreTask\\SerializableAndDeserializable-in-java\\transient-in-java-project\\src\\main\\resources\\serial.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(user);
            oos.close();
            fos.close();

            //Deserialization

            FileInputStream fis = new FileInputStream("C:\\Users\\Parse\\Desktop\\MiladTask\\JavaCoreTask\\SerializableAndDeserializable-in-java\\transient-in-java-project\\src\\main\\resources\\serial.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
User deserializationUser =(User) ois.readObject();
ois.close();
fis.close();
            System.out.println("Serializable User : " + user);
            System.out.println("Deserializable User :" + deserializationUser);

        } catch (ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }

    }
}
