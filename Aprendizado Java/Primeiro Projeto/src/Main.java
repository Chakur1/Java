public class Main {
    static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top GUn: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: "+ anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0)/3;
        System.out.println(media);
        String Sinopse="Filme Top Gun com ator famoso dos anos 90";
        //podemos fazer também:
        String sinopse = """
                Filme Top Gun com ator famoso dos anos 90
                
                Ótimo filme!
                
                Ano de lançamento
                """+ anoDeLancamento;
        System.out.println(sinopse);

    }
}
