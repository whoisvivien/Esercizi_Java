//2A. Intro Java SLIDE 10

import java.util.Scanner;

public class DrlowOlleh {
    private static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int foo = 0, bar = 0;

        Scanner keyboard = new Scanner(System.in);
        foo = keyboard.nextInt();
        bar = keyboard.nextInt();
        keyboard.close();

        System.out.println(sum(foo, bar));
    }
}
