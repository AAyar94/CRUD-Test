import jdk.nashorn.internal.ir.CallNode;
import model.Person;
import model.Student;
import model.Teacher;

import java.util.ArrayList;
import java.util.Scanner;

public class TeacherHelper extends AbstractHelper {

    private final Teacher[] teachers = new Teacher[10];

    @Override
    void setDataSource(Person[] personArray) {
        super.setDataSource(teachers);
    }

    void collectNewTeacherData(Teacher teacher, Scanner scannerMenu) {
        System.out.println("Ogretmen bilgilerini giriniz: ");

        System.out.println("Ad giriniz: ");
        teacher.setName(scannerMenu.next());

        System.out.println("Soyad giriniz: ");
        teacher.setSurname(scannerMenu.next());

        System.out.println("Cinsiyet giriniz: ");
        teacher.setGender(scannerMenu.next());

        System.out.println("Ozel ogrenci sayisini giriniz:");
        int studentCount = scannerMenu.nextInt();
        ArrayList<Student> privateStudents = new ArrayList<>(studentCount);

        for (int i = 0; i < studentCount; i++) {
            System.out.println("Ozel ogrenci idsini giriniz: ");
            int id = scannerMenu.nextInt();
            Student student = new Student(id);
            privateStudents.add(student);
        }

        teacher.setPrivateStudent(privateStudents);

    }

}