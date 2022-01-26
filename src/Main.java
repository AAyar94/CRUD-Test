import model.Lesson;
import model.Student;

import java.util.Scanner;

public class Main {

    /***
     * ögrenci kayıt uygulaması
     *
     * ögrenci clası olacak
     * person:{
     *     id : Int
     *      *     name : Str
     *      *     Surname : Str
     *      *     Gender : Str
     * }
     * Student:{
     *     department : Str
     *     period : Int
     *     Lessons : Lesson[]
     *     LessonGrade: LessonGrade[]
     * }
     *
     *  LessonGrade[
     *  LessonId Int
     *  Grade Int
     * ]
     *
     *     Lesson[
     *     ıd Int
     *     Name String
     *     grade Int
     *     ]
     * assagıdaki islemler bir secici ile secilecek
     *
     * ögrenci olusturabilcek
     * ögrenci guncellenebilecek
     * ögrenci silinebilecek
     * ögrenci listesi görüntülenebilecek
     *
     * ögrenciler bir arrayda tutulacak
     * */

    public static void main(String[] args) {
        // write your code here
        Scanner scanner;
        while (true) {
            System.out.println("1: Öğrenci Oluştur\n2: Öğrenci Güncelle\n3: Öğrenci Sil\n4: Öğrencileri Listele");

            System.out.println("Lütfen Bir işlem seçiniz...");
            scanner = new Scanner(System.in);
            StudentHelper studentHelper = new StudentHelper();

        int input = scanner.nextInt();
        showMenu(input,StudentHelper);
        }
    }


    static void showMenu(int input, StudentHelper studentHelper){


        while(true){
            switch (input){
                case 1:{
                    //createstudent()
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Öğrencinin Kişisel bilgilerini giriniz..");

                    System.out.println("id giriniz");
                    int sId = sc.nextInt();

                    System.out.println("İsmini giriniz");
                    String sName = sc.next();

                    System.out.println("Soyadını giriniz");
                    String sSurname = sc.next();

                    System.out.println("Cinsiyeti giriniz");
                    String sGender = sc.next();

                    System.out.println("Bölüm giriniz");
                    String sDepartment = sc.next();

                    System.out.println("Sınıf giriniz");
                    int sGrade = Integer.parseInt(sc.next());

                    System.out.println("Öğrencinin Ders sayısını giriniz..");
                    Lesson[] SLessons = new Lesson[Integer.parseInt(sc.next())];



                    for( Lesson slesson : SLessons){
                        System.out.println("Ders bilgilerini giriniz");
                        Lesson newLesson = new Lesson();

                        System.out.println("Ders id giriniz");
                        newLesson.setId(Integer.parseInt(sc.next()));

                        System.out.println("ders adı giriniz");
                        newLesson.setName(sc.next());

                        System.out.println("ders Notu giriniz");
                        newLesson.setScore(Integer.parseInt(sc.next()));
                    }


                    StudentHelper.createStudent(
                        sId,sName,sSurname,sGender,sDepartment,sGrade,slesson);
                    System.out.println("Öğrenci oluşturuldu");
                    break;
                        }
                case 2:{
                    //updateStudent()
                    System.out.println("öğrenci güncellendi");
                    break;
                        }
                case 3:{
                    //deleteStudent()
                    System.out.println("Öğrenci Silindi");
                    break;
                        }
                case 4:{
                    //GetAllStudent()
                    Student[] allStudents = studentHelper.getAllStudent();
                    System.out.println("öğrenci listesi");
                    break;
                        }
                default:{
                    System.out.println("Yanlış sayı girildi");
                        }
            }
        }
    }
}