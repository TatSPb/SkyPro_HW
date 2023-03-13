package HW_2023_03_06;

public class Car extends Transport implements Serviceable {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("меняет покрышку у автомобиля;");
    }

    public void checkEngine(){
        System.out.println("проверяет двигатель у автомобиля;");
    }
    @Override
    public void service(Mechanic mechanic) {
        super.service(mechanic);
        checkEngine();
    }
}
