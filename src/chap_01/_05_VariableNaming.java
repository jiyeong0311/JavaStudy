package chap_01;

public class _05_VariableNaming {
    /*
    *  변수 이름 짓는 법
    *  1. 저장할 값에 어울리는 이름
    *  2. 밑줄(_), 문자(abc), 숫자(123) 사용 가능( 공백 사용 불가)
    *  3. 밑줄 또는 문자로 시작 가능
    *  4. 한 단어 또는 2개 이상의 단어의 연속
    *  5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
    *  6. 예약어 사용 불가 (public, static, void, int, double, float...)
    */

    // 입국 신고서 (여행)
    String nationality = "대한민국";    // 국적
    String firstName = "지영";    // 이름
    String lastName = "한";  // 성
    String dateOfBirth = "1997-01-01";  // 생년월일
    String residentialAddress = "무슨 호텔";    // 체류지
    String purposeOfVisit = "관광";   // 입국 목적
    String flightNo = "KE657";  // 항공 편명

    int accompany = 2;  // 동반 가족 수
    int lenghtOfStay = 5;   //체류 기간

    // 프로그램의 흐름을 위해 사용되는 경우 등 (크게 이름이 중요하지 않을 때)
    int i = 0;
    String S = "";
    String str = "";

    // 절대 변하지 않는 상수는 대문자로
    final String CODE = "KR";
//    CODE = "US";

}
