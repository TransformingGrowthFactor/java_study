package ch02;

public class P53_VariableExchangeExample {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int temp = x; // temp에다가 x를 백업해놓은 상태에서
        x = y; // x에 y의 값을 바로 옮기고
        y = temp; // 백업해뒀던 원래 x를 y에 담기
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
