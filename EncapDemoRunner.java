public class EncapDemoRunner {
    public static void main(String[] args) {
        EncapDemo bike = new EncapDemo();
        EncapDemo car = new EncapDemo();

        bike.setSpeed(100);
        car.setSpeed(150);

        bike.getSpeed();
        car.getSpeed();

        bike.increaseSpeed(25);
        car.decreaseSpeed(25);

        bike.getSpeed();
        car.getSpeed();

        bike.decreaseSpeed(125);
        car.decreaseSpeed(150);

        bike.getSpeed();
        car.getSpeed();
    }
}
