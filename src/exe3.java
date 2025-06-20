import java.util.HashSet;
import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> list = new HashSet<>();
        System.out.println("Nhap danh sach ten ( Nhap x de dung! ): ");
        while ((true)) {
            String ten = sc.nextLine();
            if (ten.equals("x"))
                break;
            list.add(ten);
        }
        System.out.println("DS: ");
        list.forEach(System.out::println);
    }
}
