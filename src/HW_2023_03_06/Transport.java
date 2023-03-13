package HW_2023_03_06;

public abstract class Transport implements Serviceable {
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

    public abstract void updateTyre();

    @Override
    public void service(Mechanic mechanic) {
        System.out.println("Механик " + mechanic.getName() + " обслуживает " + getModelName() + ":");
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }
}




