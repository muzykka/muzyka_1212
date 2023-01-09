package lesson4;
import java.util.Scanner;

public class monthOfYear {
    public static String printMonthInWord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month number from 1 to 12, please - ");
        int number = sc.nextInt();
        if (number < 0 || number > 12) {
            System.out.println ("Your month number is invalid. Please enter the number from 1 to 12");
        } else if (number == 1) {
            System.out.println("The name of your month is January");
        } else if (number == 2) {
            System.out.println("The name of your month is February");
        } else if (number == 3) {
            System.out.println("The name of your month is March");
        } else if (number == 4) {
            System.out.println("The name of your month is April");
        } else if (number == 5) {
            System.out.println("The name of your month is May");
        } else if (number == 6) {
            System.out.println("The name of your month is June");
        } else if (number == 7) {
            System.out.println("The name of your month is July");
        } else if (number == 8) {
            System.out.println("The name of your month is August");
        } else if (number == 9) {
            System.out.println("The name of your month is September");
        } else if (number == 10) {
            System.out.println("The name of your month is October");
        } else if (number == 11) {
            System.out.println("The name of your month is November");
        } else if (number == 12) {
            System.out.println("The name of your month is December");
        } else {
            System.out.println("Wov, how did you get this result? Please report us at contact@monthofyear.java. Thanks!");
        }
        return "BYE";
    }
    public static void main(String[] args) {
        System.out.println(printMonthInWord());
    }
}

