package desafioJava1;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.modelo = "Cadillac Escalade";
        carro.ano = 1999;
        carro.cor = "Branco";

        carro.exibeFicha();

        System.out.println("Idade do carro:  " + carro.calculaIdade());
    }
}
