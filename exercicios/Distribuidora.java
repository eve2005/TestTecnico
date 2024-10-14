package exercicios;
/*4) Dado o valor de faturamento mensal de uma distribuidora, detalhado por estado:
• SP – R$67.836,43
• RJ – R$36.678,66
• MG – R$29.229,88
• ES – R$27.165,48
• Outros – R$19.849,53

Escreva um programa na linguagem que desejar onde calcule o percentual de representação que cada estado teve dentro do valor total mensal da distribuidora.  */

public class Distribuidora {

    public static class Dados {
        String estado;
        double faturamento;

        public Dados(String estado, double faturamento) {
            this.estado = estado;
            this.faturamento = faturamento;
        }
    }

    public static void main(String[] args) {

        Dados[] dadosFaturamento = {
                new Dados("SP", 67836.43),
                new Dados("RJ", 36678.66),
                new Dados("MG", 29229.88),
                new Dados("ES", 27165.48),
                new Dados("outros", 19849.53)
        };

        double total = 0;
        double porcentagem = 0;
        for (Dados dado : dadosFaturamento) {
            total += dado.faturamento;
        }
        for (Dados dado : dadosFaturamento) {
            porcentagem = (dado.faturamento / total) * 100;
            System.out.println("A porcentagem de faturamendo do estado " + dado.estado + " é: "
                    + String.format("%.2f", porcentagem) + " %");
        }

    }
}
/*
 * RESULTADO
 * A porcentagem de faturamendo do estado SP é: 37,53 %
 * A porcentagem de faturamendo do estado RJ é: 20,29 %
 * A porcentagem de faturamendo do estado MG é: 16,17 %
 * A porcentagem de faturamendo do estado ES é: 15,03 %
 * A porcentagem de faturamendo do estado outros é: 10,98 %
 */
