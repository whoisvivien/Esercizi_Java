import java.util.Scanner;

public class EsercizioII {
    public static void main(String[] args) {
        //LEGGE UN ANGOLO INTERO DA TASTIERA
        Scanner input = new Scanner(System.in);
        System.out.print("Digita un angolo intero (può essere sia positivo sia negativo): ");
        int angolo = input.nextInt();

        //CHIUDI LO SCANNER
        input.close();

        //NORMALIZZA L'ANGOLO AD UN VALORE COMPRESO TRA 0 E 360 GRADI
        int angoloNormalizzato1 = 0;

        if (angolo > 360) {
            angoloNormalizzato1 = angolo - 360;
        } else if (angolo > 0 && angolo < 360) {
            angoloNormalizzato1 = angolo;
        } else if (angolo < 0) {
            angoloNormalizzato1 = angolo + 360;
        }
        System.out.println("Angolo normalizzato con il mio programma: " + angoloNormalizzato1);

        //UTILIZZANDO OPERATORE MODULO
        int angoloNormalizzato2 = angolo % 360;
        if (angoloNormalizzato2 < 0) {
            angoloNormalizzato2 += 360;
        }
        System.out.println("Angolo normalizzato con l'operatore modulo: " + angoloNormalizzato2);

        //UTILIZZANDO IL METODO Math.floorMod
        int angoloNormalizzato3 = Math.floorMod(angolo, 360);
        System.out.println("Angolo normalizzato con il metodo Math.floorMod: " + angoloNormalizzato3);
    }
}
