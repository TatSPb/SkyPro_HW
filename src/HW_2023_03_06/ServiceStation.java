package HW_2023_03_06;

public class ServiceStation {

    public void check(Serviceable serviceable) {
        System.out.println();
        serviceable.service(new Mechanic("Вася"));
    }
}

