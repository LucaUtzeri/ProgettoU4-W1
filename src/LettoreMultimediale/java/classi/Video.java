package LettoreMultimediale.java.classi;

import LettoreMultimediale.java.interfacce.RegolabileLuminosita;
import LettoreMultimediale.java.interfacce.RegolabileVolume;
import LettoreMultimediale.java.interfacce.Riproducibile;

// Classe concreta Video che estende ElementoMultimediale e implementa Riproducibile, RegolabileVolume e RegolabileLuminosita
public class Video extends ElementoMultimediale implements Riproducibile, RegolabileVolume, RegolabileLuminosita {
    private int durata;
    private int volume;
    private int luminosita;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }

    @Override
    public int getDurata() {
        return durata;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void abbassaVolume() {
        volume--;
        if (volume < 0) {
            volume = 0;
        }
    }

    @Override
    public void alzaVolume() {
        volume++;
    }

    @Override
    public int getLuminosita() {
        return luminosita;
    }

    @Override
    public void aumentaLuminosita() {
        luminosita++;
    }

    @Override
    public void diminuisciLuminosita() {
        luminosita--;
        if (luminosita < 0) {
            luminosita = 0;
        }
    }

    public void play() {
        for (int i = 0; i < durata; i++) {
            for (int j = 0; j < volume; j++) {
                System.out.print("!");
            }
            for (int k = 0; k < luminosita; k++) {
                System.out.print("*");
            }
            System.out.println(" " + titolo);
        }
    }

    @Override
    public void esegui() {
        play();
    }
}
