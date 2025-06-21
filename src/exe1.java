import java.util.Scanner;

public class exe1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap can nang: ");
        float weight = sc.nextFloat();
        System.out.println("Nhap chieu cao: ");
        float height = sc.nextFloat();
        float bmi = weight / (height * height);

        if (bmi < 18.5) {
            System.out.println("Gay");
        } else if (bmi < 25) {
            System.out.println("Binh thuong");
        } else if (bmi < 30) {
            System.out.println("thua can");
        } else {
            System.out.println("Beo phi");
        }
        sc.close();
    }
}
