import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CarSystem {

    ArrayList<Person> personList = new ArrayList<>();
    ArrayList<Cars> carList = new ArrayList<>();
    ArrayList<Integer> personAgeList = new ArrayList<>();
    ArrayList<Integer> carAgeList = new ArrayList<>();
    ArrayList<Integer> carMileageList = new ArrayList<>();
    Calendar calendar = Calendar.getInstance();


    public void create() {


        Person person1 = new Person("Sander Jevnaker", 1996);
        Person person2 = new Person("Fredrik Wæge", 1988);
        Person person3 = new Person("Daniel Engelstad", 2000);
        Person person4 = new Person("Marucs Øksnes", 1996);

        personList.addAll(List.of(new Person[]{person1, person2, person3, person4}));

        Cars car1 = new Cars("Dacia", "1300", 1964, 450000, "05-07-1968", "Personbil", person1);

        carList.addAll(List.of(new Cars[]{car1}));

            }

    public void display() {
        for (Person person : personList) {
            person.display();
            for (Cars cars : carList) {
                if (cars.getOwnedBy() == person.getId()) {
                    cars.display();
                }
            }
        }
    }

}
