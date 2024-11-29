import java.util.Scanner;

public class EsercizioIII {
    public static void main(String[] args) {
       //LEGGO TRE CIFRE DA TASTIERA
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci tre cifre intere diverse: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        input.close();

        //TROVO LA CIFRA MAGGIORE CON L'OPERATORE TERNARIO
        int numeroMaggiore1 = a > b ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println("Utilizzando l'operatore ternario la cifra maggiore è: " + numeroMaggiore1);

        //UTILIZZANDO IL METODO Math.max
        int numeroMaggiore2 = Math.max(a, Math.max(b, c));
        System.out.println("Utilizzando il metodo Math.max la cifra maggiore è: " + numeroMaggiore2);
    }
}
