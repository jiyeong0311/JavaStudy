package chap_11;

class Car2 {
    // 자동차의 필드
    private String color;
    private int speed;

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

    void setColor (String color)  {
        this.color = color;
    }

    void setSpeed (int speed)  {
        this.speed = speed;
    }


}

public class Ex11_03 {
    public static void main(String[] args) {
        Car2 myCar1 = new Car2();
        myCar1.setColor("빨강");
        myCar1.setSpeed(0);


        // 메소드 호출하기
        myCar1.upSpeed(30);
        System.out.println("자동차1의 색상은 " + myCar1.getColor() + "이며, 현재 속도는 " + myCar1.getSpeed() + "km 입니다.");


    }
}
