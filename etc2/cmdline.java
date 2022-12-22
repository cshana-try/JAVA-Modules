public class cmdline {
    
    static int j;
    public static void main(String args[]) {
        
        for (int i = 0; i < args.length; i++) {

            System.out.println(args[i]);
        }

        j = Integer.parseInt(args[0]);
        j = j + 2;
        System.out.println(j);

    }
}
