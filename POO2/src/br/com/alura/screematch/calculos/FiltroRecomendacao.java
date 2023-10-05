package br.com.alura.screematch.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel){

        if(classificavel.getClassificacao() >= 4){
            System.out.println("está bombando");
        } else if (classificavel.getClassificacao() >= 2) {

            System.out.println("bem avaliado");

        } else {
            System.out.println(" assista depois");
    }

    }
}
