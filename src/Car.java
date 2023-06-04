public class Car extends Vehicle implements Check {

    public void check() {
        if (this != null) {
            System.out.println("Обслуживаем " + this.getModelName());
            for (int i = 0; i < this.getWheelsCount(); i++) {
                this.updateTyre();
            }
            this.checkEngine();
        }
    }

        public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
