import java.util.Scanner;


public class student {
    String name, course, admno;
    Scanner sc = new Scanner(System.in);

   void getDetails() {
        System.out.println("Enter admno");
        admno = sc.nextLine();
    
        System.out.println("Enter your name");
        name = sc.nextLine();
    
        System.out.println("Enter your course");
        course = sc.nextLine();

        System.out.println("Your name: " + name);
        System.out.println("Your admno: " + admno);
        System.out.println("Your course: " + course); 

    }
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student();
        student s3 = new student();


        s1.getDetails();
        System.out.println("");
        s2.getDetails();
        System.out.println("");
        s3.getDetails();
        
    }
}
