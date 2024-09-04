package uid.java.main;

import uid.java.entity.User;

import java.io.*;

public class MainApp {


    public static void main(String[] args) {

        User user = new User("reza","43rere54t","4343343434",12.43);
        try {
            //Serialization
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Parse\\Desktop\\MiladTask\\JavaCoreTask\\SerializableAndDeserializable-in-java\\serialVersionUID-in-java\\src\\main\\resources\\fileObj.obj");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(user);
            oos.close();
            fos.close();

            //Deserialization

            FileInputStream fis = new FileInputStream("C:\\Users\\Parse\\Desktop\\MiladTask\\JavaCoreTask\\SerializableAndDeserializable-in-java\\serialVersionUID-in-java\\src\\main\\resources\\fileObj.obj");
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
