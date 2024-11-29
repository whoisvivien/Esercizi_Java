import java.util.Scanner;

public class EsercizioIV {
    public static void main(String[] args) {
        //LEGGO UN DOUBLE DA TASTIERA
        Scanner input = new Scanner(System.in);
        System.out.print("Digita un numero decimale: ");
        double x = input.nextDouble();

        //CHIUDO LO SCANNER
        input.close();

        //STAMPO I DOUBLE ADIACENTI
        System.out.println("Questo è il più piccolo precedente: " + Math.nextDown(x));
        System.out.println("Questo è il double successivo: " + Math.nextUp(x));
    }
}
