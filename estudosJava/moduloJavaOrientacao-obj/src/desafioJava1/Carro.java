package desafioJava1;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibeFicha() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    int calculaIdade() {
        return 2025 - ano;
    }
}
