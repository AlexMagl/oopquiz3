package quizes.q3.aleksandre_maghlakelidze_1;

import java.util.List;
public class HMSTester {
    public static void main(String[] args) {
        PersonManager personManager = new PersonManager();
        List<Person> persons = personManager.getPersons();
        HotelManager hotelManager = new HotelManager();

        for (Person person: persons) {
            hotelManager.checkIn(person, new Room(person));
        }
        hotelManager.displayInfo();

        Person Alex = new Person();
        Alex.setId("1234567890");
        Alex.setName("Aleksandre");
        Alex.setSurname("Maghlakelidze");

        Person firstPerson = persons.getFirst();
        Room alex = new Room(Alex);
        hotelManager.checkIn(firstPerson, alex);

        hotelManager.displayInfo();
        //Prints twice to demonstrate change in the rooms/persons.
    }
}