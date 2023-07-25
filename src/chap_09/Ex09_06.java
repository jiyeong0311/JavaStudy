package chap_09;

public class Ex09_06 {
    public static void main(String[] args) {

        // 대문자 전환 toUpperCase(), 소문자 전환 toLowerCase(), 앞 뒤 공백 제거 trim()

        String str = "  한글  ABCD  efgh  ";

        System.out.println("원문자열 ==> [" + str + "]");
        System.out.println("대문자로 ==> [" + str.toUpperCase() + "]");
        System.out.println("소문자로 ==> [" + str.toLowerCase() + "]");
        System.out.println("공백제거 ==> [" + str.trim() + "]");
    }
}
