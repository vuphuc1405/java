import java.util.ArrayList;
import java.util.Scanner;

public class exe2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            System.out.println("\n1. Them sinh vien");
            System.out.println("2. Hien thi danh sach");
            System.out.println("3. Tim kiem sinh vien theo ma");
            System.out.println("4. Xoa sinh vien theo ma");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Nhap ten va msv: ");
                    String sv = sc.nextLine();
                    list.add(sv);
                    break;
                case 2:
                    System.out.println("Danh sach sv: ");
                    list.forEach(System.out::println);
                    break;
                case 3:
                    System.out.println("Nhap msv can tim: ");
                    String ma = sc.nextLine();
                    for (String tk : list) {
                        if (tk.contains(ma)) {
                            System.out.println(tk);
                        }
                    }
                    break;
                case 4:
                    System.out.print("Nhap ma can xoa: ");
                    String indexToRemove = sc.nextLine();
                    list.removeIf(sv1 -> sv1.contains(indexToRemove));
                    break;
                default:
                    break;
            }
        }

    }

}
