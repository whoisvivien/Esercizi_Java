//2A. Intro Java SLIDE 27

public class ProvaWhile {
    public static void main(String[] args) {
        int x = 4;
        int y = 0;

        while (--x >= 0) {
            y += 2;
            System.out.println("Questo è il risultato del primo ciclo " + y);
        }
        int[] a = {0, 1, 1, 2, 3, 5};
        int i = 0;
        while (i < a.length) {
            System.out.println("Questo è il risultato del secondo ciclo " + a[i]);
            i++;
        }
    }
}
