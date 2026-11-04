package ch02;

public class P75_CastingExample {
    public static void main(String[] args) {
        int intValue = 44032;
        char charValue = (char) intValue; // (타입)을 씌워서 강제로 형변환
        System.out.println(charValue); // 유니코드 44032인 '가'가 나옴

        long longValue = 500;
        intValue = (int) longValue;
        System.out.println(intValue); // 이미 정수라서 차이가 없긴 하지만

        double doubleValue = 3.14;
        intValue = (int) doubleValue;
        System.out.println(intValue); // 소수점은 절사됨
    }
}
