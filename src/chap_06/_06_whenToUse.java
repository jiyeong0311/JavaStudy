package chap_06;

public class _06_whenToUse {

    public static int getPower(int num) {
        //int result = num * num;
        //return result;
        return getPower(num,2);
    }

    public static int getPower (int num, int exp) {
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= num;
        }
        return result;
    }

    public static void main(String[] args) {
        // 메소드가 필요한 이유

        // 2의 2승 구하기
        System.out.println(getPower(2,2));     // 2 * 2 = 4

        // 3의 3승 구하기
        System.out.println(getPower(3,3));     // 3 * 3 * 3 = 27

        // 4의 2승 구하기
        System.out.println(getPower(4,2));     // 4 * 4 = 16
    }
}
