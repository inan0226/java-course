package interfaceexample;

public class main {

    public static void main(String[] args) {
            // 인스턴스화
       LuxuryCar luxuryCar = new LuxuryCar();
       SpeedCar speedCar = new SpeedCar();

       // 활용
       // luxuryCar.move();
        //luxuryCar.stop();

        // speedCar.drive();
        // speedCar.stop()
        // speedCar.drive();

        // 인터페이스 활용
        luxuryCar.drive();
        speedCar.drive();

        luxuryCar.stop();
        speedCar.stop();

        luxuryCar.charge();
        speedCar.autoParking();
    }
}
