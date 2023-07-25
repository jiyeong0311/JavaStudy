package chap_12;

public class 객체생성 {
    public static void main(String[] args) {

//    클래스명 변수명;            클래스의 객체를 참조하기 위한 참조 변수를 선어
//    변수명 = new 클래스명();    클래스의 객체를 생성 후, 객체의 주소를 참조변수에 저장

        TV t;                   // TV 클래스 타입의 참조변수 t를 선언
        t = new TV();           // TV 인스턴스를 생성한 후, 생성된 TV 인스턴스의 주소를 t에 저장

        t.channel = 7;          // TV 인스턴스의 멤버변수 channel의 값을 7로 한다.
        t.channelDown();        // TV 인스턴스의 메서드 channelDown()을 호출한다.
        System.out.println("현재 채널은 " + t.channel + " 입니다.");    // 현재 채널은 6 입니다.

        TV t1 = new TV();
        TV t2 = new TV();
        t1.channel = 7;

        System.out.println("t1의 channel 값은 " + t1.channel + " 입니다.");    // 7
        System.out.println("t2의 channel 값은 " + t2.channel + " 입니다.");    // 0
    }

}
class TV {
    String color;
    boolean power;
    int channel;

    void power()    {power = !power;}
    void channelUp()    {channel++;}
    void channelDown()  {channel--;}
}
