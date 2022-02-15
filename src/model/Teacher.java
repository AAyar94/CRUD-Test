package model;
import java.util.ArrayList;

public class Teacher extends Person{
    private ArrayList<Student> privateStudents = new ArrayList<>();

    public Teacher() {

    }
    public Teacher(int id){
        super(id);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", privateStudents=" + privateStudents +
                '}';
    }

    public void setPrivateStudents(ArrayList<Student> students){

        this.privateStudents = students;
    }

    public void setPrivateStudent(ArrayList<Student> students) {
    }
}
