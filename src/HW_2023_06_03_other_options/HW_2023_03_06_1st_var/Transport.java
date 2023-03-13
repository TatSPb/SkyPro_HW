package HW_2023_06_03_other_options.HW_2023_03_06_1st_var;

public class Transport implements Serviceable {
    private String modelName;
    private int wheelsCount;

    public Transport(String modelName, int wheelsCount) {
        if (modelName.isEmpty() && modelName.isBlank()) {
            System.out.println("Некорректно заполнено название модели");
        } else {
            this.modelName = modelName;
        }

        if (wheelsCount > 0) {
            this.wheelsCount = wheelsCount;
        } else {
            System.out.println("Некорректно заполнено количество колёс");
        }
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        if (modelName.isEmpty() && modelName.isBlank()) {
            System.out.println("Некорректно заполнено название модели");
        } else {
            this.modelName = modelName;
        }
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        if (wheelsCount > 0) {
            this.wheelsCount = wheelsCount;
        } else {
            System.out.println("Некорректно заполнено количество колёс");
        }
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

}

