package br.com.alura.screematch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private int episodiosportemp;
    private boolean ativa;
    private int minutosPorEpisodio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosportemp() {
        return episodiosportemp;
    }

    public void setEpisodiosportemp(int episodiosportemp) {
        this.episodiosportemp = episodiosportemp;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public void exibaFichaTecnica() {
        System.out.println("*******************************");
        System.out.println("nome da serie: " + getNome());

        System.out.println("Temporadas: " + temporadas);
        System.out.println("episodios: " + episodiosportemp);

    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosportemp * minutosPorEpisodio;
    }
}
