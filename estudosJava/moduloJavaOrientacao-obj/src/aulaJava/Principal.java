package aulaJava;

public class Principal {
        public static void main(String[] args) {

            Filme meuFilme = new Filme();
            meuFilme.setNome("O poderoso chefão");
            meuFilme.setAnoDeLancamento(1970);
            meuFilme.setDuracaoEmMinutos(180);

            meuFilme.exibeFichaTecnica();
            meuFilme.avalia(8);
            meuFilme.avalia(7);
            meuFilme.avalia(10);
            System.out.println("total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
            System.out.println(meuFilme.pegaMedia());

        }
    }
