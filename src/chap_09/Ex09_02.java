package chap_09;

import java.util.Scanner;

public class Ex09_02 {
    public static void main(String[] args) {

        // 문자의 길이를 알려주는 length(), 문자열의 위치 charAt()

        Scanner s = new Scanner(System.in);
        String str;

        System.out.println("문자열 입력 ==> ");
        str = s.nextLine();

        System.out.println("출력 문자열 ==> ");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'o')
                System.out.printf("%C", '$');
            else
                System.out.printf("%C", str.charAt(i));
        }
    }
}
