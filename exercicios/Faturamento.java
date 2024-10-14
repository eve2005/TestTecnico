package exercicios;
/* 3) Dado um vetor que guarda o valor de faturamento diário de uma distribuidora, 
*  faça um programa, na linguagem que desejar, que calcule e retorne:
*   • O menor valor de faturamento ocorrido em um dia do mês;
*   • O maior valor de faturamento ocorrido em um dia do mês;
*   • Número de dias no mês em que o valor de faturamento diário foi superior à média mensal.
*
*   IMPORTANTE:
*    a) Usar o json ou xml disponível como fonte dos dados do faturamento mensal;
*    b) Podem existir dias sem faturamento, como nos finais de semana e feriados. Estes dias devem ser ignorados no cálculo da média;
 */

import java.util.ArrayList;

public class Faturamento {

    public static void main(String[] args) {
        // {dia, faturamento}
        double[][] dados = {
                { 1, 22174.1664 },
                { 2, 24537.6698 },
                { 3, 26139.6134 },
                { 4, 0.0 },
                { 5, 0.0 },
                { 6, 26742.6612 },
                { 7, 0.0 },
                { 8, 42889.2258 },
                { 9, 46251.174 },
                { 10, 11191.4722 },
                { 11, 0.0 },
                { 12, 0.0 },
                { 13, 3847.4823 },
                { 14, 373.7838 },
                { 15, 2659.7563 },
                { 16, 48924.2448 },
                { 17, 18419.2614 },
                { 18, 0.0 },
                { 19, 0.0 },
                { 20, 35240.1826 },
                { 21, 43829.1667 },
                { 22, 18235.6852 },
                { 23, 4355.0662 },
                { 24, 13327.1025 },
                { 25, 0.0 },
                { 26, 0.0 },
                { 27, 25681.8318 },
                { 28, 1718.1221 },
                { 29, 13220.495 },
                { 30, 8414.61 }
        };

        double menorValor = 0;
        int diaMenor = 0;
        double maiorValor = 0;
        int diaMaior = 0;
        double faturamentoTotal = 0;
        int diasTotal = 0;
        int numeroDiasAcimaMedia = 0;
        ArrayList<Integer> diasAcimaMedia = new ArrayList<>();

        boolean inicializacao = true;
        for (double[] faturamentoDiario : dados) {
            if (inicializacao) {
                menorValor = faturamentoDiario[1];
                maiorValor = faturamentoDiario[1];
                diaMenor = (int) faturamentoDiario[0];
                diaMaior = (int) faturamentoDiario[0];
                inicializacao = false;
            } else if (faturamentoDiario[1] > maiorValor) {
                maiorValor = faturamentoDiario[1];
                diaMaior = (int) faturamentoDiario[0];
            } else if (faturamentoDiario[1] < menorValor && faturamentoDiario[1] != 0) {
                menorValor = faturamentoDiario[1];
                diaMenor = (int) faturamentoDiario[0];
            }
            faturamentoTotal += faturamentoDiario[1];
            diasTotal++;

        }
        System.out.println("Maior Faturamento: " + maiorValor + ", no dia " + diaMaior);
        System.out.println("Menor Faturamento" + menorValor + ", no dia " + diaMenor);

        double mediaFaturamento = faturamentoTotal / diasTotal;
        System.out.println("Media " + mediaFaturamento);

        for (double[] faturamentoDiario : dados) {
            if (faturamentoDiario[1] > mediaFaturamento) {
                numeroDiasAcimaMedia++;
                diasAcimaMedia.add((int) faturamentoDiario[0]);
            }
        }
        System.out.println("o Número de dias em que o faturamento foi acima da média: " + numeroDiasAcimaMedia
                + " dias, sendo eles:");
        for (int dia : diasAcimaMedia) {
            System.out.println(dia);
        }

    }

}
/*
 * RESULTADO
 * Maior Faturamento: 48924.2448, no dia 16
 * Menor Faturamento373.7838, no dia 14
 * o Número de dias em que o faturamento foi acima da média: 12 dias, sendo
 * eles:
 * 1
 * 2
 * 3
 * 6
 * 8
 * 9
 * 16
 * 17
 * 20
 * 21
 * 22
 * 27
 */
