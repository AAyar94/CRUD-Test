import model.Lesson;
import model.Student;

public class StudentHelper {

    private Student[] students = new Student[10];
    private int lastIndex = 0;

    static void createStudent(int id,
                              String name,
                              String surname,
                              String gender,
                              String department,
                              int grade,
                              Lesson[] lessons)
    {
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

}
