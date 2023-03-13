package HW_2023_03_06;

public class Main {
    public static void main(String[] args) {

        Bicycle bicycle1 = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);
        Car car1 = new Car("car1", 4);
        Car car2 = new Car("car2", 4);
        Truck truck1 = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        ServiceStation ss = new ServiceStation();
        ss.check(bicycle1);
        ss.check(bicycle2);
        ss.check(car1);
        ss.check(car2);
        ss.check(truck1);
        ss.check(truck2);
    }
}