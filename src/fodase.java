public class fodase {
    public static void main(String[] args) {
        String texto = "O amor cura.";
        char caracter = 'a';
        int cont = contarOcorrencias(texto, caracter, 0);
        System.out.println("A quantidade de vezes que o caractere '" + caracter + "' se repete é: " + cont);
    }

    public static int contarOcorrencias(String texto, char caracter, int index) {
        // Verifica se já percorremos toda a string
        if (index >= texto.length()) {
            return 0;
        }

        // Verifica se o caractere na posição atual é igual ao caractere que estamos procurando
        int cont = texto.charAt(index) == caracter ? 1 : 0;

        // Chama recursivamente a função para o restante da string
        return cont + contarOcorrencias(texto, caracter, index + 1);
    }
}
