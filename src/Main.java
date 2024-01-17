import LettoreMultimediale.java.classi.ElementoMultimediale;
import LettoreMultimediale.java.classi.Immagine;
import LettoreMultimediale.java.classi.RegistrazioneAudio;
import LettoreMultimediale.java.classi.Video;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


       class LettoreMultimediale {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                ElementoMultimediale[] playlist = new ElementoMultimediale[5];

                playlist[0] = new Immagine("Immagine1", 3);
                playlist[1] = new RegistrazioneAudio("Audio1", 5, 2);
                playlist[2] = new Video("Video1", 4, 3, 4);
                playlist[3] = new Immagine("Immagine2", 2);
                playlist[4] = new RegistrazioneAudio("Audio2", 6, 1);

                int choice;
                do {
                    // Mostra la lista degli elementi e chiedi all'utente quale eseguire
                    System.out.println("Playlist:");
                    for (int i = 0; i < playlist.length; i++) {
                        System.out.println((i + 1) + ". " + playlist[i].titolo);
                    }
                    System.out.println("0. Esci");
                    System.out.print("Scelta: ");

                    try {
                        choice = scanner.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Input non valido. Inserisci un numero intero.");
                        scanner.nextLine();
                        choice = -1;
                    }

                    if (choice >= 1 && choice <= playlist.length) {
                        playlist[choice - 1].esegui();
                    } else if (choice != 0) {
                        System.out.println("Scelta non valida. Riprova.");
                    }

                } while (choice != 0);

                System.out.println("Programma terminato.");
                scanner.close();
            }
        }
    }
}