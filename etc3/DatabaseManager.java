public class DatabaseManager {

    public static void validate(int age) {
        if (age<18) {
            throw new ArithmeticException("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void validate2(String id) {
        
        if (id.equals("gfg")) {
            System.out.print("Same");
        } else {
            System.out.print("Not Same");
        }
    }
    public static void main(String args[]) {
        
        validate(18);
        System.out.println("Rest of the code");

        try {
            validate2(null);
        } catch(NullPointerException e) {
            System.out.println(e);
        }
    }
}



