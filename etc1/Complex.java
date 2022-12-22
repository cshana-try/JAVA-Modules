public class Complex {
    int real; 
    int imaginary; 
    
    public void init(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary; 
    }
    
    public void print() {
        System.out.println(this.real + "+" + this.imaginary + "i");
    }
}


