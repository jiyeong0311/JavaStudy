package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {

        /*키가 115cm 이므로 탑승 불가능합니다.
        키가 121cm 이므로 탑승 가능합니다.*/

        int height = 115;
        int height2 = 121;
        String s1 = height >= 120 ? "탑승 가능 합니다." : "탑승 불가능 합니다.";
        String s2 = height2 > 120 ? "탑승 가능 합니다." : "탑승 불가능 합니다.";

        System.out.println("키가 " + height + "cm 이므로 " + s1 );
        System.out.println("키가 " + height2 + "cm 이므로 " + s2 );
    }
}
