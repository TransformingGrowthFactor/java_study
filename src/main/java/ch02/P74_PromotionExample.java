package ch02;

public class P74_PromotionExample {
    public static void main(String[] args) {
        //자동 타입 변환(Promotion: implicit type conversion)
        byte byteValue = 10;
        int intValue = byteValue; // byte를 int화
        System.out.println("intValue: " + intValue);

        char charValue = '가';
        intValue = charValue; // char를 int화
        System.out.println("\"가\"의 유니코드: " + intValue);

        intValue = 50;
        long longValue = intValue; // int를 long화
        System.out.println("longValue: " + longValue);

        longValue = 100;
        float floatValue = longValue; // long를 float화
        System.out.println("floatValue: = " + floatValue);

        floatValue = 100.5F;
        double doubleValue = floatValue; // float을 double화
        System.out.println("doubleValue: " + doubleValue);
    }
}
