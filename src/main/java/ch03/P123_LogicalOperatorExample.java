package ch03;

public class P123_LogicalOperatorExample {
    public static void main(String[] args) {
        int charCode = 'A';

        if( (charCode>=65) & (charCode<=90) ) { // & = 두 개의 피연산자 모두를 평가해서 false 산출
            System.out.println("대문자");
        }
        if( (charCode>=97) && (charCode<=122) ) { // && = 앞의 피연산자가 false면 뒤는 무시하고 false 산출
            System.out.println("소문자");
        }
        if( !(charCode<48) && !(charCode>57) ) {
            System.out.println("0~9 사이의 숫자");
        }

        int value = 6;
        if( (value%2==0) | ((value|3)==0) ) { // | = 두 개의 피연산자 모두 평가해서 산출
            System.out.println("2 또는 3의 배수");
        }
        if( (value%2==0) || (value%3==0) ) { // || = 앞의 피연산자가 true면 뒤는 무시하고 true 산출
            System.out.println("2 또는 3의 배수");
        }
    }
}
