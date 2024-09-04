package ir.serialize;

import ir.serialize.entity.CustomProduct;
import ir.serialize.entity.ExternalProduct;
import ir.serialize.entity.Product;
import ir.serialize.service.ProductManager;

import java.io.FileWriter;
import java.io.IOException;

public class MainApp {

    public static void main(String[] args) {

        ProductManager manager = new ProductManager();

        // Create different products
        Product product = new Product(1, "Laptop", 1000.0, "High-end gaming laptop");
        CustomProduct customProduct = new CustomProduct(2, "Smartphone", 800.0, "Latest model with AI features");
        ExternalProduct externalProduct = new ExternalProduct(3, "Tablet", 600.0, "10-inch screen, 4GB RAM");

        try {
            // Serialization and deserialization of products
            manager.saveProduct(product, "C:\\Users\\Parse\\Desktop\\MiladTask\\JavaCoreTask\\SerializableAndDeserializable-in-java\\ProductManagementSystem-Project-Full\\src\\main\\resources\\product.ser");
            Product loadedProduct = manager.loadProduct("C:\\Users\\Parse\\Desktop\\MiladTask\\JavaCoreTask\\SerializableAndDeserializable-in-java\\ProductManagementSystem-Project-Full\\src\\main\\resources\\product.ser");

            // Print product information to the console with PrintStream
            manager.printProduct(loadedProduct, System.out);

            // Record product log with PrintWriter
            try (FileWriter writer = new FileWriter("C:\\Users\\Parse\\Desktop\\MiladTask\\JavaCoreTask\\SerializableAndDeserializable-in-java\\ProductManagementSystem-Project-Full\\src\\main\\resources\\product.log", true)) {
                manager.logProductDetails(loadedProduct, writer);
            }

            // Similar work for CustomProduct and ExternalProduct
            manager.saveProduct(customProduct, "C:\\Users\\Parse\\Desktop\\MiladTask\\JavaCoreTask\\SerializableAndDeserializable-in-java\\ProductManagementSystem-Project-Full\\src\\main\\resources\\customProduct.ser");
            CustomProduct loadedCustomProduct = (CustomProduct) manager.loadcustomProduct("C:\\Users\\Parse\\Desktop\\MiladTask\\JavaCoreTask\\SerializableAndDeserializable-in-java\\ProductManagementSystem-Project-Full\\src\\main\\resources\\customProduct.ser");
            manager.printCustomProduct(loadedCustomProduct, System.out);

            manager.saveProduct(externalProduct, "C:\\Users\\Parse\\Desktop\\MiladTask\\JavaCoreTask\\SerializableAndDeserializable-in-java\\ProductManagementSystem-Project-Full\\src\\main\\resources\\externalProduct.ser");
            ExternalProduct loadedExternalProduct = (ExternalProduct) manager.loadExternalProduct("C:\\Users\\Parse\\Desktop\\MiladTask\\JavaCoreTask\\SerializableAndDeserializable-in-java\\ProductManagementSystem-Project-Full\\src\\main\\resources\\externalProduct.ser");
            manager.printExternalProduct(loadedExternalProduct, System.out);

        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

    }
}
