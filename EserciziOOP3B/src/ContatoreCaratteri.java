import java.util.Scanner;

public class ContatoreCaratteri {

    // Metodo che conta il numero di occorrenze di un carattere in una stringa
    public static int conta(String stringa, char carattere) {
        int conteggio = 0;
        for (int i = 0; i < stringa.length(); i++) {
            if (stringa.charAt(i) == carattere) {
                conteggio++;
            }
        }
        return conteggio;
    }

    // Metodo main per testare il metodo conta
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci una stringa: ");
        String stringa = input.nextLine() ;
        System.out.print("Inserisci un carattere che vuoi cercare all'interno della stringa: ");
        char carattere = input.nextLine().charAt(0);
        input.close();

        // Utilizzo del metodo conta
        int numeroOccorrenze = conta(stringa, carattere);
        System.out.println("Il carattere '" + carattere + "' appare " + numeroOccorrenze + " volte nella stringa \"" + stringa + "\".");
    }
}
