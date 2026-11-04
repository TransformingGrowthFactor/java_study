package ch03;

public class P126_ConditionalOperationExample {
    public static void main(String[] args) {
        int score1 = 95;
        // score1 > 90이 true면 전항인 A를, false면 후항인 B를 갖게 됨
        char grade1 = (score1 > 90) ? 'A' : 'B';
        System.out.println(grade1);

        //같은 결과를 원시적인 if - else 문으로 쓰면
        int score2 = 95;
        char grade2;
        if (score2 > 90) {
            grade2 = 'A';
        } else {
            grade2 = 'B';
        }
        System.out.println(grade2);


        int score3 = 85;
        char grade3 = (score3 > 90) ? 'A' : ( (score3 > 80) ? 'B' : 'C' );
        System.out.println(score3 + "점은 " + grade3 + "등급입니다.");
    }
}
