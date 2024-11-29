//2A. Intro Java SLIDE 45

public class Lotteria {
    public static void main(String[] args) {

        //DICHIARAZIONE DELLA VARIABILE COSTANTE nmax E CREAZIONE DELL'ARRAY MULTIDIMENSIONALE odds
        final int nmax = 6;
        int[][] odds = new int[nmax + 1][];

        //INIZIALIZZAZIONE DELL'ARRAY MULTIDIMENSIONALE odds
        for (int i = 0; i <= nmax; i++) {
            odds[i] = new int[i + 1];
        }

        /* CALCOLO DEI COEFFICIENTI BINOMIALI E RIEMPIMENTO DELL'ARRAY odds */
            for (int i = 0; i < odds.length; i++)
                for (int j = 0; j < odds[i].length; j++) {
                    int lodds = 1;

                    //CALCOLO DEL COEFFICIENTE BINOMIALE (n SU k)
                    for (int k = 1; k <= j; k++)
                        lodds = lodds * (i - k + 1) / k;
                    odds[i][j] = lodds;
                }

            //STAMPA DELL'ARRAY odds
            for (int[] row : odds) {
                for (int odd : row)
                    System.out.print(odd + " ");
                System.out.println();
            }

        }
    }

