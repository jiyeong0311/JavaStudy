package chap_12;
class Car11 {
    int speed;

    void upSpeed(int speed) {
        this.speed += speed;
        System.out.println("현재속도(슈퍼클래스) : " + this.speed);
    }
}

class Sedan5 extends Car11 {
    void upSpeed (int speed){
        this.speed += speed;
        if (this.speed > 150)
            this.speed = 150;
        System.out.println("현재속도(서브클래스) : " + this.speed);
    }
}

class Truck1 extends Car11 {

}

public class Ex12_06 {
    public static void main(String[] args) {
        Truck1 truck1 = new Truck1();
        Sedan5 sedan1 = new Sedan5();

        System.out.print("트럭 -> ");
        truck1.upSpeed(200);
        System.out.print("승용차 -> ");
        sedan1.upSpeed(200);
    }
}
