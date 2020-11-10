/*
Create a class Employee with three data members (empNo, salary and totalSalary) and following features.
Only parameterized constructor. [Do not overload the constructor]
totalSalary always represents salary total of all the employees created.
empNo should be auto incremented.
display total employees and totalSalary using a method.
Create another class EmployeeDemo (main class) that creates some Employee objects and calls Employee method to display
no. of employees and total of their salaries.
 */
package Assignment3;
class Employee
{
    static int empNo=0;
    int salary;
    static int totalSalary=0;
    
    Employee(int salary)
    {        
        this.salary=salary;
        empNo++;
        totalSalary+=salary;
    }
    
    static void display()
    {
        System.out.println("Total Employees :"+empNo);
        System.out.println("Total Salary :"+totalSalary);
    }
    
}
public class EmployeeDemo {
    public static void main(String args[])
    {
        Employee emp1=new Employee(1000);
        Employee emp2=new Employee(2000);
        Employee emp3=new Employee(5000);
        Employee emp4=new Employee(2000);
        Employee emp5=new Employee(10000);
        Employee.display();
    }
}
