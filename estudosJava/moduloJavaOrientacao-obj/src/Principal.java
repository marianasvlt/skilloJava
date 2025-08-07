package aulaJava;

public class Principal {
        public static void main(String[] args) {

            Filme meuFilme = new Filme();
            meuFilme.setNome("O poderoso chefão");
            meuFilme.setAnoDeLancamento(1970);
            meuFilme.setDuracaoEmMinutos(180);
            System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

            meuFilme.exibeFichaTecnica();
            meuFilme.avalia(8);
            meuFilme.avalia(7);
            meuFilme.avalia(10);
            System.out.println("total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
            System.out.println(meuFilme.pegaMedia());

            Serie serie = new Serie();
            serie.setNome("Pretty Little Liars");
            serie.setAnoDeLancamento(2010);
            serie.exibeFichaTecnica();
            serie.setTemporadas(7);
            serie.setEpisodiosPorTemporada(24);
            serie.setMinutosPorEpisodio(50);
            System.out.println("Duração para maratonar a série: " + serie.getDuracaoEmMinutos());


        }
    }
