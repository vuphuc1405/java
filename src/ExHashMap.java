import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExHashMap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> list = new HashMap<>();
        list.put("user1", "123456");
        list.put("user2", "123456");
        list.put("user3", "123456");
        list.put("user4", "123456");
        list.put("user5", "123456");
        list.put("user6", "123456");
        list.put("user7", "123456");
        list.put("user8", "123456");
        list.put("user9", "123456");
        list.put("user10", "123456");
        // System.out.println("Nhap ten dang nhap");
        // String username = sc.nextLine();
        // System.out.println("Nhap mat khau: ");
        // String password = sc.nextLine();
        // if (!list.containsKey(username)) {
        // System.out.println("Username khong ton tai");
        // } else if (!list.get(username).equals(password)) {
        // System.out.println("Sai password");
        // } else {
        // System.out.println("Login thanh cong");
        // }
        System.out.println("Danh sach");
        for (Map.Entry<String, String> entry : list.entrySet()) {
            String username = entry.getKey();
            String password = entry.getValue();
            System.out.println("Username: " + username + "| Password: " + password);
        }
        sc.close();
    }
}
