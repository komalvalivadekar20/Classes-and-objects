/*
Create a class MathOperation that has four static methods. add() method that takes two integer numbers as parameter and returns 
the sum of the numbers. subtract() method that takes two integer numbers as parameter and returns the difference of the numbers.
multiply() method that takes two integer numbers as parameter and returns the product. power() method that takes two integer 
numbers as parameter and returns the power of first number to second number. Create another class Demo (main class) that takes 
the two numbers from the user and calls all four methods of MathOperation class by providing entered numbers and prints the 
return values of every method.

*/
package Assignment3;
import java.util.Scanner;

class MathOperation1
{
    static int add(int a,int b)
    {
        int c=0;
        c=a+b;
        return c;
    }
    static int substract(int a,int b)
    {
        int c=0;
        c=a-b;
        return c;
    }
    static int multiply(int a,int b)
    {
        int c=0;
        c=a*b;
        return c;
    }
    static int power(int a,int b)
    {
        int c=0;
        c=(int) Math.pow(a,b);
        return c;
    }
}

public class Demo {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int fno=sc.nextInt();
        System.out.println("Enter second number");
        int sno=sc.nextInt();
        int add=MathOperation1.add(fno, sno);
        System.out.println("Addition : "+add);
        int sub=MathOperation1.substract(fno, sno);
        System.out.println("Substraction : "+sub);
        int mul=MathOperation1.multiply(fno, sno);
        System.out.println("Multiplication : "+mul);
        int pow=MathOperation1.power(fno, sno);
        System.out.println("Power : "+pow);
   
    }
}
