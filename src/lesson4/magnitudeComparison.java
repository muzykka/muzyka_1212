package lesson4;
import java.util.Scanner;
public class magnitudeComparison {
    public static String compareTwoNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your first number - ");
        double firstNumber = sc.nextDouble();
        firstNumber = Math.abs(firstNumber);
        System.out.print("Please enter your second number - ");
        double secondNumber = sc.nextDouble();
        secondNumber = Math.abs(secondNumber);
        if (firstNumber > secondNumber) {
            System.out.println("First number has a magnitude of " + firstNumber + "\\n" +
                    ", which is greater than the second number's magnitude");
        } else if (firstNumber < secondNumber) {
            System.out.println("Second number has a magnitude of " + secondNumber + "\\n" +
                    ", which is greater than the first number's magnitude");
        } else {
            System.out.println("Both numbers have the same magnitude of " + firstNumber);
        }
        return "BYE!";
    }
    public static void main(String[] args) {
        System.out.println(compareTwoNumbers());
    }
}

