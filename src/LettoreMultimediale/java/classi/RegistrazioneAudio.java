package LettoreMultimediale.java.classi;

import LettoreMultimediale.java.interfacce.RegolabileVolume;
import LettoreMultimediale.java.interfacce.Riproducibile;

// Classe concreta RegistrazioneAudio che estende ElementoMultimediale e implementa Riproducibile e RegolabileVolume
public class RegistrazioneAudio extends ElementoMultimediale implements Riproducibile, RegolabileVolume {
    private int durata;
    private int volume;

    public RegistrazioneAudio(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
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

    public void play() {
        for (int i = 0; i < durata; i++) {
            for (int j = 0; j < volume; j++) {
                System.out.print("!");
            }
            System.out.println(" " + titolo);
        }
    }

    @Override
    public void esegui() {
        play();
    }
}