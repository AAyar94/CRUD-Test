package model;

import java.util.Arrays;

public class Student extends Person {
    private String department;
    private int grade;
    private Lesson[] lessons;

    public Student(){

    }

    public Student(int id,String name,String surname,String gender) {
        super(id,name,surname,gender);

    }

    public Student(int id,String name,String surname,String gender,String department,int grade, Lesson[] lessons){
        super(id,name,surname,gender);
        setDepartment(department);
        setGrade(grade);
        setLessons(lessons);
    }

    public Student(int id) {
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Lesson[] getLessons() {
        return lessons;
    }

    public void setLessons(Lesson[] lessons) {
        this.lessons = lessons;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", grade=" + grade +
                ", lessons=" + Arrays.toString(lessons) +
                '}';
    }
}
