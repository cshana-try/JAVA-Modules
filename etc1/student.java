import java.util.Scanner;

public class student {
    String name, course, admno;
    Scanner sc = new Scanner(System.in);

    void display() {
    
            System.out.println("Enter name: ");
            name = sc.nextLine();
            System.out.println("Enter course: ");
            course = sc.nextLine();
            System.out.println("Enter admno: ");
            admno = sc.nextLine();
            
            System.out.println("ID: "+admno +" Name: "+name +" Course: "+course);
        
    }

    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student();
        student s3 = new student();

        s1.display();
        System.out.println("");
        s2.display();
        System.out.println("");
        s3.display();
        
        
    }
}


