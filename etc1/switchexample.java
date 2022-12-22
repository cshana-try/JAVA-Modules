public class switchexample {
    
    public static void main(String[] args) {
        
        //int number = 20;
        //String number = "twenty";
        int number = 25;

        switch (number) {
            case 10: System.out.println("ten"); 
            //case ten: System.out.println("10"); 
            break;
            
            case 20: System.out.println("twenty");
            //case twenty: System.out.println("20"); 
            break;

            case 30: System.out.println("thirty");
            //case thirty: System.out.println("30"); 
            break;

            default: System.out.println("Not in 10, 20, and 30.");
            //default: System.out.println("Not in ten, twenty, and thirty.");
        }
    }
}
