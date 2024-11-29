//2A. Intro Java SLIDE 38

public class ProvaArray {
    public static void main(String[] args) {
        int[] a3 = new int[3];

        for (int i = 0; i < a3.length; i++) {
            a3[i] = (i + 1) * 2;
            System.out.println("Questo è il risultato " + a3[i]);
        }
    }
}
