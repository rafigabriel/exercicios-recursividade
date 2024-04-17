public class ex005 {
    public static void main(String[] args) {
        double v[] = { 10, 20, 30.5, 4 };
        System.out.println(menorValor(v));

    }

    public static double menorValor(double v[]) {
        double menor = v[0];
        for (int i = 1; i < v.length; i++) {
            if (v[i] < menor) {
                menor = v[i];
            }
        }
        return menor;
    }
}
