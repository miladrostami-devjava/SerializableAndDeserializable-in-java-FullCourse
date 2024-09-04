package ir.serialize.service;
import ir.serialize.entity.CustomProduct;
import ir.serialize.entity.ExternalProduct;
import ir.serialize.entity.Product;

import java.io.*;

public class ProductManager {

    public void saveProduct(Product product, String filename) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(product);
        }
    }

    public void saveProduct(CustomProduct customProduct, String filename) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(customProduct);
        }
    }
    public void saveProduct(ExternalProduct externalProduct, String filename) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(externalProduct);
        }
    }



    public Product loadProduct(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (Product) ois.readObject();
        }
    }
    public CustomProduct loadcustomProduct(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (CustomProduct) ois.readObject();
        }
    }
    public ExternalProduct loadExternalProduct(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (ExternalProduct) ois.readObject();
        }
    }

    public void printProduct(Product product, OutputStream out) {
        PrintStream printStream = new PrintStream(out);
        printStream.println(product);
    }

    public void printCustomProduct(CustomProduct customProduct, OutputStream out) {
        PrintStream printStream = new PrintStream(out);
        printStream.println(customProduct);
    }
    public void printExternalProduct(ExternalProduct externalProduct, OutputStream out) {
        PrintStream printStream = new PrintStream(out);
        printStream.println(externalProduct);
    }



    public void logProductDetails(Product product, Writer writer) {
        PrintWriter printWriter = new PrintWriter(writer);
        printWriter.println(product);
    }
    public void logCustomProductDetails(CustomProduct customProduct, Writer writer) {
        PrintWriter printWriter = new PrintWriter(writer);
        printWriter.println(customProduct);
    }
    public void logExternalProductDetails(ExternalProduct externalProduct, Writer writer) {
        PrintWriter printWriter = new PrintWriter(writer);
        printWriter.println(externalProduct);
    }



}
