// https://docs.google.com/document/d/1MurmMbcARrlOG1l9T9PCZJgLgaFfG3bKk_GvQXXeEDs/edit

public class HW_1_3 {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(1.0 * a / b);
        System.out.println(a % b);

        if (a % 2 == 0) {
            System.out.println("a is even.");
        } else {
            System.out.println("a is odd.");
        }
        if (b % 2 == 0) {
            System.out.println("b is even.");
        } else {
            System.out.println("b is odd.");
        }
    }
}