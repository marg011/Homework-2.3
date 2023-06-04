public class Bicycle extends Vehicle implements Check {
    //    public Bicycle(String modelName, int wheelsCount) {
//        super(modelName, wheelsCount);
//    }
    @Override
    public void check() {
        if (this != null) {
            System.out.println("Обслуживаем " + this.getModelName());
            for (int i = 0; i < this.getWheelsCount(); i++) {
                this.updateTyre();
            }
        }
    }

}

