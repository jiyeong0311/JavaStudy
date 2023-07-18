package chap_05;

public class _04_MultiArrayLoop {
    public static void main(String[] args) {
        // 다차원 배열 순회
        String[][] seats = new String[][] {
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        for (int i = 0; i < 3; i++) {   // 세로 기준
            for (int j = 0; j < 5; j++) {   // 가로 기준
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-----------------------------");

        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        for (int i = 0; i < seats2.length; i++) {   // 세로 기준
            for (int j = 0; j < seats2[i].length; j++) {   // 가로 기준
                System.out.print(seats2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("-----------------------------");

        // 세로 크기 10 x 가로 크기 15 에 해당하는 영화관 좌석
        String[][] seats3 = new String[10][15];
        String[] eng = {"A","B","C","D","E","F","G","H","I","J"};
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = eng[i] + (j + 1);
            }
        }

        // H9, H10 좌석 표 구매
        /*
        실행 결과
        A1 A2 A3 A4 A5 A6 A7 A8 A9 A10 A11 A12 A13 A14 A15
        B1 B2 B3 B4 B5 B6 B7 B8 B9 B10 B11 B12 B13 B14 B15
        C1 C2 C3 C4 C5 C6 C7 C8 C9 C10 C11 C12 C13 C14 C15
        D1 D2 D3 D4 D5 D6 D7 D8 D9 D10 D11 D12 D13 D14 D15
        E1 E2 E3 E4 E5 E6 E7 E8 E9 E10 E11 E12 E13 E14 E15
        F1 F2 F3 F4 F5 F6 F7 F8 F9 F10 F11 F12 F13 F14 F15
        G1 G2 G3 G4 G5 G6 G7 G8 G9 G10 G11 G12 G13 G14 G15
        H1 H2 H3 H4 H5 H6 H7 H8 __ ___ H11 H12 H13 H14 H15
        I1 I2 I3 I4 I5 I6 I7 I8 I9 I10 I11 I12 I13 I14 I15
        J1 J2 J3 J4 J5 J6 J7 J8 J9 J10 J11 J12 J13 J14 J15
         */
        seats3[7][8] = "__";    // H9
        seats3[7][9] = "___";    // H10

        // 영화관 좌석 번호 확인
        for (int i = 0; i < seats3.length; i++) {   // 세로 기준
            for (int j = 0; j < seats3[i].length; j++) {   // 가로 기준
                System.out.print(seats3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
