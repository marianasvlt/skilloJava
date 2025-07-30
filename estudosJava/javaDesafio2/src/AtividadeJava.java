import java.text.DecimalFormat;

public class AtividadeJava {
    public static void main(String[] args) {
        DecimalFormat formato = new DecimalFormat("#.##");

        //Média das notas
        double nota1 = 8.5;
        double nota2 = 5.9;
        double media = (nota1 + nota2) /2;
        System.out.println("Média das notas: " + media);

        //Casting

        double numeroDecimal = 9.8;
        int numeroInteiro = (int) numeroDecimal;
        System.out.println("Valor casting:" + numeroInteiro);

        // Char e concatenação
        char letra = 'A';
        String palavra = "lura";
        String mensagem = letra + palavra;
        System.out.println("Mensagem: " + mensagem);

        //Calcular preço
        double precoProduto = 79.91;
        int quantidade = 3;
        double valorTotal = precoProduto * quantidade;
        System.out.println("Valor total: R$ " + formato.format(valorTotal));

        //Cálculo dólar
        double valorEmDolares = 100.0;
        double cotacao = 4.94;
        double valorEmReais = valorEmDolares * cotacao;
        System.out.println("Valor em reais: R$ " + formato.format(valorEmReais));

        //Preço com desconto
        double precoOriginal = 150.00;
        double percentualDesconto = 10.0;
        double valorDesconto = precoOriginal * (percentualDesconto /100);
        double precoComDesconto = precoOriginal - valorDesconto;
        System.out.println("Preço com desconto: " + formato.format(precoComDesconto));

    }
}
