package lesson5;

public class arithmeticalMeanOfArrayCalculator {
    public static void main(String[] args) {
        int[] generatedArray = generateArray();
        System.out.println("The generated array is: ");
        for (int i = 0; i < generatedArray.length; i++) {
            System.out.print(generatedArray[i] + " ");
        }
        System.out.println();
        double sum = 0;
        for (int i = 0; i < generatedArray.length; i++) {
            sum += generatedArray[i];
        }
        System.out.println("Your array's sum is " + sum);
        double arithmeticalMean = sum/generatedArray.length;
        System.out.println("Your array elements' arithmetical mean is " + arithmeticalMean);
        }
    public static int[] generateArray()
    {
        int[] generatedArray = new int[10];
        for (int i=0; i<generatedArray.length; i++)
        {
            generatedArray[i] = (int) (Math.random()*100);
        }
        return generatedArray;
    }
}
