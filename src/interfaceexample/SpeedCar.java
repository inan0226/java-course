package interfaceexample;

public class SpeedCar implements Car {
    @Override
    public void drive() {
        System.out.println("빠르게 이동합니다.");
    }

    @Override
    public void stop() {
            System.out.println("빠르게 정지합니다.");
    }

    void autoParking() {
        System.out.println("자동 주차 기능을 실행합니다.");
    }


    //void drive(){
      //  System.out.println("빠르게 출발합니다.");
    //}
}
