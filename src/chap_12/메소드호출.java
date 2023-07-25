package chap_12;

public class 메소드호출 {

    public static int add (int x, int y) {
        int result = x + y;
        return result;
    }

    public static void main(String[] args) {

//        메소드 이름(값1, 값2, ...);    // 메소드를 호출하는 방법
//        print99danAll();    // void print99danAll()을 호출
        int result = add(3,5);  // int add(int x, int y)를 호출하고, 결과를 result 에 저장
        System.out.println(result);     // 8

    }
}
