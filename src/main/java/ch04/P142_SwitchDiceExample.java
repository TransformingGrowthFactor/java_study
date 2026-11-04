package ch04;

public class P142_SwitchDiceExample {
    public static void main(String[] args) {
        int num = (int) (Math.random() * 6) + 1; // 주사위 번호를 하나 뽑는 액션

        switch(num) {
            case 1:
                System.out.println("1번");
                break;
            case 2:
                System.out.println("2번");
                break;
            case 3:
                System.out.println("3번");
                break;
            case 4:
                System.out.println("4번");
                break;
            case 5:
                System.out.println("5번");
                break;
            default:
                System.out.println("6번");
                break;
        }

    }
}
