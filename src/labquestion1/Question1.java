package labquestion1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextInt();
        double s = 0.0;
        for (double i = 1; i <= n; i++) {
            s = s + 1 / i;

        }
        System.out.println(s);


    }
}
