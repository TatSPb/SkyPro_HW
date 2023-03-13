package HW_2023_03_06;

public class Truck extends Transport implements Serviceable {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("меняет покрышку у грузовика;");
    }

    public void checkEngine() {
        System.out.println("проверяет двигатель у грузовика;");
    }

    public void checkTrailer() {
        System.out.println("проверяет прицеп у грузовика;");
    }

    @Override
    public void service(Mechanic mechanic) {
        super.service(mechanic);
        checkEngine();
        checkTrailer();
    }
}
