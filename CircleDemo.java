/*
Create a class Circle that has two data members,one to store the radius and another to store area and three methods first init() method 
to input radius from user, second calculateArea() method to calculate area of circleand third display() method to display values of radius and area.
Create class CircleDemo ( main class) that creates the Circle object and calls init(), calculateArea() and display() methods.
*/
package Assignment3;
import java.util.Scanner;

class Circle
{
    int radius;
    double area;
    
    void init()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius :");
        radius=sc.nextInt();
    }
    void calculateArea()
    {
        area=3.14*radius*radius;
    }
    void display()
    {
        System.out.println("Radius :"+radius);
        System.out.println("Area :"+area);
    }
}

public class CircleDemo {
    public static void main(String args[])
    {
        Circle cl=new Circle();
        cl.init();
        cl.calculateArea();
        cl.display();
    }
}
