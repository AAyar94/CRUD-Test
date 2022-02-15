import model.Person;

import java.util.Arrays;

public abstract class AbstractHelper implements IHelper {

    private Person[] persons = new Person[10];
    private int lastIndex = 0;

    void setDataSource(Person[] personArray){
        this.persons = personArray;
    }

    @Override
    public void create(Person person) {
        if (lastIndex >= 10) {
            System.out.println("kontenjanı dolu!");
            return;
        }
        persons[lastIndex] = person;
        lastIndex += 1;
    }

    @Override
    public void update(int targetId, Person updatedPerson) {
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getId() == targetId) {
                persons[i] = updatedPerson;
                break;
            }
        }
    }

    @Override
    public void delete(int targetId) {
        for (int i = 0; i < persons.length; i++) {
            if (persons[i].getId() == targetId) {
                persons[i] = null;
                break;
            }
        }
    }

    @Override
    public void deleteAll() {
        Arrays.fill(persons, null);
    }

    @Override
    public Person[] getAll() {
        return persons;
    }
}