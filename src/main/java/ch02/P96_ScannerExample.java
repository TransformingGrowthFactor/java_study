package ch02;

import java.util.Scanner; // import 잊지 마시고...

public class P96_ScannerExample {
    public static void main(String[] args) throws Exception {
        // keyCode는 한 번의 키보드 입력밖에 못 받아내므로, 제대로 된 문자열을 취급하고 싶으면 Scanner 유틸을 사용해야 함.

        Scanner StringExample = new Scanner(System.in);
        String inputData;

        while(true) {
            inputData = StringExample.nextLine();
            System.out.println("입력된 문자열: \"" + inputData + "\"");

            // 종료구문
            if(inputData.equals("q")) { // 문자열이 동일한지를 비교할 때는 == 말고 equals()을 사용함
                break;
            }
        }

    }
}
