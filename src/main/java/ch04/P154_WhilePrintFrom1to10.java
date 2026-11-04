package ch04;

public class P154_WhilePrintFrom1to10 {
    public static void main(String[] args) {
        int i = 1; // for문과 달리 바깥에다 정의해두고 시작해야
        while (i<=10) {
            System.out.println(i);
            i++;
        }
        System.out.println("--- 반대 ---");
        i = 10;
        while (i >= 0) {
            System.out.println(i);
            i--;
        }
    }
}
