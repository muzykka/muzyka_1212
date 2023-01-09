package lesson4;
import java.util.Scanner;

public class monthOfYearSwitchCase {
    public static String printMonthInWord() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month number from 1 to 12, please - ");
        int month = sc.nextInt();
        switch (month) {
            case 1:
                System.out.println("The name of your month is January");
                break;
            case 2:
                System.out.println("The name of your month is February");
                break;
            case 3:
                System.out.println("The name of your month is March");
                break;
            case 4:
                System.out.println("The name of your month is April");
                break;
            case 5:
                System.out.println("The name of your month is May");
                break;
            case 6:
                System.out.println("The name of your month is June");
                break;
            case 7:
                System.out.println("The name of your month is July");
                break;
            case 8:
                System.out.println("The name of your month is August");
                break;
            case 9:
                System.out.println("The name of your month is September");
                break;
            case 10:
                System.out.println("The name of your month is October");
                break;
            case 11:
                System.out.println("The name of your month is November");
                break;
            case 12:
                System.out.println("The name of your month is December");
                break;
            default:
                System.out.println("Your month number is invalid. Please enter the number from 1 to 12");
        }
        return "BYE";
    }
    public static void main(String[] args) {
        System.out.println(printMonthInWord());
    }
}