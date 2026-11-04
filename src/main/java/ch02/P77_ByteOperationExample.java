package ch02;

public class P77_ByteOperationExample {
    public static void main(String[] args) {
        byte result1 = 10 + 20;
        System.out.println(result1);

        byte x = 10;
        byte y = 20;
        // byte result2 = x + y; // incompatible types: possible lossy conversion from int to byte
        int result2 = x + y; // 정수 연산에 쓰이는 변수는 이렇게 미리 int 타입으로 선언하고 쓰는 게 효율적
        System.out.println(result2);
    }
}
