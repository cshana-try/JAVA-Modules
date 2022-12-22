class A {
    private int data = 40;
    private void msg() {

        System.out.println("Hello Java");
    }
    
    A() {
        System.out.println(data);
        msg();
    }
}

public class accessmod {
    
    public static void main(String[] args) {
        A obj = new A();
        // System.out.println(obj.data); //compile data error
        // obj.msg(); //Compile time
        
    }
    
}
