package desafioJava1;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    int somaDasAvaliacoes;
    int totalDeAvaliacoes;

    void exibeFicha(){
        System.out.println("Música: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento );
    }

    void avalia (double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double mediaDasAvaliacoes () {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

}
