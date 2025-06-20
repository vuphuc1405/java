import java.util.ArrayList;
import java.util.Scanner;

public class Learn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int choice;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Thêm phần tử");
            System.out.println("2. Sửa phần tử");
            System.out.println("3. Xóa phần tử");
            System.out.println("4. Hiển thị danh sách");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = sc.nextInt();
            sc.nextLine(); // Xóa bộ nhớ đệm

            switch (choice) {
                case 1:
                    System.out.println("Nhap phan tu can them: ");
                    String value = sc.nextLine();
                    list.add(value);
                    break;
                case 2:
                    System.out.println("Nhap vi tri phan tu can sua: ");
                    int indexToEdit = sc.nextInt();
                    sc.nextLine();
                    if (indexToEdit >= 0 && indexToEdit < list.size()) {
                        System.out.println("Nhap gia tri moi: ");
                        String newValue = sc.nextLine();
                        list.set(indexToEdit, newValue);
                    } else {
                        System.out.println("Vi tri khong hop le");
                    }
                    break;
                case 3:
                    System.out.println("Nhap vi tri can xoa: ");
                    int indexToRemove = sc.nextInt();
                    if (indexToRemove >= 0 && indexToRemove < list.size()) {
                        list.remove(indexToRemove);
                        System.out.println("da xoa");
                    } else {
                        System.out.println("Vi tri khong hop le");
                    }
                    break;
                case 4:
                    System.out.println("Danh sach: ");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.println(list.get(i));
                    }
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 0);
    }
}
