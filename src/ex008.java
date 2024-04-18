public class ex008 {
    public static void main(String[] args) {
        String texto =  "Rafi";
        imprimirInvertido(texto.toCharArray(), texto.length() - 1);
    }

    public static void imprimirInvertido(char[] caracteres, int index){
        if(index >= 0){
            System.out.print(caracteres[index]);
            imprimirInvertido(caracteres, index - 1);
        }
    }
}
