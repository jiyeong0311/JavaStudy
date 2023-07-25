package chap_12;

class Car7 {
    Car7 (){
        System.out.println("슈퍼 클래스 생성자 호출~");
    }
}

class Sedan1 extends Car7 {
    Sedan1(){
        System.out.println("서브 클래스 생성자 호출~");
    }
}
public class Ex12_02 {
    public static void main(String[] args) {
        Sedan1 sedan1 = new Sedan1();
    }
}
