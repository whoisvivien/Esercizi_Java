//2A. Intro Java SLIDE 23

import java.util.Scanner;

public class StdinStdout {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.print("Hello," + " " + "World!\n");

        Scanner in = new Scanner(System.in);
        System.out.print("Please, insert a number: ");
        int foo = in.nextInt();
        System.out.println("Your number is " + foo);
    }
}
