import model.Lesson;
import model.Student;

import java.util.Scanner;

public class StudentHelper {

    private static Student[] students = new Student[10];
    private static int lastIndex = 0;

    static void createStudent(int id,
                              String name,
                              String surname,
                              String gender,
                              String department,
                              int grade,
                              Lesson[] lessons
    ){
        if(lastIndex >= 10){
            System.out.println("Öğrenci kontenjanına ulaşıldı.");
            return;
        }
        Student newStudent = new Student(id, name, surname, gender, department, grade, lessons);
        students[lastIndex] = newStudent;
        lastIndex += 1;
    }

    void updateStudent(){

    }

    void deleteStudent() {

    }

    Student[] getAllStudent(){
        return students;

    }

    public void collectNewStudentData(Student person, Scanner scannerMenu) {
    }
}
