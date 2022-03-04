import java.util.NoSuchElementException;
public class Arbeidskrav_1 {
    public static void main(String[] args) {
        CarSystem carSystem = new CarSystem();
        carSystem.create();
        carSystem.display();
        carSystem.displayAveragePerson();
        carSystem.displayAverageAgeCar();
        carSystem.displayAverageMileage();

    }
}
