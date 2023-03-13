package HW_2023_06_03_other_options.HW_2023_03_06_1st_var;

public class Test {
    public static void main(String[] args) {

        Car[] cars = {
                new Car("car1", 4),
                new Car("car2", 4)
        };

        Truck[] trucks = {
                new Truck("truck1", 6),
                new Truck("truck2", 8)
        };

        Bicycle[] bicycles = {
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2)
        };

        ServiceStation ss = new ServiceStation();
        ss.check(cars);
        ss.check(trucks);
        ss.check(bicycles);


    }
}