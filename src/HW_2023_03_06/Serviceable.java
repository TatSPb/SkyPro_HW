package HW_2023_03_06;

import HW_2023_03_06_copy.Car;

public interface Serviceable {
    public default void check(Car[] cars) {
    }

    public default void check(Truck[] trucks) {
    }

    public default void check(Bicycle[] bicycles) {
    }
}
