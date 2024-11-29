import java.math.BigInteger;
import java.util.Scanner;

public class EsercizioVI {
    // METODO CHE CALCOLA IL FATTORIALE UTILIZZANDO BigInteger
    public static BigInteger factorial(int n) {
        BigInteger risultatoBase = BigInteger.ONE; //perché il fattoriale di 0 è 1
        for (int i = 1; i <= n; i++) { //Usiamo un ciclo for per moltiplicare risultatoBase per ogni numero da 1 a n
            risultatoBase = risultatoBase.multiply(BigInteger.valueOf(i));
        }
        return risultatoBase;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci un numero per calcolare il fattoriale: ");
        int numero = input.nextInt();

        BigInteger risultato = factorial(numero); //Calcoliamo il fattoriale utilizzando il metodo factorial
        System.out.println("Il fattoriale di " + numero + " è: " + risultato);

        input.close();
    }
}
