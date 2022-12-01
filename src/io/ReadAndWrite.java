package io;

import model.Product;

import java.io.*;
import java.util.ArrayList;

public class ReadAndWrite {
    public static void write(ArrayList<Product> products){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("product.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Product> read(){
        try {
            FileInputStream fileInputStream = new FileInputStream("product.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            return (ArrayList<Product>) objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }
}
