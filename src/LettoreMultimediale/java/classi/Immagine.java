package LettoreMultimediale.java.classi;

import LettoreMultimediale.java.interfacce.RegolabileLuminosita;

public class Immagine extends ElementoMultimediale implements RegolabileLuminosita {
    private int luminosita;

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
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

    public void show() {
        for (int i = 0; i < luminosita; i++) {
            System.out.print("*");
        }
        System.out.println(" " + titolo);
    }

    @Override
    public void esegui() {
        show();
    }
}