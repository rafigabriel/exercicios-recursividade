public class ex001 {
    public static void main(String[] args) throws Exception {
        int v[] = { 10, 20, 30, 40, 50 };
        System.out.println(media(v, 5, 5));

    }

    public static double media(int v[], int total, int num) {
        if (num == 0) {
            return 0;
        }

        return (double) v[num - 1] / total + media(v, total, num - 1);
    }
}
