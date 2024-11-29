//2A. Intro Java SLIDE 28

public class ProvaFor {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Questo è il risultato del primo for " + i);
        }

        int j = 5;
        for (;j > 0; j--) {
            System.out.println("Questo è il risultato del secondo for " + j);
        }

        for (int k = 0; k < 10 && k != 2; k++) {
            System.out.println("Questo è il risultato del terzo for " + k);
        }
    }
}
