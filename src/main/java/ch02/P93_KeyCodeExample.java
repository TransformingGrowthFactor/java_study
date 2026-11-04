package ch02;

public class P93_KeyCodeExample {
    public static void main(String[] args) throws Exception {
        int keyCode;

        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode);

        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode);

        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode);
    }
}
