package chap_12;

public class 객체배열 {
    public static void main(String[] args) {
        TV[] tvArr = new TV[3];     // 길이가 3인 TV 타입의 참조변수 배열 생성

        // 객체를 생성해서 배열의 각 요소에 저장
        tvArr[0] = new TV();
        tvArr[1] = new TV();
        tvArr[2] = new TV();



    }
}
