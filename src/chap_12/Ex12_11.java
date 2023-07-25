package chap_12;
interface Car16 {
    void work();
}
interface Cannon {
        void fire();
}
interface MachineGun {
    void shoot();
}

class Tank implements Car16, Cannon,MachineGun {
    public void work(){
        System.out.println("탱크가 앞으로 굴러갑니다.");
    }
    public void fire(){
        System.out.println("탱크가 대포를 발사합니다.");
    }
    public void shoot(){
        System.out.println("탱크가 기관총을 사용합니다.");
    }
}
public class Ex12_11 {
    public static void main(String[] args) {

        Tank tank1 = new Tank();
        tank1.work();
        tank1.fire();
        tank1.shoot();
    }
}
