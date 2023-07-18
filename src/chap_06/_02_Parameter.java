package chap_06;

public class _02_Parameter {
    // 전달값이 있는 메소드
    public static void power(int num) {     // Parameter, 매개변수(전달 값)
        int result = num * num;
        System.out.println(num + " 의 2 승은" + result);
    }

    public static void powerByExp(int num, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= num;
        }
        System.out.println(num + " 의 " + exp +" 승은 " + result );
    }

    public static void main(String[] args) {
        // 전달값, 파라미터
        // 2 -> 2 * 2 = 4
        // 3 -> 3 * 3 = 9

        // Argument, 인수 = 2
        power(2);
        // Argument, 인수 = 3
        power(3);

        powerByExp(2,2);    // 2 * 2 * 2 = 8
        powerByExp(3,3);    // 3 * 3 * 3 = 27
    }
}
