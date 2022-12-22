public class staticreturn {
    
    static int i=5; 
    static int add(int a, int b) {
        return a+b;
    }
    
    public static void main(String[] args) {
        // System.out.println(add(10,20));
        // System.out.println(i);

        staticreturn s = new staticreturn();
        staticreturn t = new staticreturn();

        System.out.println(add(10, 20));
        System.out.println("i = " +i);
     
        i=7; 
        System.out.println("i =" +i);

        System.out.println("s.i =" +s.i);
        s.i=7;
        System.out.println("s.i =" +s.i);
        System.out.println("t.i =" +t.i);
    }
    
}

