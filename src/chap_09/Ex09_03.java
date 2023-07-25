package chap_09;

import java.util.Scanner;

public class Ex09_03 {
    public static void main(String[] args) {

        // 문자열의 처음이 특정 문자열인지 확인 startsWith(), 문자열의 마지막이 특정 문자열인지 확인 endsWith()

        Scanner s = new Scanner(System.in);
        String str;

        System.out.println("문자열 입력 ==> ");
        str = s.nextLine();

        System.out.println("출력 문자열 ==> ");

        if (!str.startsWith("("))
            System.out.printf("(");


        for (int i = 0; i < str.length(); i++)
            System.out.printf("%c", str.charAt(i));

        if (!str.endsWith(")"))
            System.out.printf(")");

    }
}
