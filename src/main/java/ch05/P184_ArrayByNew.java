package ch05;

public class P184_ArrayByNew {
    public static void main(String[] args) {
        // int
        int[] arr1 = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("arr1[" + i + "]: " + arr1[i]); // 0이 쏟아짐
        }
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        for (int i = 0; i < 3; i++) {
            System.out.println("arr1[" + i + "]: " + arr1[i]); // 1~3이 나올 것
        }


        // double
        double[] arr2 = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("arr2[" + i + "]: " + arr2[i]); // 0.0이 쏟아짐
        }
        arr2[0] = 0.1;
        arr2[1] = 0.2;
        arr2[2] = 0.3;
        for (int i = 0; i < 3; i++) {
            System.out.println("arr2[" + i + "]: " + arr2[i]); // 0.1 ~ 0.3이 나옴
        }


        // string
        String[] arr3 = new String[3];
        for (int i=0; i<3; i++) {
            System.out.println("arr3[" + i + "] : " + arr3[i]); // null이 쏟아짐
        }
            arr3[0] = "1월";
            arr3[1] = "2월";
            arr3[2] = "3월";
            for (int i=0; i<3; i++) {
                System.out.println("arr3[" + i + "] : " + arr3[i]); // 이제 1~3월 나올 것
            }
        }
    }