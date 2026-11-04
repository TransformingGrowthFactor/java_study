package ch03;

public class P112_IncreaseDecreaseOperatorExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        System.out.println("------------------");
        x++; // 다른 연산을 수행한 후에, 피연산자의 값을 1 증가시킴
        ++x; // 다른 연산을 수행하기 전에 피연산자의 값을 1 증가시킴
        System.out.println("x=" + x);

        System.out.println("------------------");
        y--;
        --y;
        System.out.println("y=" + y);

        System.out.println("------------------");
        z = x++;
        System.out.println("z=" + z);
        System.out.println("x=" + x);

        System.out.println("------------------");
        z = ++x;
        System.out.println("z=" + z);
        System.out.println("x=" + x);

        System.out.println("------------------");
        z = ++x + y++;
        System.out.println("z=" + z);
        System.out.println("x=" + x);
        System.out.println("y=" + y);
    }
}
