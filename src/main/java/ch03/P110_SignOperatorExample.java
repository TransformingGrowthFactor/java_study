package ch03;

public class P110_SignOperatorExample {
    public static void main(String[] args) {
        int x = -100;
        int result1 = +x;
        int result2 = -x;
        System.out.println("result1=" + result1);
        System.out.println("result2=" + result2);

        byte b = 100;
        // byte result3 = -b; // byte 타입을 부호화해서 연산하면 자동으로 int가 되어버리기 때문에, 컴파일 에러
        int result3 = -b;
        System.out.println("result3=" + result3);
    }
}
