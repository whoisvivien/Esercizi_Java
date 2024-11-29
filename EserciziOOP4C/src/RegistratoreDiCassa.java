import java.util.Scanner;

//Realizzo la classe principale "RegistratoreDiCassa" che contiene le "Monete"
public class RegistratoreDiCassa {
    private final Moneta coin; /*Serve a creare la classe "Moneta"*/
    private int moneteTotali;
    private double sommaValori;

    //Classe interna per rappresentare la "Moneta"
    private static class Moneta {
        private final String valuta;
        private double[] valore = {0.02, 0.05, 0.10, 0.20, 0.50, 1, 2};

        //Costruttore per inizializzare la "Moneta"
        public Moneta(String valuta, double valore) {
            this.valuta = "euro";
            this.valore = new double[]{0.02, 0.05, 0.10, 0.20, 0.50, 1, 2};
        }

        //Metodi setter per valore
        public void setValore(double valore) {
            this.valore = new double[]{0.02, 0.05, 0.10, 0.20, 0.50, 1, 2};
        }
    }

    //Costruttore per inizializzare il "RegistratoreDiCassa"
    public RegistratoreDiCassa() {
        this.coin = new Moneta("euro", 0);
        this.moneteTotali = 0;
        this.sommaValori = 0;
    }

    //Realizzo i metodi per inserire o rimuovere le monete
    public void inserireMonete() {

            if (moneteTotali < 100) {
                Scanner input = new Scanner(System.in);
                System.out.print("Inserisci il valore della moneta: ");
                double valore = input.nextDouble();
                coin.setValore(valore);
                moneteTotali++;
                sommaValori += valore;
            } else {
                System.out.println("Hai raggiunto il limite massimo di monete.");
            }
        }

    public void rimuovereMonete() {
        if (moneteTotali > 0) {
            Scanner input = new Scanner(System.in);
            System.out.print("Inserisci il valore della moneta: ");
            double valore = input.nextDouble();
            coin.setValore(valore);
            moneteTotali--;
            sommaValori -= valore;
        } else {
            System.out.println("Non ci sono monete da rimuovere.");
        }
    }

    //Proviamo
    public static void main(String[] args) {
        RegistratoreDiCassa cassa = new RegistratoreDiCassa();
        Scanner input = new Scanner(System.in);

        //Per farlo continuare all'infinito
        while (true) {
            System.out.println("Vuoi inserire o rimuovere monete? Oppure vuoi sapere il contenuto della cassa? ");
            String decision = input.nextLine();

            if (decision.equalsIgnoreCase("Inserire")) {
                cassa.inserireMonete();
            } else if (decision.equalsIgnoreCase("Rimuovere")) {
                cassa.rimuovereMonete();
            } else if (decision.equalsIgnoreCase("Contenuto")) {
                break;
            } else {
                System.out.println("Invalid command.");
            }

            //Stampiamo "moneteTotali" e "sommaValori"
            System.out.println("Monete totali: " + cassa.moneteTotali);
            System.out.println("Somma valori: " + cassa.sommaValori + " " + cassa.coin.valuta);
        }
        input.close();
    }
}