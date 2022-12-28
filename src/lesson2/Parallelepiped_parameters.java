package lesson2;
import java.util.Scanner;
public class Parallelepiped_parameters {
           public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the LENGTH of the parallelepiped in centimetres, please - ");
            float length = sc.nextFloat();
            System.out.print("Enter the WIDTH of the parallelepiped in centimetres, please - ");
            float width = sc.nextFloat();
            System.out.print("Enter the HEIGHT of the parallelepiped in centimetres, please - ");
            float height = sc.nextFloat();
            float volume = length * width * height;
            System.out.println("The volume of your parallelepiped is " + volume + " cubic centimetres");
            float total_length = length + width + height;
            System.out.println("The total length of your parallelepiped's sides is " + total_length + " centimetres");
            System.out.println("Thanks for using our program!");
        }
    }