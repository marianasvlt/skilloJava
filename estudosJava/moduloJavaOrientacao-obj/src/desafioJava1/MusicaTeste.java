package desafioJava1;

public class MusicaTeste {
        public static void main(String[] args) {

            Musica musica = new Musica();
            musica.titulo =  "Church";
            musica.artista = "Chase Atlantic";
            musica.anoLancamento = 2017;

            musica.exibeFicha();
            musica.avalia(8);
            musica.avalia(9);
            musica.avalia(10);

            musica.avalia(9.6);
            System.out.println("Média das avaliações:  " + musica.mediaDasAvaliacoes());
        }
    }
