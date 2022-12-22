class Complex 
{
    int real;
    int imaginary;
    public void init(int real, int imaginary) 
    {
        this.real = real;
        this.imaginary = imaginary;
    }
    public void print()
    {
        System.out.print(this.real + "+" + this.imaginary + "i");
    }
}

public class ComplexOperationAnsif 
{
    public static void compare(Complex a, Complex b) 
    {
        if(a.real > b.real) 
        {
            a.print();
            System.out.println(" is greater.");
        } 
        else if (a.real == b.real) 
        {
            if(a.imaginary > b.imaginary) 
            {
                a.print();
                System.out.println(" is greater.");
            } 
            else 
            {
                b.print();
                System.out.println(" is greater.");
            }
        } 
        else 
        {
            b.print();
            System.out.println(" is greater.");
        }
    }

    public static Complex add(Complex a, Complex b) 
    {
        Complex c=new Complex();
        c.real = a.real + b.real;
        c.imaginary = a.imaginary + b.imaginary;
        return c;
    }

    public static Complex diff(Complex a, Complex b) 
    {
        Complex c=new Complex();
        c.real = a.real - b.real;
        c.imaginary = a.imaginary - b.imaginary;
        return c;
    }

    
    public static void main(String args[]) 
    {
        Complex a=new Complex(); Complex b=new Complex();
        a.init(10, 1);
        b.init(5, -6);
        System.out.println("the imaginary numbers are: ");
        a.print();
        System.out.print(" ");
        b.print();
        System.out.println("");
        compare(a,b);
        Complex c = add(a,b);
        c.print();
        System.out.println(" is the sum");
        Complex d = diff(a,b);
        d.print();
        System.out.println(" is the difference");

    }
}