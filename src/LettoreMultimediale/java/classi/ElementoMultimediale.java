package LettoreMultimediale.java.classi;

// Classe astratta ElementoMultimediale
public abstract class ElementoMultimediale {
    public String titolo;

    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;
    }

    public abstract void esegui();
}
