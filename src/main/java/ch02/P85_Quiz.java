package ch02;

public class P85_Quiz {
    public static void main(String[] args) {
        // 9번 문제. var 1~4를 합해서 9가 나오도록
        long var1 = 2L;
        float var2 = 1.8f;
        double var3 = 2.5;
        String var4 = "3.9";
        int result = (int) (var1 + var2 + var3) + (int) Double.parseDouble(var4);
        System.out.println(result);

        String str1 = 2 + 3 + "";
        String str2 = 2 + "" + 3;
        String str3 = "" + 2 + 3;
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}