public class constructor {
    int catWeight; 
    String catName;

    constructor(int w, String n) {
        catWeight = w;
        catName = n;
        System.out.println(catWeight+" "+catName);
    }

    //default constructor - insert null values to the data
    // constructor() {

    // }

    constructor(int w) {
        catWeight = w;
        System.out.println(catWeight+" "+catName);
    }

    constructor() {
        System.out.println(catWeight+" "+catName);
    }

    // void display() {
    //     System.out.println(id+" "+name);
    // }

    public static void main(String[] args) {
        constructor s1 = new constructor(6, "Kongkang");
        constructor s2 = new constructor(4, "Jasmine");
        constructor s3 = new constructor();
        constructor s4 = new constructor(900);
    //     s1.display();
    //     s2.display();
    //     s3.display();
    }
}
