package lesson4;
import java.util.Scanner;
public class isoscelesTriangle {
    public static String isTriagleIsosceles() {
        //getting the sides of triangle
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the A side of your triangle, please - ");
        double a = sc.nextDouble();
        System.out.println("Enter the B side of your triangle, please - ");
        double b = sc.nextDouble();
        System.out.println("Enter the C side of your triangle, please - ");
        double c = sc.nextDouble();

        //case when the sides aren't valid
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("All sides of your triangle should be more than 0");
        }

        //if the triangle is isosceles
        else if (a == b || b == c || c == a) {
            System.out.println("Your triangle is isosceles");
        }

        //if the triangle is not isosceles
        else {
            System.out.println("Your triangle is not isosceles");
        }
        return "BYE!";
    }

    public static void main(String[] args) {
        System.out.println(isTriagleIsosceles());
    }
}

