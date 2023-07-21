package chap_07;
abstract class Car13 {
    int speed;
    String color;

    void upSpeed(int speed){
        this.speed = speed;
    }
}
class Sedan7 extends Car13 {
}
class Truck3 extends Car13 {
}
public class Ex12_08 {
    public static void main(String[] args) {
        // Car13 car1 = new Car13();
        Sedan7 sedan1 = new Sedan7();
        System.out.println("승용차 인스턴스 생성");
        Truck3 truck1 = new Truck3();
        System.out.println("트럭 인스턴스 생성");
    }
}
