package chap_30;
class Book {
    String x;
    Book(){
        System.out.println("Book 클래스 생성자~~ (파라미터 없음)");
    }
    void Book (String x) {
        this.x = x;
        System.out.println("Book 클래스 생성자 -->" + x);
    }

}

class ComputerBook extends Book {
    ComputerBook(String x){
        super.Book(x);
        System.out.println("ComputerBook 클래스 생성자 ~~");
    }
}
public class Exam {
    public static void main(String[] args) {
        ComputerBook sedan1 = new ComputerBook("굿 자바");
    }
}

