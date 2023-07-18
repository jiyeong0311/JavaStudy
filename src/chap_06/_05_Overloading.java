package chap_06;

public class _05_Overloading {
    public static int getPower(int num) {
        int result = num * num;
        return result;
    }

    public static int getPower(String strNum) {
        int num = Integer.parseInt(strNum);
        return num * num;
    }

    public static int getPower(int num, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= num;
        }
        return result;
    }
    public static void main(String[] args) {
        // 메소드 오버로딩 = 이름이 같은 메소드를 여러개 만드는것
        // 같은 이름의 메소드를 여러 번 선언
        // 1. 전달값의 타입이 다르거나
        // 2. 전달값의 갯수가 다르거나

        System.out.println(getPower(3));    // 3 * 3 = 9
        System.out.println(getPower("4"));   // 4 * 4 = 16
        System.out.println(getPower(3,3));     // 3 * 3 * 3 = 27

    }
}
