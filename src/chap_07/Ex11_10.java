package chap_07;
class Car4 {
    String color;
    int speed;
    static int count;

    Car4 (){
        count++;
    }
}
public class Ex11_10 {
    public static void main(String[] args) {
        Car4 car1 = new Car4();
        System.out.println("현재 생산된 자동차 숫자 => " + car1.count);
        Car4 car2 = new Car4();
        System.out.println("현재 생산된 자동차 숫자 => " + car2.count);
        Car4 car3 = new Car4();
        System.out.println("현재 생산된 자동차 숫자 => " + car3.count);
    }
}
