import java.util.Scanner;

public class exe4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("a: ");
            int a = sc.nextInt();
            System.out.println("b: ");
            int b = sc.nextInt();
            double c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("ERROR: Khong the chia cho 0");
        } catch (Exception e) {
            System.out.println("ERROR: du lieu khong hop le");
        } finally {
            System.out.println("END");
        }

    }
}
