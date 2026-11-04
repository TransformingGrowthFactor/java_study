package ch02;

public class P94_ContinueKeyCodeExample {
    public static void main(String[] args) throws Exception {
        int keyCode;

        while(true) {
            keyCode = System.in.read();
            System.out.println("keyCode: " + keyCode);
            // 여기까지만 적으면, 종료구문이 없으므로 수동으로 종료해야 함 주의

            // keyCode가 113(즉, 인풋이 q)일 경우 반복문 중지하는 조건.
            if(keyCode == 113) {
                break;
            }
        }
    }
}

// System.in.read()는 키코드를 하나씩만 읽기 때문에, 여러 키를 조합해야 한 글자가 나오는 한글은 읽지를 못 함.
// 그리고 입력된 내용을 통 문자열로 읽을 수도 없음.
// 이 경우 쓰는 것은 Scanner 클래스인데, 이건 다음 코드에서 진행