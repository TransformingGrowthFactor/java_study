package ch05;

public class P198_AdvancedFor { // 배열이나 컬렉션을 더 쉽게 처리하기 위한, 향상된 for문
    public static void main(String[] args) {
        int[] scores = {95, 71, 84, 93, 87};

        int sum = 0;
        for(int score : scores) {
            sum = sum + score;
        }
        System.out.println("점수 총함 = " + sum);

        double avg = (double) sum / scores.length;
        System.out.println("점수 평균 = " + avg);
    }
}
