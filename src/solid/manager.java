package solid;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getInfo() {
        return name + "-" + age;
    }
}

interface StudentSave {
    void save(Student sv);
}

interface Notifier {
    void notify(String mess);
}

class FileStudentSave implements StudentSave {
    public void save(Student sv) {
    }
}

class SendNottifier implements Notifier {
    public void notify(String mess) {
    }
}

class StudentManager {
    private List<Student> student = new ArrayList<>();
    private StudentSave saver;
    private Notifier notifier;

    public StudentManager(StudentSave saver, Notifier notifier) {
        this.saver = saver;
        this.notifier = notifier;
    }

    public void addStudent(Student sv) {
        student.add(sv);
        saver.save(sv);
        notifier.notify(sv.getInfo());
    }

    public void showAllStudents() {
        System.out.println("DSSV: ");
        for (Student s : student) {
            System.out.println(s.getInfo());
        }
    }
}

public class manager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentSave saver = new FileStudentSave();
        Notifier notifier = new SendNottifier();
        StudentManager manager = new StudentManager(saver, notifier);

        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + i);
            System.out.print("Tên: ");
            String name = scanner.nextLine();
            System.out.print("Tuổi: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            Student sv = new Student(name, age);
            manager.addStudent(sv);
        }
        manager.showAllStudents();
        scanner.close();
    }

}
