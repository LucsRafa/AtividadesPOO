package br.com.lucas.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio) {
        if(audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + "é Sucesso!");
        } else {
            System.out.println(audio.getTitulo() + "também estão curtindo");
        }
    }
}
