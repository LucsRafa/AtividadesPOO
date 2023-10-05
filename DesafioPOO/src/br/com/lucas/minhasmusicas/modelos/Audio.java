package br.com.lucas.minhasmusicas.modelos;

public class Audio {
   private String titulo;
    private int totalReproduções;
    private int totalCurtidas;
    private int classificacao;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproduções;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void curte() {
        this.totalCurtidas++;
    }
    public void reproduz(){
       this.totalReproduções++;
    }
}
