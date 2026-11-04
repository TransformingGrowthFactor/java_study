package ch02;

public class P61_ByteExample {
    public static void main(String[] args) {
        byte var1 = -128;
        byte var2 = -30;
        byte var3 = 0;
        byte var4 = 30;
        byte var5 = 127;
//        byte var6 = 128; //byte값의 허용범위인 -128 ~ 127 을 벗어났으므로 오류
        //해결법
        long var6 = 128;

        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
    }
}
