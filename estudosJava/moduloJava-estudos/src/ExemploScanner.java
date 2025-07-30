import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        Scanner teste = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = teste.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = teste.nextInt();
        System.out.print("Digite o valor que pretende investir esse mês: ");
        double valor = teste.nextDouble();

        System.out.println(nome + " que tem " + idade + " anos, irá investir R$ " + valor + " esse mês ");

        teste.close();

    }

}
