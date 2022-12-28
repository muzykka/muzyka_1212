package lesson2;
import java.util.*;

public class Rectangular_area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the first side in centimetres, please - ");
        float side1 = sc.nextFloat();
        System.out.print("Enter the length of the second side in centimetres, please - ");
        float side2 = sc.nextFloat();
        float area = (side1 * side2) / 2;
        System.out.println("Area of your rectangular triangle is " + area + " square centimetres");
        System.out.println("Thanks for using our program!");
    }
}
