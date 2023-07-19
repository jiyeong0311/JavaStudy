package chap_07;

class Car1 {
    // 자동차의 필드
    String color;
    int speed;

    // 자동차의 메소드
    void upSpeed (int value) {
        speed = speed + value;
        if (speed > 200) {
            speed = 200;
        } else {
            speed = speed;
        }
    }
    void downSpeed (int value) {
        speed = speed - value;
    }

    String getColor () {
        return color;
    }

    int getSpeed () {
        return speed;
    }

}

public class Ex11_02 {
    public static void main(String[] args) {
        Car1 myCar1 = new Car1();
        myCar1.color = "빨간색";
        myCar1.speed = 0;


        // 메소드 호출하기
        myCar1.upSpeed(30);
        System.out.println("자동차1의 색상은 " + myCar1.color + "이며, 현재 속도는 " + myCar1.speed + "km 입니다.");
        System.out.println("자동차1의 색상은 " + myCar1.getColor() + "이며, 현재 속도는 " + myCar1.getSpeed() + "km 입니다.");


    }
}
