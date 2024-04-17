public class ex006 {
    public static void main(String[] args) {
        double v[] = { 15.2, 42.1, 2, 30 };
        System.out.println(menorValorRecursivo(v, 4));

    }

    public static double menorValorRecursivo(double v[], int tamanho) {
        if (tamanho == 1) {
            return v[0];
        }

        double menor = v[0];

        return v[tamanho - 1] < menor ? menor = v[tamanho - 1] : menorValorRecursivo(v, tamanho - 1);
    }
}
