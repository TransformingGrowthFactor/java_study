package ch02;

import java.util.Scanner;

public class P98_Quiz {
    public static void main(String[] args) throws Exception {
        String name = "김자바";
        int age = 25;
        String tel1 = "010", tel2 = "123", tel3 = "4567";
        System.out.println("이름 :" + name);
        System.out.println("나이: " + age);
        System.out.println("전화: " + tel1 + "-" + tel2 + "-" + tel3);


        // 문제 2
        Scanner scanned = new Scanner(System.in);

        System.out.print("첫번째 수: ");
        String strNum1 = scanned.nextLine();
        System.out.print("두번째 수: ");
        String strNum2 = scanned.nextLine();

        int num1 = Integer.parseInt(strNum1); // strNum1을 int화
        int num2 = Integer.parseInt(strNum2); // "
        int result = num1 + num2;
        System.out.println("덧셈 결과: " + result);


        // 문제 3
        Scanner profile = new Scanner(System.in);
        String inputData;

        System.out.println("[필수 정보 입력]");
        System.out.println("이름: _________");
        String strName = profile.nextLine();
        System.out.println("주민번호 앞 6자리: _________");
        String strReg = profile.nextLine();
        System.out.println("전화번호: _________");
        String strPhone = profile.nextLine();

        System.out.printf("이름: %s\n주민번호 앞 6자리: %s\n전화번호: %s\n", strName, strReg, strPhone);
        // printf에서 % 붙이고 선언하는 건 자료형임. 여기서 출력하려는 건 string이니까 %s.

    }
}
