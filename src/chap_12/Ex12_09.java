package chap_12;
abstract class Car14 {
    int speed;
    String color;

    void upSpeed(int speed){
        this.speed = speed;
    }
    abstract void work();
}
class Sedan8 extends Car14 {
    void work(){
        System.out.println("승용차가 사람을 태우고 있습니다.");
    }
}
class Truck4 extends Car14 {
    void work(){
        System.out.println("트럭이 짐을 싣고 있습니다.");
    }
}
public class Ex12_09 {
    public static void main(String[] args) {
        Sedan8 sedan1 = new Sedan8();
        sedan1.work();
        Truck4 truck1 = new Truck4();
        truck1.work();


    }
}
