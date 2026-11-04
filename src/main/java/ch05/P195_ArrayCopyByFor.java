package ch05;

public class P195_ArrayCopyByFor {
    public static void main(String[] args) {
        int [] oldIntArray  = { 1, 2, 3 };
        int [] newIntArray = new int[5]; // [0, 0, 0, 0, 0] 이겠지

        for(int i=0; i<oldIntArray.length; i++) {
            newIntArray[i] = oldIntArray[i]; // 앞의 세개만 값이 바뀌겠지. [ 1, 2, 3, 0, 0 ]
        }

        for(int i=0; i<newIntArray.length; i++) {
            System.out.println(newIntArray[i] + ", ");
        }
    }
}
