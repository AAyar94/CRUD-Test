import model.Person;
import model.Student;
import model.Teacher;

import java.util.Arrays;
import java.util.Scanner;

/***
 *
 * Öğrenci Kayıt Uygulaması
 *
 *  Bir öğrenci classımız olacak.
 *
 *  Person{
 *      id: Int,
 *      name: String,
 *      surname: String,
 *      gender: String,
 *  }
 *  Student {
 *      department: String,
 *      grade: Int,
 *      lessons: Lesson[],
 *  }
 *
 *  Lesson {
 *      id: Int,
 *      name: String,
 *      score: Int,
 *  }
 *
 *  Aşağıdaki işlemler bir menü yardımı ile seçilecek (CRUD)
 *      Öğrenci oluşturulabilecek -- completed
 *      Öğrenci güncellenebilecek -- completed
 *      Öğrenci silinebilecek -- completed
 *      Tüm öğrenciler listenelebilecek -- completed
 *
 *  Öğrenciler ilk aşamada bir arrayde tutulacak -- completed
 *
 */

public class Main {

    public static void main(String[] args) {

        IHelper studentHelper = new IHelper() {
            @Override
            public void create(Person person) {

            }

            @Override
            public void update(int targetId, Person updatedPerson) {

            }

            @Override
            public void delete(int targetId) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public Person[] getAll() {
                return new Person[0];
            }
        };
        TeacherHelper teacherHelper = new TeacherHelper();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Ogrenci icin 10; Ogretment icin 20 giriniz...");
            int mainInput = scanner.nextInt();

            if (mainInput == 10) {
                System.out.println("\n1- Ogrenci olustur\n2- Ogrenci Guncelle\n3- Ogrenci Sil\n4- Tum ogrencileri listele\n5- Tum ogrencileri sil");
                System.out.println("Lütfen bir işlem seçiniz...");
                int input = scanner.nextInt();
                showMenu(input, studentHelper);

            } else if (mainInput == 20) {
                System.out.println("\n1- Ogretmen olustur\n2- Ogretmen Guncelle\n3- Ogretmen Sil\n4- Tum Ogretmen listele\n5- Tum Ogretmen sil");
                System.out.println("Lütfen bir işlem seçiniz...");
                int input = scanner.nextInt();
                showMenu(input, teacherHelper);
            } else {
                return;
            }
        }

    }

    static void showMenu(int input, IHelper helper) {
        Scanner scannerMenu = new Scanner(System.in);
        switch (input) {
            case 1:
                System.out.println("Kisi Id'si giriniz:");
                int id = scannerMenu.nextInt();
                //Student student = new Student(id);

                Person person = null;

                if (helper instanceof StudentHelper) {
                    person = new Student(id);
                    ((StudentHelper) helper).collectNewStudentData((Student) person, scannerMenu);
                } else if (helper instanceof TeacherHelper) {
                    person = new Teacher(id);
                    ((TeacherHelper) helper).collectNewTeacherData((Teacher) person, scannerMenu);
                }

                helper.create(person);
                System.out.println("Kisi olusturuldu");
                break;
            case 2:
                // updateStudent()
                System.out.println("Güncellenecek öğrencinin id'sini giriniz:");
                int updateId = scannerMenu.nextInt();
                Student newStudent = new Student(updateId);
                //((StudentHelper) helper).collectNewStudentData(newStudent, scannerMenu);
                helper.update(updateId, newStudent);
                System.out.println("Ogrenci guncellendi");
                break;
            case 3:
                // deleteStudent()
                System.out.println("Silinecek öğrencinin id'sini giriniz:");
                int targetId = scannerMenu.nextInt();
                helper.delete(targetId);
                System.out.println("Ogrenci silindi");
                break;
            case 4:
                // getAllStudent()
                Person[] allPerson = helper.getAll();
                System.out.println("Kisiler asagidadir\n" + Arrays.toString(allPerson));
                break;
            case 5:
                helper.deleteAll();
                System.out.println("Tum ogrenciler silindi");
                break;
            default:
                String helperName = (helper instanceof StudentHelper) ? "student" : "teacher";
                System.out.println(helperName);
                System.out.println("yanlis girdi!");
                break;
        }
    }
}