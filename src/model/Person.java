package model;

public class Person {
    protected int id;
    protected String name;
    protected String surname;
    protected String gender;

    //default constructor
    public Person(){
    }
    public Person(int id){
        this.id = id;
    }

    //second constructor
    public Person(int id,String name,String surname, String gender){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void  setName(String name){
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String next){
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
