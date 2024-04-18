public class ex007 {
    public static void main(String[] args) {
        /*Primeiro jeito de realizar a atividade:
        String frases [] = {"radar", "oi"};
        for (String frase : frases) {
            System.out.println("A palavra " + frase + " é palíndromo? " + verifPalindromo(frase));
        }
        */

        /*Segundo jeito de realizar a atividade:
        String palavras [] = {"radar", "oi"};
        for(String palavra : palavras ){
            System.out.println("A palavra " + palavra + " é palíndromo? " + ehPalindromo(palavra));
        }
        */
    }

    /*Primeiro jeito de realizar a atividade:
    public static boolean verifPalindromo(String frase){
        frase = frase.replaceAll("[^a-zA-Z]", "").toLowerCase();
        return frase.equals(new StringBuilder(frase).reverse().toString());
    }
    */

    /*Primeiro jeito de realizar a atividade:
    public static boolean ehPalindromo(String palavra){
        palavra = palavra.replaceAll("[^a-zA-Z]", "").toLowerCase();
        return verifPalindromo2(palavra, 0, palavra.length() - 1);
    }

    public static boolean verifPalindromo2(String palavra, int inicio, int fim){
        if(inicio >= fim){
            return true;
        }

        if(palavra.charAt(inicio) != palavra.charAt(fim)){
            return false;
        }

        return verifPalindromo2(palavra, inicio + 1, fim - 1);
    }
    */
    
}
