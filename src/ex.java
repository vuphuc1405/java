import java.util.*;

class Student {
    String name;
    double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

}

public class ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> list = new ArrayList<>();
        System.out.println("Nhap sl sv: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Ten: ");
            String name = sc.nextLine();
            System.out.println("Diem: ");
            double score = sc.nextInt();
            sc.nextLine();
            list.add(new Student(name, score));
        }

        double max = list.stream().mapToDouble(s -> s.score).max().orElse(0);
        System.out.println("Sinh vien co diem cao nhat: ");
        list.stream().filter(s -> s.score == max).forEach(s -> System.out.println(s.name
                + s.score));
        sc.close();
    }
}
