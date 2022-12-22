public class testthrow {
    
    public static void validate(int age) {
        //function to check if person is eligible to vote or note 
        if (age<18) {
            //throw ArithmeticException if not eligible to vote
            throw new ArithmeticException("Person is not eligible to vote");

        } else {

            System.out.println("Person is eligible to vote!");
        }
    }

    public static void getDetails (String name) {
        
        if (name.equals(null)) {
            System.out.println("Your name ");
        } else {
            System.out.println("Are you sure?");
        }
    }

    //main method 
    public static void main(String[] args) {
        
        //try {
            //calling the function 
            validate(17);
            System.out.println("...the rest of the code.");
        //} catch (ArithmeticException e) {
           // System.out.println(e);
        //}
        
        try {
            getDetails(null);
        } catch (NullPointerException e) {
            System.out.println("Throws NullPointerException   "+e);
        }
    }
}

  