//This is the employee class
class Employee
{
    int id;
    double pay = 0.00;
    String status;

    //Default constructor
    //zero argument constructor
    Employee()
    {
        id = 0;
        pay = 0.00;
        status = " ";
    }

    //Parameterized constructor
    Employee(int i, double p)
    {
        id = i;
        pay = p;
    }

    //Entering the employee data
    public void insert (int i, double p)
    {
        id = i;
        pay = p;
    }

    public void display()
    {
        if(pay >= 50)
        {
            status= "High salary";;
        }
        else if(pay > 30 && pay < 50)
        {
            status= "Medium salary";
        }
        else if(pay < 30)
        {
            status= "Low salary";
        }

        System.out.println("ID: "+id+ " Salary: RM"+pay+ " Status: " +status);
    }

     // function for addition
    public static Employee add(Employee n1, Employee n2)
    {

    // creating blank complex number
    // to store result
    Employee res = new Employee(0, 0);

    // adding real parts of both complex numbers
    res.id = n1.id + n2.id;

    // adding imaginary parts
    res.pay = n1.pay + n2.pay;

    // returning result
    return res;
    }

    public void showC()
    {
        System.out.print(id + " : " + pay + "i");
    }
    
    class NestedClass {
        int y = 5;
    }
}

//This is the main class
class Main{
    
    public static void main(String args [])
    {
        //creating objects
        Employee emp1 = new Employee();           
        Employee emp2 = new Employee();        
        Employee emp3 = new Employee();        
        Employee emp4 = new Employee();        
        Employee emp5 = new Employee();        

        //calling the methods for inserting data
        emp1.insert(1, 20);
        emp2.insert(2, 40);
        emp3.insert(3, 50);
        emp4.insert(4, 70);
        emp5.insert(5, 10);

        //Addition of two complex numbers
        Employee emp6 = Employee.add(emp3, emp4);
        emp6.showC();
        
        //Employee emp6 = new Employee(2, 40);

        //calling the nested class
        // Employee.NestedClass nc = emp6.new NestedClass();
        // System.out.println(nc.y);

        //calling the display method 
        // emp1.display();
        // emp2.display();
        // emp3.display();
        // emp4.display();
        // emp5.display();
        // emp6.display();

        //create an exception
        // try{
        //     int a = 10;
        //     int b = 0;
        //     int c = a/b;
        //     System.out.println(c);
        // }
        // catch(Exception e){
        //     System.out.println("Error: "+e);
        // }
    }
}
