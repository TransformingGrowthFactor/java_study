package ch02;

public class P68_FloatDoubleExample {
    public static void main(String[] args) {
        //실수값 저장
        //float var1 = 3.14; //컴파일 에러 발생할 것
        float var2 = 3.14f; //담고 싶은 값 뒤에 f를 붙여줘야 함
        double var3 = 3.14;

        //정밀도 테스트
        float var4 = 0.1234567890123456789f;
        double var5 = 0.1234567890123456789;

        System.out.println("var2: " + var2);
        System.out.println("var3: " + var3);
        System.out.println("var4: " + var4); //float은 소수점으로 일곱자리가 최대
        System.out.println("var5: " + var5); //double인 var5가 두 배 이상 정밀한 값을 낼 것임

        //e 사용하기
        double var6 = 3e6;
        float var7 = 3e6F;
        double var8 = 2e-3;
        System.out.println("var6: " + var6);
        System.out.println("var7: " + var7);
        System.out.println("var8: " + var8);
    }
}
