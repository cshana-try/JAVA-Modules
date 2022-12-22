public class exhandling {
    
    public static void main(String[] args) {
        
        try {
            
            System.out.println("Inside the try block");

            //below code throw zero exception
            int data = 25/2; //25/1; //25/2;
            System.out.println(data);
            //throw new ArithmeticException("Do not use 2 to divide");

        } catch (NullPointerException e) { //cannot handle ArithmeticException
                                           //can only accept NullPointerException
            System.out.println(e); 

        } finally { //executes regardless of exception occured or not
        
            System.out.println("finally block is always executed");

        }

        System.out.println("...rest of the code");
    }
}
