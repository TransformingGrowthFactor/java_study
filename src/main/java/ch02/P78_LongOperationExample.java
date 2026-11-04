package ch02;

public class P78_LongOperationExample {
    public static void main(String[] args) {
        byte value1 = 10;
        int value2 = 100;
        long value3 = 1000L;
        long result = value1 + value2 + value3;
        System.out.println(result);

        // 자바식 타입보기
        System.out.println(((Object) (value1 + value2 + value3)).getClass());
        System.out.println(((Object) (value1 + value2 + value3)).getClass().getName());
        System.out.println(((Object) (value1 + value2 + value3)).getClass().getSimpleName());
    }
}
