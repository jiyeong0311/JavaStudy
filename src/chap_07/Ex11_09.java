package chap_07;

class Calc {
    void addValue (double v1, double v2){
        System.out.println("double 값 계산 => " + (v1 + v2));
    }
    void addValue (int v1, int v2){
        System.out.println("int 값 계산 => " + (v1 + v2));
    }
}
public class Ex11_09 {
    public static void main(String[] args) {
        Calc calc = new Calc();

        calc.addValue(0.1,0.1);
        calc.addValue(1,1);
    }
}
