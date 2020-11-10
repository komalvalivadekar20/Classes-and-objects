/*Create a class OneBHK with instance variables roomArea, hallArea and price. Then create default constructor that initializes 
instance variables with some values and a parameterized constructor that takes values for all instance variables and stores them 
in instance variables. Now create a method named show()  to print OneBHK’s instance variable values.
Create another class TwoBHK which has (inherits) all the properties and behaviors of OneBHK and a new instance variable room2Area.
Then create default constructor to initialize all 4 instance variables and a parameterized constructor to take the values for 
initialization of all instance variables. Override show() method to print all data member information.
Write main method in another class (Say Demo) and store three TwoBHK flat’s information and print information using show method.
Also print total amount of all flats.*/
package Assignment3;

import java.util.Scanner;

class OneBHK
{
    double roomArea;
    double hallArea;
    double price=0;
    
    OneBHK()
    {
        roomArea=0.0;
        hallArea=0.0;
        price=0.0;
    }
    OneBHK(double roomArea,double hallArea,double price)
    {
        this();
        this.roomArea=roomArea;
        this.hallArea=hallArea;
        this.price=price;
    }
    void show()
    {
        System.out.println("Area of room1 :"+roomArea);
        System.out.println("Area of hall :"+hallArea);
        System.out.println("Price :"+price);
    }
}
class TwoBHK extends OneBHK
{
    double room2Area;
    TwoBHK()
    {
        super();
        room2Area=0.0;
    }
    TwoBHK(double room2Area,double roomArea,double hallArea,double price)
    {
        super(roomArea,hallArea,price);
        this.room2Area=room2Area;
    }
    void show()
    {
        System.out.println("Area of room2 :"+room2Area);
        super.show();
        System.out.println("--------------------------------");
        
    }
}
public class FlatDemo {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        TwoBHK b[]=new TwoBHK[3];
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter datails :");
            System.out.println("Enter area of room2 :");
            double room2Area=sc.nextDouble();
            System.out.println("Enter area of room1 :");
            double roomArea=sc.nextDouble();
            System.out.println("Enter area of hall :");
            double hallArea=sc.nextDouble();
            System.out.println("Enter price of flat");
            double price=sc.nextDouble();
            b[i]=new TwoBHK(room2Area,roomArea,hallArea,price);
        }
        for(int i=0;i<3;i++)
        {
            b[i].show();
        }
        double totalAmt=0;
        for(int i=0;i<3;i++)
        {
            totalAmt=totalAmt+b[i].price;
        }
        System.out.println("Total amount of all flats is "+totalAmt);
    }
}
