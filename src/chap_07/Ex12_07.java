package chap_07;
class Car12 {
    int speed;

    final void upSpeed(int speed) {
        this.speed += speed;
    }
}
class Sedan6 extends Car12 {
    final static String CAR_TYPE = "승용차";

    /*
    void upSpeed (int speed){
        // 재정의한 메소드 내용
    }*/
}
public class Ex12_07 {
    public static void main(String[] args) {
        System.out.println("Sedan 클래스 타입 => " +Sedan6.CAR_TYPE);
    }
}

