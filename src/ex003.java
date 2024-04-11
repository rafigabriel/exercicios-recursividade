public class ex003 {
    public static void main(String[] args) {
        System.out.println(mdcRecursivo(100, 200));
    }

    public static int mdcRecursivo(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }

        return mdcRecursivo(b, a % b);
    }

    
}
