import model.Person;

public interface IHelper {
    void create(Person person);

    void update(int targetId, Person updatedPerson);

    void delete(int targetId);

    void deleteAll();

    Person[] getAll();

}