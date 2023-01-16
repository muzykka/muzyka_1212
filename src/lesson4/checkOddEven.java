package lesson4;
import java.util.Scanner;

public class checkOddEven {
     public static String checkOddEven() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number, please - ");
        int number = sc.nextInt();
        if (number == 0) {
            System.out.println ("Your number is zero");
        } else if ((number%2) > 0) {
            System.out.println (number + " is odd");
        }
        else {
            System.out.println (number + " is even");
        }
        return "BYE";
     }
    public static void main(String[] args) {
        System.out.println(checkOddEven());
    }
}

