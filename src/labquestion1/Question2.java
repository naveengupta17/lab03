package labquestion1;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = scanner.nextDouble();
        int rupee = 0;
        int paise = 0;
        rupee = (int) price;
        price = price * 100;
        paise = (int) price % 100;
        System.out.println(rupee + " Rupees and " + paise + "paise");

    }


}


