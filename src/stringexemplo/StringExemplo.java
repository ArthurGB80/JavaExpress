package StringExemplo;

import java.util.Arrays;

public class StringExemplo {

    public static void main(String[] args) {
        String str1 = "Ola";
        String str2 = "Mundo";
        String str3 = str1 + " " + str2;

        System.out.println("Concatenacao: " + str3);
        // Concatenação: Hello World

        int tamanho = str3.length();
        System.out.println("Tamanho: " + tamanho);
        // Tamanho: 8

        char[] charArray = str3.toCharArray();
        System.out.println("Char array: " + Arrays.toString(charArray));
        // Char array: [O, l, a, M, u, n, d, o]

        String maiuscula = str3.toUpperCase();
        System.out.println("Maiuscula: " + maiuscula);
        // Maiuscula: OLA MUNDO

        String minuscula = str3.toLowerCase();
        System.out.println("Lower case: " + minuscula);
        // Minusculas: ola mundo

        boolean contem = str3.contains("Ola");
        System.out.println("Contem 'Ola': " + contem);
        // Contem 'Ola': true
    }
}