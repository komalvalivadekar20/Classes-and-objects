/*
 Create class Product with three data members (pid, price, quantity) and parameterized constructor that takes values 
for all three data members.  
Create a main method in different class (say ProductDemo) and perform following task:
a. Accept information for five Product objects from user and store objects in an array
b. Find pid of product with highest price. 
c. Create a static method (with array of product’s object as argument) in Product class to calculate and return total amount 
spent on all products. ( amount spent on single product = price of product * quantity of product ).
 */
package Assignment3;

import java.util.Scanner;

class Product
{
    int pid;
    int price;
    int qty;
    static int total=0;
    
    Product(int pid,int price,int qty)
    {
        this.pid=pid;
        this.price=price;
        this.qty=qty;
    }
    static void totalAmtDisplay(int price,int qty)
    {
        total=total+(price*qty);
    }
}
public class ProductDemo {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter five product details :");
        Product pr[]=new Product[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("*** "+(i+1)+" product ***");
            System.out.println("Enter product id :");
            int pid=sc.nextInt();
            System.out.println("Enter price :");
            int price=sc.nextInt();
            System.out.println("Enter quantity :");
            int qty=sc.nextInt();
            pr[i]=new Product(pid,price,qty);
        }
        int max=pr[0].price;
        for(int i=0;i<5;i++)
        {
            if(pr[i].price>max)
            {
                max=pr[i].price;
            }
        }
        for(int i=0;i<5;i++)
        {
            if(max==pr[i].price)
            {
                System.out.println("Highest price product deatils :");
                System.out.println("Product Id :"+pr[i].pid+" Price :"+pr[i].price);
            }
        }
        for(int i=0;i<5;i++)
        {
            Product.totalAmtDisplay(pr[i].price,pr[i].qty);
        }
        System.out.println("Total amount spent on all product is :"+Product.total);
    }
}
