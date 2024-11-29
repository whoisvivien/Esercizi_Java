import java.util.Scanner;

public class Robot {
    private String direction;
    private final Point location;

    // Classe interna per rappresentare un punto
    private static class Point {
        private int x;
        private int y;

        // Costruttore per inizializzare il punto
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        // Metodi getter per le coordinate x e y
        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        // Metodi setter per le coordinate x e y
        public void setX(int x) {
            this.x = x;
        }

        public void setY(int y) {
            this.y = y;
        }
    }

    // Costruttore per inizializzare il robot
    public Robot() {
        this.direction = "N";  // Direzione iniziale impostata a Nord
        this.location = new Point(0, 0);  // Posizione iniziale (0, 0)
    }

    public void turnLeft() {
        switch (this.direction) {
            case "N":
                this.direction = "W";
                break;
            case "W":
                this.direction = "S";
                break;
            case "S":
                this.direction = "E";
                break;
            case "E":
                this.direction = "N";
                break;
        }
    }

    public void turnRight() {
        switch (this.direction) {
            case "N":
                this.direction = "E";
                break;
            case "E":
                this.direction = "S";
                break;
            case "S":
                this.direction = "W";
                break;
            case "W":
                this.direction = "N";
                break;
        }
    }

    public void move() {
        switch (this.direction) {
            case "N":
                this.location.setY(this.location.getY() + 1);
                break;
            case "S":
                this.location.setY(this.location.getY() - 1);
                break;
            case "E":
                this.location.setX(this.location.getX() + 1);
                break;
            case "W":
                this.location.setX(this.location.getX() - 1);
                break;
        }
    }

    Point getLocation() {
        return this.location;
    }

    public String getDirection() {
        return this.direction;
    }

    public static void main(String[] args) {
        Robot robot = new Robot();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Turn Left: L, Turn Right: R, Move: M, Quit: Q");
            String decision = input.nextLine();

            if (decision.equalsIgnoreCase("L")) {
                robot.turnLeft();
            } else if (decision.equalsIgnoreCase("R")) {
                robot.turnRight();
            } else if (decision.equalsIgnoreCase("M")) {
                robot.move();
            } else if (decision.equalsIgnoreCase("Q")) {
                break;
            } else {
                System.out.println("Invalid command.");
            }

            System.out.println("Current Position: (" + robot.getLocation().getX() + ", " + robot.getLocation().getY() + ")");
            System.out.println("Current Direction: " + robot.getDirection());
        }

        input.close();
    }
}
