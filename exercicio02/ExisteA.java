package exercicio02;

import java.util.Scanner;

public class ExisteA {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma palavra ou frase:");
        String entradaPalavra = teclado.nextLine();
        boolean possuiA = false;
        int quantidadeDeA = 0;

        char[] cadeiaCaracteres = (entradaPalavra.toUpperCase()).toCharArray();

        for (int i = 0; i < entradaPalavra.length(); i++) {
            if (cadeiaCaracteres[i] == 'A') {
                possuiA = true;
                quantidadeDeA++;
            }
        }

        if (possuiA) {
            System.out.println("Existe a letra 'a', e ela aparece " + quantidadeDeA +
                    " vezes");
        } else {
            System.out.println("Não possui letra 'a' ");
        }

        teclado.close();
    }
}
