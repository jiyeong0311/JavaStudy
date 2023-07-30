package chap_09;

public class Ex09_16 {

    static void func1(){
        System.out.printf("void 형 메소드는 반환할게 없음. \n");
    }

    static int func2(){
        return 100;
    }

    public static void main(String[] args) {
        int a;
        func1();

        a = func2();
        System.out.printf("int 형 메소드에서 반환한 값 ==> %d\n", a);
    }
}
