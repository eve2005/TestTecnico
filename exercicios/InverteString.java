package exercicios;
/* 5) Escreva um programa que inverta os caracteres de um string.
    IMPORTANTE:
    a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
    b) Evite usar funções prontas, como, por exemplo, reverse;
 
 */

import java.util.Scanner;

public class InverteString {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma palavra ou frase:");
        String entradaPalavra = teclado.nextLine();
        String invertido = "";

        char[] cadeiaCaracteres = entradaPalavra.toCharArray();

        for (int i = entradaPalavra.length() - 1; i >= 0; i--) {
            invertido += cadeiaCaracteres[i];
        }

        System.out.println("Sua palavra/frase: " + entradaPalavra);
        System.out.println("Invertido: " + invertido);
        teclado.close();
    }
}
