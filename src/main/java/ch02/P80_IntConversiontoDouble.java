package ch02;

public class P80_IntConversiontoDouble {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        double result = x / y;
        System.out.println(result); // 정수 연산의 결과는 정수가 되어버리기 때문에 0.0이 나옴.

        double result2 = (double) x / y; // 연산 단계에서 변환하는 방법 1
        System.out.println(result2);

        double result3 = x / (double) y; // 연산 단계에서 변환하는 방법 2
        System.out.println(result3);

        double result4 = (double) x / (double) y; // 연산 단계에서 변환하는 방법 3
        System.out.println(result4);

        double wrong = (double) (x/y); // 정수연산으로 이미 0.0이 되어버린 거를 double화한 거라 소용이 없음
        System.out.println(wrong);
    }
}
