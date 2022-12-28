package lesson2;

import java.util.*;
public class Temperature_conversion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius, please - ");
        float Celsius = sc.nextFloat();
        System.out.println("So, your temperature in Celsius is " + Celsius);
        float Fahrenheit = (float) (Celsius * 1.8 + 32);
        System.out.println("By Fahrenheit scale it is " + Fahrenheit);
        float Kelvin = (float) (Celsius + 273.15);
        System.out.println("In Kelvins it is " + Kelvin);
        System.out.println("Thanks for using our program!");
    }
}