package ch04;

public class P152_ForSUmFrom1To100_2 {
    public static void main(String[] args) {
        int sum = 0;

        int i = 0; // 101까지 돌긴 하는데, 101은 i <= 100을 충족하지 못하니까 끊기는 거
        for (i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("i = " + i);
        System.out.println("1~" + (i-1) + "합: " + sum);
    }
}
