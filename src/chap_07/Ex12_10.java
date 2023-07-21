package chap_07;
interface Car15 {
    static final int CAR_COUNT = 0;
    abstract void work();
}
class Sedan9 implements Car15 {
    public void work(){
        System.out.println("승용차가 사람을 태우고 있습니다.");
    }
}
class Truck5 implements Car15{
    public void work(){
        System.out.println("트럭이 짐을 싣고 있습니다.");
    }
}
public class Ex12_10 {
    public static void main(String[] args) {
        Sedan8 sedan1 = new Sedan8();
        sedan1.work();
        Truck4 truck1 = new Truck4();
        truck1.work();
    }
}
