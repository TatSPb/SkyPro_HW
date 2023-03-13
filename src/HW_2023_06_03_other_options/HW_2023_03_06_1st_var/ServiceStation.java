package HW_2023_06_03_other_options.HW_2023_03_06_1st_var;

public class ServiceStation implements Serviceable {

    public void check(Car[] cars) {
                System.out.println();
        for (Car car : cars) {
            System.out.println("Обслуживаем " + car.getModelName());
            for (int i = 0; i < car.getWheelsCount(); i++) {
                car.updateTyre();
            }
            car.checkEngine();
            System.out.println();
        }
    }

    @Override
    public void check(Truck[] trucks) {
        System.out.println();
        for (Truck truck : trucks) {
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int i = 0; i < truck.getWheelsCount(); i++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
            System.out.println();
        }
    }

    @Override
    public void check(Bicycle[] bicycles) {
        System.out.println();
        for (Bicycle bicycle : bicycles) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int i = 0; i < bicycle.getWheelsCount(); i++) {
                bicycle.updateTyre();
            }
            System.out.println();
        }
    }
}
