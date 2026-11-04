package ch03;

import java.util.Scanner;

public class P127_Quiz {
    public static void main(String[] args) throws Exception {
        byte b = 5;
        // b = -b; // b에 +-를 적용하면 java가 이걸 자동으로 int로 읽음. byte에다 int를 끼워넣으려고 하는 것처럼 보이는 것
        b = (byte) -b; // 해결책. 다시 byte로 돌려주기
        int result = 10 / b;


        int x = 10;
        int y = 20;
        int z = (++x) + (y--); // y--는 일단 현재 y의 값을 연산에 쓴 다음에 감소시키는 거기 때문에, 덧셈하는 시점에선 20임
        System.out.println(z);


        boolean stop = false;
        int count = 0;
        while (!stop) {
            count++;
            System.out.println(count);
            if (count == 5) {
                stop = true;
            }
        }
        System.out.println("반복 종료");


        int pencils = 534;
        int students = 30;
        //학생 1명이 가지는 연필 개수
        int pencilsPerStudent = (534/30);
        System.out.println(pencilsPerStudent);
        // 남은 연필 개수
        int pencilsLeft = (534%30);
        System.out.println(pencilsLeft);


        int var1 = 5;
        int var2 = 2;
        double var3 = (double) var1 / var2; // int끼리 계산했는데 별말없이 그걸 double로 정의하라 하면 안 되지.
        int var4 = (int) (var3 * var2);
        System.out.println(var4);


        int value = 356;
        System.out.println(value/100 * 100); // int/int 니까 3.56이 아니라 3이 됨.

        float varA = 10f;
        float varB = var1 / 100;
        if(varB == 0.1) {
            System.out.println("10%입니다.");
        } else {
            System.out.println("10%가 아닙니다."); // float 0.1은 정확히 0.1 이 아니라서, 이 쪽 답이 나옴.
        }


        // 8번
        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;
        double area = (double) (lengthTop + (double) lengthBottom)/2 * (double) height;
        System.out.println(area);


        // 9번
        Scanner numbers = new Scanner(System.in);
        System.out.println("첫 번째 수: ___");
        double numFirst = Double.parseDouble(numbers.nextLine()); // '실수'를 입력받는다고 했음. double이 되어야 하겠지.
        System.out.println("두 번째 수: ___");
        double numSecond = Double.parseDouble(numbers.nextLine());
        if (numSecond != 0.0) {
            System.out.println("결과: " + (numFirst / numSecond));
        } else {
            System.out.println("결과: 무한대");
        }


        // 10번
        int num1 = 10; // 반지름
        int num2 = 3;
        int num3 = 14;
        double width = (double) (num1 * num1) * Double.parseDouble(num2 + "." + num3);
        System.out.println("원의 넓이: " + width);


        // 12번
        Scanner idpw = new Scanner(System.in);
        System.out.println("아이디: ");
        String name = idpw.nextLine();
        System.out.println("패스워드: ");
        String strPw = idpw.nextLine();
        int password = Integer.parseInt(strPw);

        if(name.equals("java")) {
            if(password == 12345) {
                System.out.println("로그인 성공");
            } else {
                System.out.println("패스워드 오류");
            }
        } else {
            System.out.println("존재하지 않는 ID");
        }
    }
}
