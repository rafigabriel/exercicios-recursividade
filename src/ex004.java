public class ex004 {
    public static void main(String[] args) {
        int cont = acharString("O amor cura.", 'a', 0);
        System.out.println(acharString("O amor cura.", 'a', 0));
        System.out.println("A quantidade de vezes que o caracter A se repete é : " + cont);
    }

    public static int acharString(String texto, char caracter, int cont) {
        if (texto.length() == 0) {
            return cont;
        }

        return texto.charAt(0) == caracter ? acharString(texto.substring(1), caracter, cont + 1)
                : acharString(texto.substring(1), caracter, cont);

    }
}
