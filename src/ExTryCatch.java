import java.util.Scanner;

public class ExTryCatch {

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // try {
    // System.out.println("Nhap so tuoi: ");
    // int age = sc.nextInt();
    // if (age < 18) {
    // System.out.println("Khong du tuoi");
    // } else {
    // System.out.println("Tuoi hop le");
    // }
    // } catch (Exception e) {
    // System.out.println("Error: Du lieu khong hop le");
    // } finally {
    // System.out.println("END");
    // }
    // }

    public static void checkAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Tuoi phai lon hon 17");
        } else {
            System.out.println("Tuoi hop le");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tuoi: ");
        int age = sc.nextInt();
        try {
            checkAge(age);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}