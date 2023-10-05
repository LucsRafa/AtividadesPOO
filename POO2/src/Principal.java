import br.com.alura.screematch.calculos.CalculadoraDeTempo;
import br.com.alura.screematch.calculos.FiltroRecomendacao;
import br.com.alura.screematch.modelos.Episodios;
import br.com.alura.screematch.modelos.Filme;
import br.com.alura.screematch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("Spider");
        meuFilme.setAnoDeLancamento(2021);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.exibaFichaTecnica();
        System.out.println("duração do filme: " + meuFilme.getDuracaoEmMinutos() + " minutos");
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());


        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie();

        lost.setNome("lost");
        lost.setAnoDeLancamento(2000);

        lost.setTemporadas(10);
        lost.setEpisodiosportemp(10);
        lost.setMinutosPorEpisodio(50);
        lost.exibaFichaTecnica();
        System.out.println("duração para maratonar:  " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();

        outroFilme.setNome("Spider 3");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);
        System.out.println("duração do filme: " + outroFilme.getDuracaoEmMinutos());
        outroFilme.exibaFichaTecnica();
        outroFilme.avalia(8);
        outroFilme.avalia(5);
        outroFilme.avalia(10);
        System.out.println("Total de avalia: " + outroFilme.getTotalDeAvaliacoes());


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.inclui(outroFilme);
        calculadora.inclui(meuFilme);
        calculadora.inclui(lost);

        System.out.println("Tempo para maratonar: " + calculadora.getTempoTotal() + " minutos");
        System.out.println("Classificação: " + meuFilme.getClassificacao());

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        System.out.println("********************************");
        System.out.println("O filme: " + meuFilme.getNome());
        filtro.filtra(meuFilme);
        System.out.println("********************************");


        Episodios episodios = new Episodios();

        episodios.setNumero(1);
        episodios.setSerie(lost);
        episodios.setTotalDeAvaliacoes(300);
        filtro.filtra(episodios);


    }
}
