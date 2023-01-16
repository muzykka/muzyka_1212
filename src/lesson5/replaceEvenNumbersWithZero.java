import java.util.Scanner;

public class replaceEvenNumbersWithZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array - ");
        int length = scanner.nextInt();
        int[] generatedArray = new int[length];
        for (int i = 0; i < generatedArray.length; i++) {
            generatedArray[i] = (int) (Math.random() * 100);
        }
        System.out.println("The original generated array is: ");
        for (int i = 0; i < generatedArray.length; i++) {
            System.out.print(generatedArray[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < generatedArray.length; i++) {
            if (generatedArray[i] % 2 == 0) {
                generatedArray[i] = 0;
            }
        }
        System.out.println("The array after replacing even numbers with 0 is: ");
        for (int i = 0; i < generatedArray.length; i++) {
            System.out.print(generatedArray[i] + " ");
        }
    }
}