import java.util.Scanner;

public class EsercizioI {
    public static void main(String[] args) {
        //LEGGE UN INTERO DA TASTIERA
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci un intero: ");
        int numero = input.nextInt();

        //CHIUDI LO SCANNER
        input.close();

        //STAMPA LE RAPPRESENTAZIONI
        System.out.println("Rappresentazione in binario: " + Integer.toBinaryString(numero));
        System.out.println("Rappresentazione in ottale: " + Integer.toOctalString(numero));
        System.out.println("Rappresentazione in esadecimale: " + Integer.toHexString(numero));

        //CALCOLIAMO IL RECIPROCO
        float reciproco = 1.0f / numero;

        //STAMPIAMO IL RECIPROCO COME FLOATING-POINT ESADECIMALE
        System.out.printf("Reciproco come floating-point esadecimale: " + Float.toHexString(reciproco));
    }
}