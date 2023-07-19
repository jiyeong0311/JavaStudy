package chap_07;

public class Card {
    // 인스턴스 변수 (개별 속성, iv)
    String kind;    // 무늬
    int number;     // 숫자

    // 클래스 변수 (공통 속성, cv)
    static int width = 100;     // 폭
    static int height = 250;    // 높이

    public static void main(String[] args) {

        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "HEART";
        c1.number = 5;
        System.out.println("c1 = " + c1.kind + "," + c1.number + " 이며, 크기는 " + Card.width + "," + Card.height);

        Card c2 = new Card();
        c2.kind = "SPACE";
        c2.number = 7;
        System.out.println("c2 = " + c2.kind + "," + c2.number + " 이며, 크기는 " + Card.width + "," + Card.height);

//        c.width = 200;
//        c.height = 300;
        Card.width = 200;
        Card.height = 300;



    }

}
