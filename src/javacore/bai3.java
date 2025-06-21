package javacore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Tên sp: " + name + "Giá: " + price;
    }
}

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        System.out.println("Nhập số lượng sản phẩm");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Sản phẩm thứ " + (i + 1));
            System.out.println("Tên sp: ");
            String name = sc.nextLine();
            System.out.println("Giá: ");
            double price = sc.nextDouble();
            sc.nextLine();
            products.add(new Product(name, price));
        }
        System.out.println("Danh sách sp: ");
        for (Product p : products) {
            System.out.println(p);
        }
        // max
        Product maxProduct = products.get(0);
        for (Product p : products) {
            if (p.price > maxProduct.price) {
                maxProduct = p;
            }
        }
        System.out.println("SP có giá cao nhất: " + maxProduct);
        // remove
        System.out.println("Nhập tên sản phẩm cần xóa: ");
        String removeName = sc.nextLine();
        products.removeIf(p -> p.name.equalsIgnoreCase(removeName));
        System.out.println("DS sau khi xóa:");
        for (Product p : products) {
            System.out.println(p);
        }
        sc.close();
    }
}
