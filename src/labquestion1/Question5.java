package labquestion1;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Date ");
        int date = sc.nextInt();
        System.out.println("Month ");
        int month = sc.nextInt();
        System.out.println("Year ");
        int year = sc.nextInt();
        int day = dayOfWeek(date, month, year);
        System.out.println(date + "th" + theMonth(month) + " " + year + " :" + theDay(day));
    }

    static int dayOfWeek(int d, int m, int y) {
        int t[] = {0, 3, 2, 5, 0, 3, 5, 1, 4, 6, 2, 4};
        y -= (m < 3) ? 1 : 0;
        return (y + y / 4 - y / 100 + y / 400 + t[m - 1] + d) % 7;
    }

    static String theDay(int day) {
        String[] dayNames = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thrusday", "Friday", "Staturday", "Sunday"};
        return dayNames[day];
    }

    static String theMonth(int month) {
        String[] monthNames = {"January", "Febuary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return monthNames[month - 1];
    }
}
