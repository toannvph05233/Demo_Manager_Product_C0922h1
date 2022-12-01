import io.ReadAndWrite;
import model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ManagerProduct {
    static ArrayList<Product> products = ReadAndWrite.read();
    static Scanner scanner = new Scanner(System.in);

    public static void add(Product product) {
        products.add(product);
        ReadAndWrite.write(products);
    }

    public static void edit(int id){
        for (int i = 0; i < products.size(); i++) {
            if (id == products.get(i).getId()){
                products.set(i,create());
                ReadAndWrite.write(products);
            }
        }
    }

    public static void show() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i).toString());
        }
    }

    public static Product create() {
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập name");
        String name = scanner.nextLine();
        System.out.println("Nhập price");
        double price = Double.parseDouble(scanner.nextLine());
        Product product = new Product(id, name, price);
        return product;
    }

    public static void showTop3Price() {
        Collections.sort(products, new SortByPrice());
        if (products.size() > 3) {
            for (int i = 0; i < 3; i++) {
                System.out.println(products.get(i).toString());
            }
        } else {
            for (int i = 0; i < products.size(); i++) {
                System.out.println(products.get(i).toString());
            }
        }
    }
}
