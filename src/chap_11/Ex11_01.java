package chap_11;

class Car {
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

public class Ex11_01 {
    public static void main(String[] args) {
        Car myCar1 = new Car();
        myCar1.color = "빨간색";
        myCar1.speed = 0;

        Car myCar2 = new Car();
        myCar2.color = "파란색";
        myCar2.speed = 0;

        Car myCar3 = new Car();
        myCar3.color = "노란색";
        myCar3.speed = 0;

        // 메소드 호출하기
        myCar1.upSpeed(230);
        System.out.println("자동차1의 색상은 " + myCar1.color + "이며, 현재 속도는 " + myCar1.speed + "km 입니다.");

        myCar2.upSpeed(60);
        System.out.println("자동차2의 색상은 " + myCar2.color + "이며, 현재 속도는 " + myCar2.speed + "km 입니다.");

        myCar3.upSpeed(0);
        System.out.println("자동차3의 색상은 " + myCar3.color + "이며, 현재 속도는 " + myCar3.speed + "km 입니다.");
    }
}

