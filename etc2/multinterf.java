interface Printable {
    void print();
    int a = 10;
}

interface Showable {
    void show();
}

abstract class abcls {
    
    abstract void prnt();
    void nonprnt() {
        System.out.println("non abstract method");
    }
}

class abclts extends abcls {
    
    void prnt() {
        System.out.println("abstract method");
    }
}

class multinterf extends abcls implements Printable, Showable {

    public void print() {
        System.out.println("Helllo");
    }

    public void show() {
        System.out.println("Welcome");
    }

    public void prnt() {
        System.out.println("abstract method");
    }

    public void childshow() {
        System.out.println("child show");
    }

    public static void main(String[] args) {
        multinterf obj = new multinterf();
        abclts x = new abclts(); 
        
        obj.print();
        obj.show();
        obj.prnt();
        obj.childshow();
        x.prnt();
        x.nonprnt();

        System.out.println(a);
    
    }
}