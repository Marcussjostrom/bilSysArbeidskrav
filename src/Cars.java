public class Cars extends CarSystem {

    private final String producer;
    private final String name;
    private final int productionYear;
    private final int milage;
    private final String milageDate;
    private final String carType;
    private final int ownedBy;

    public Cars(String producer, String name, int productionYear, int milage, String milageDate, String carType, Person owner) {
        this.producer = producer;
        this.name = name;
        this.productionYear = productionYear;
        this.milage = milage;
        this.milageDate = milageDate;
        this.carType = carType;
        this.ownedBy = owner.getId();


    }

    public int getOwnedBy() {
    return ownedBy;
}

    public String getProducer() {
        return producer;
    }


    public String getName() {
        return name;
    }


    public String getCarType() {
        return carType;
    }


    public int getProductionYear() {
        return productionYear;
    }

    public int getMilage() {
        return milage;
    }

    public String getMilageDate() {
        return milageDate;
    }

    public void display() {
        System.out.println("\t" + "\t" + "Produsent: " + getProducer());
        System.out.println("\t" + "\t" + "Navn: " + getName());
        System.out.println("\t" + "\t"+ "Type: " + getCarType());
        System.out.println("\t" + "\t" + "Produksjons år: " + getProductionYear());
        System.out.println("\t" + "\t" + "Distanse: " + getMilage());
        System.out.println("\t" + "\t" + "Dato når distanse startet: " + getMilageDate());
        System.out.println(" ");

    }
}

