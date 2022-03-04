import javax.annotation.processing.SupportedAnnotationTypes;
import java.util.*;
import java.util.stream.Stream;
import java.util.NoSuchElementException;

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
        Cars car2 = new Cars("Ford", "Raptor", 2017, 150000, "05-09-2017", "Pickup", person2);
        Cars car3 = new Cars("Volkswagen", "Transporter", 2004, 345000, "23-10-2002", "Varebil", person3);
        Cars car4 = new Cars("Prosche", "Panamera", 2019, 50000, "30-06-2019", "Personbil", person4);

        carList.addAll(List.of(new Cars[]{car1, car2, car3, car4}));


        personAgeList.addAll(List.of((calendar.get(Calendar.YEAR) - person1.getBirthYear()),
                (calendar.get(Calendar.YEAR) - person2.getBirthYear()),
                (calendar.get(Calendar.YEAR) - person3.getBirthYear()),
                (calendar.get(Calendar.YEAR) - person4.getBirthYear())));


        carMileageList.addAll(List.of(
                car1.getMilage(),
                car2.getMilage(),
                car3.getMilage(),
                car4.getMilage()));

        carAgeList.addAll(List.of(
                car1.getProductionYear(),
                car2.getProductionYear(),
                car3.getProductionYear(),
                car4.getProductionYear()));

    }

    public void displayAverageAgeCar() {

        OptionalDouble averageCarAge = carAgeList
                .stream()
                .mapToDouble(a -> a)
                .average();

        try {
            System.out.println("Gjennomsnitt årstall: " + averageCarAge.getAsDouble());
        }
        catch (NoSuchElementException exception) {
            System.out.println("Ingen biler registrert");
        }
    }


    public void displayAverageMileage() {


        OptionalDouble averageCarMileage = carMileageList
                .stream()
                .mapToDouble(a -> a)
                .average();

           System.out.println("Gjennomsnitt på hvor langt bilene er gått: " + averageCarMileage.getAsDouble());

    }
    public void displayAveragePerson() {
        int averageAgePerson = (int) personAgeList.stream()
                .mapToDouble(d -> d)
                .average()
                .orElse(0.0);

        System.out.println("Gjennomsnitt alder på personer registrert:  " + averageAgePerson);

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
