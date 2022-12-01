import model.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Quản lý product");
            System.out.println("1. Hiển thị");
            System.out.println("2. Thêm product");
            System.out.println("3. Edit");
            System.out.println("4. Hiển thị 3 sản phẩm giá lớn nhất");
            System.out.println("5. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    ManagerProduct.show();
                    break;
                case 2:
                    Product product = ManagerProduct.create();
                    ManagerProduct.add(product);
                    break;
                case 3:
                    System.out.println("Nhập id muốn sửa");
                    int id = Integer.parseInt(scanner.nextLine());
                    ManagerProduct.edit(id);
                    break;
                case 4:
                    ManagerProduct.showTop3Price();
                    break;
            }
        }
    }
}
