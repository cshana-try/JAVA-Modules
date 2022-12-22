class A {
    // private int data = 40;
    // private void msg() {

    //     System.out.println("Hello Java");
    // }
    
    // A() {
    //     System.out.println(data);
    //     msg();
    // }

    private String name, course, admno;
    Scanner sc = new Scanner(System.in); 

    private void display() {
    
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter course: ");
        course = sc.nextLine();
        System.out.println("Enter admno: ");
        admno = sc.nextLine();
        
        System.out.println("ID: "+admno +" Name: "+name +" Course: "+course);
    
    }
    
    A() {
        s1.display();
        System.out.println("");
        s2.display();
        System.out.println("");
        s3.display();
    }
}

public class accessmod {
    
    public static void main(String[] args) {
        // A obj = new A();
        // System.out.println(obj.data); //compile data error
        // obj.msg(); //Compile time
        student s1 = new student();
        student s2 = new student();
        student s3 = new student();

        
    }
    
}
