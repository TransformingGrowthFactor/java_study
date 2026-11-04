package ch03;

public class P118_StringConcatExample {
    public static void main(String[] args) {
        String str1 = "JDK"  + 6.0;
        String str2 = str1 + " 특징";
        System.out.println(str2);

        String str3 = "JDK" + 3 + 3.0; // JDK3 문자열 뒤에 3.0이 붙는 식으로 처리돼서 JDK33.0
        String str4 = 3 + 3.0 +"JDK"; // 연산을 수행한 다음에 문자열이 붙어서 6.0JDK
        System.out.println(str3);
        System.out.println(str4);
    }
}
