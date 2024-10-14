package exercicio02;

/*
#    2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor 
#    sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8,
#    13, 21, 34...), escreva um programa na linguagem que desejar onde, informado
#    um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando
#    se o número informado pertence ou não a sequência.
#
#   IMPORTANTE: Esse número pode ser informado através de qualquer entrada de sua preferência 
#    ou pode ser previamente definido no código;
 */
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        int valorParaTestar = teclado.nextInt();

        int penultimo = 1;
        int ultimo = 2;
        int numeroFibonacci = 0;
        boolean pertence = false;

        while (numeroFibonacci < valorParaTestar) {
            numeroFibonacci = penultimo + ultimo;
            penultimo = ultimo;
            ultimo = numeroFibonacci;

            if (numeroFibonacci == valorParaTestar) {
                System.out.println("O número " + valorParaTestar + " pertence a sequencia de Fibonacci");
                pertence = true;
                break;
            }
        }
        if (!pertence) {
            System.out.println("O número " + valorParaTestar + " não pertence a sequencia de Fibonacci");
        }
        teclado.close();
    }
}
