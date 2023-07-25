package chap_12;
class Car8 {
    Car8 (){
        System.out.println("슈퍼 클래스 생성자 호출(파라미터 없음)");
    }

    Car8 (String str) {
        System.out.println("슈퍼 클래스 생성자 호출 ==> " +str);
    }
}

class Sedan2 extends Car8 {
    Sedan2(String str){
        super(str);
        System.out.println("서브 클래스 생성자 호출 ==> " + str);
    }
}
public class Ex12_03 {
    public static void main(String[] args) {
        Sedan2 sedan1 = new Sedan2("여기요~");
    }
}
