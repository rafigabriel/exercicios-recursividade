public class ex002 {
    public static void main(String[] args) {
        System.out.println(mdc(100, 200));
    }

    public static int mdc(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
