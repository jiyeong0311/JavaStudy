package chap_09;

public class Ex09_08 {
    public static void main(String[] args) {

        // 두 문자열을 비교하는 compareTo(), 문자열의 포함을 확인하는 contains()

        String str1 = "Java Programming";
        String str2 = "Java IT CookBook";

        System.out.println("원 문자열1 ==> [" + str1 + "]");
        System.out.println("원 문자열2 ==> [" + str2 + "]");

        System.out.println(str1.compareTo(str2));
        System.out.println(str1.contains("Java"));

    }
}
