/*Create an Abstract class Processor with int member variable data  and method showData to display data value. 
Create abstract method process() to define processing of member data. Create a class  Factorial using abstract class Processor 
to calculate and print factorial of a number by overriding the process method. 
b. Create a class Circle using abstract class Processor to calculate and print area of a circle by overriding the process method.
Ask user to enter choice (factorial or circle area).  Also ask data to work upon. Use Processor class reference to achieve this 
mechanism.
*/
package Assignment3;

import java.util.Scanner;

abstract class Processor
{
    static int num;
    abstract void process();
    abstract void showData();   
}
class Factorial extends Processor 
{
    int fact=1;
    @Override
    void process()
    {       
        while(num>0)
        {
            fact=fact*num;
            num--; 
        }
    } 
    
    @Override
    void showData()
    {
        System.out.println("Factorial of a number is "+fact);
    } 
}
class Circle1 extends Processor
{
    double area=0;
    void process()
    {       
        area=3.14*num*num;
    } 
    
    void showData()
    {
        System.out.println("Area of a circle is "+area);
    } 
}
public class FactorialDemo {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        Processor.num=sc.nextInt();
        System.out.println("1. Factorial\n2. Area of circle");
        System.out.println("Enter your choice :");
        int ch=sc.nextInt();
        if(ch==1)
        {
            Factorial f1=new Factorial();
            f1.process();
            f1.showData();
        }
        else
        {
            Circle1 c1=new Circle1();
            c1.process();
            c1.showData();
        }
    }
}
