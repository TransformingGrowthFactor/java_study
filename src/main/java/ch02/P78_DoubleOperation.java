package ch02;

public class P78_DoubleOperation {
    public static void main(String[] args) {
        double result = 1.2f + 3.4; // float을 double로 변환해서 계산한 다음, 결과를 double로 저장
        System.out.println(result);

        int intValue = 10;
        double doubleValue = 5.5;
        double result2 = intValue + doubleValue;
        System.out.println(result2);
    }
}
