public class starpatternloop {

    /*Star Pattern 1

    * 

    * * 

    * * * 

    * * * * 

    * * * * *   */
    public static void main(String[] args) {

        // int line = 10; //number of line want to print

        // for (int i = 1; i <= line; ++i) {  //Outer loop for line

        //     for (int j = 1; j <= i; ++j) { //Inner loop for Col

        //     System.out.print("* "); //Print *

        //     }

        // System.out.println(); //New line

        // }
        

        /*Star Pattern 2

        * * * * * 

        * * * * 

        * * * 

        * * 

        *   */

        int line = 10;

        for(int i = line; i >= 1; --i) {  //For Loop for line 

            for(int j = 1; j <= i; ++j) { //For Loop for Col

                System.out.print("* "); //Prints *

            }

            System.out.println(); //Get to new line

        }
    }

}





