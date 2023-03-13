package HW_2023_06_03_other_options.HW_2023_03_06_1st_var;

import HW_2023_06_03_other_options.HW_2023_03_06_orig.Car;

public interface Serviceable {
    public default void check(Car[] cars) {
    }

    public default void check(Truck[] trucks) {
    }

    public default void check(Bicycle[] bicycles) {
    }
}
