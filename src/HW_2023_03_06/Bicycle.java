package HW_2023_03_06;

public class Bicycle extends Transport {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("меняет покрышку у велосипеда;");
    }
}
