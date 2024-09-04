package com.serial;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) {

        Product product = new Product(1, "Laptop", 1500.0);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("product.ser"))) {
            oos.writeObject(product);
            System.out.println("Product has been serialized: " + product);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("product.ser"))) {
            Product deserializedProduct = (Product) ois.readObject();
            System.out.println("Product has been deserialized: " + deserializedProduct);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


}
