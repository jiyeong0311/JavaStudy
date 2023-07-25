package chap_09;

public class Ex09_04 {
    public static void main(String[] args) {

        // 특정 문자열의 위치를 찾는 indexOf(), 찾고자하는 문자열이 여러개일 경우 마지막 문자열을 찾는 lastIndexOf()

        String str = "Java를 공부하는 중, Java는 재밌어요.^^";

        System.out.println("문자열 ==> " + str);

        System.out.print("제일 처음 나오는 Java 위치 ==> ");
        System.out.println(str.indexOf("Java"));    // "Java" 글자가 처음 나오는 위치를 출력
        System.out.print("마지막에 나오는 Java 위치 ==> ");
        System.out.println(str.lastIndexOf("Java"));    // "Java" 글자가 마지막에 나오는 위치를 출력
    }
}
