package br.com.lucas.minhasmusicas.principal;

import br.com.lucas.minhasmusicas.modelos.MinhasPreferidas;
import br.com.lucas.minhasmusicas.modelos.Musica;
import br.com.lucas.minhasmusicas.modelos.Podcast;

public class principal {
    public static void main(String[] args) {
        Musica myMusic = new Musica();

        myMusic.setTitulo("Forever");
        myMusic.setCantor("Kiss");


        for (int i = 0; i < 1000; i++) {
            myMusic.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            myMusic.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("BolhaDev");
        meuPodcast.setApresentador("Marcos Mendes");


        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

          MinhasPreferidas preferidas = new MinhasPreferidas();
            preferidas.inclui(meuPodcast);
            preferidas.inclui(myMusic);
    }
    }

