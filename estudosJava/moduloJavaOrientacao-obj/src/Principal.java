public class Principal {
    public static void main(String[] args) {

        //Atv1
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;

        //Atv2
        //Filme meuFilme2 = new Filme();
        //meuFilme2.nome ="Invocação do mal 3: A Ordem do Demônio";
        //meuFilme2.anoDeLancamento = 2021;
        //meuFilme2.duracaoEmMinutos = 111;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(7);
        meuFilme.avalia(10);
        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.pegaMedia());

        //2
        //System.out.println(meuFilme2.nome);
        //System.out.println(meuFilme2.anoDeLancamento);
        //System.out.println(meuFilme2.duracaoEmMinutos);
    }
}
