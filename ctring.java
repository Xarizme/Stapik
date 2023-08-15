import java.lang.Integer;

public class ctring {

    public static void main(String[] args) {
        int a = 256;

        System.out.println(Integer.toBinaryString(a));

        int b = Integer.bitCount(a);
        if (b > 1 || b == 0) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
}
