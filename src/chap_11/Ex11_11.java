package chap_11;
class Car5{
    String color;
    int speed;
    static private int count = 0;

    Car5 (){
        count++;
    }

    static int getCount(){
        return count;
    }
}
public class Ex11_11 {
    public static void main(String[] args) {
        System.out.println("현재 생산된 자동차 숫자 =>" + Car5.getCount());

        Car5 car = new Car5();
        System.out.println("현재 생산된 자동차 숫자 =>" + Car5.getCount());

    }
}
