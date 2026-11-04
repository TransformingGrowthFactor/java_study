package ch04;

public class P152_ForFloatCounter {
    public static void main(String[] args) {
        for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
            System.out.printf("%.3f\n", x);
        }
    }
}
