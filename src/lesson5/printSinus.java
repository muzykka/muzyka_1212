package lesson5;
import java.lang.Math;

class printSinus
{
    public static void main(String args[])
    {
        double x=0;
        for(int i=0; i<=360; i+=10)
        {
            x=Math.toRadians(i);
            System.out.println("sin("+i+")="+Math.sin(x));
        }
    }
}

