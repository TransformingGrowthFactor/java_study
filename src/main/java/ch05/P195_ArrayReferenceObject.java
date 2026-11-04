package ch05;

public class P195_ArrayReferenceObject {
    public static void main(String[] args) {
        String[] strArray = new String[3];
        strArray[0] = "Java";
        strArray[1] = "Java";
        strArray[2] = new String("Java");

        System.out.println( strArray[0] == strArray[1] ); // 뭐야 같은 내용의 문자열이네? 그럼 같은 객체 써. ...로 인해 true가 됨
        System.out.println( strArray[0] == strArray[2]); // new String으로 새 객체를 만들었기 때문에, false가 나옴
        System.out.println( strArray[0].equals(strArray[2])); // 문자열을 비교하기 때문에 true
    }
}
