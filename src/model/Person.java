package model;

public class Person {
    protected int id;
    protected String name;
    protected String surname;
    protected String gender;

    //default constructor
    public Person(){
    }

    //second constructor
    public Person(int id,String name,String surname, String gender){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

}
