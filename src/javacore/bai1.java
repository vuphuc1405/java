package javacore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class SinhVien {
    private String ten;
    private String msv;

    public SinhVien(String ten, String msv) {
        this.ten = ten;
        this.msv = msv;
    }

    public String getTen() {
        return ten;
    }

    public String getMsv() {
        return msv;
    }

    @Override
    public String toString() {
        return "Ten: " + ten + ", MSV: " + msv;
    }
}

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<SinhVien> svList = new ArrayList<>();

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Hien thi danh sach");
            System.out.println("3. Tim kiem sinh vien theo ma");
            System.out.println("4. Xoa sinh vien theo ma");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Nhap so luong sinh vien can them: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhap sinh vien thu " + (i + 1));
                        System.out.print("Ten: ");
                        String ten = sc.nextLine();
                        System.out.print("Ma sinh vien: ");
                        String msv = sc.nextLine();
                        svList.add(new SinhVien(ten, msv));
                    }
                    break;

                case 2:
                    System.out.println("\n=== Danh sach sinh vien ===");
                    for (SinhVien sv : svList) {
                        System.out.println(sv);
                    }
                    break;

                case 3:
                    System.out.print("Nhap MSV can tim: ");
                    String searchMSV = sc.nextLine();
                    boolean found = false;
                    for (SinhVien sv : svList) {
                        if (sv.getMsv().equalsIgnoreCase(searchMSV)) {
                            System.out.println("Tim thay: " + sv);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Khong tim thay sinh vien.");
                    }
                    break;

                case 4:
                    System.out.print("Nhap MSV can xoa: ");
                    String deleteMSV = sc.nextLine();
                    boolean removed = svList.removeIf(sv -> sv.getMsv().equalsIgnoreCase(deleteMSV));
                    if (removed) {
                        System.out.println("Da xoa sinh vien.");
                    } else {
                        System.out.println("Khong tim thay sinh vien de xoa.");
                    }
                    break;

                case 0:
                    System.out.println("Tam biet!");
                    sc.close();
                    return;

                default:
                    System.out.println("Lua chon khong hop le.");
            }
        }
    }
}
