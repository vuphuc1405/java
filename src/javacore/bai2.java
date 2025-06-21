package javacore;

import java.util.HashSet;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> emailSet = new HashSet<>();
        System.out.println("Nhap so luong email: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Email thu " + (i + 1));
            String email = sc.nextLine();
            emailSet.add(email);
        }
        System.out.println("Danh sach email duy nhat: ");
        for (String e : emailSet) {
            System.out.println(e);
        }
        sc.close();
    }
}
