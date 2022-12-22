public class loops {
    public static void main(String[] args) {
        int i, j;
        //for loop
        //incorporate the break and continue
        for(i = 1; i <= 10; i++) {
            
            if (i == 3) {
                continue;
            }
            System.out.println("i = "+i);
        }
        System.out.println();

        i = 1;
        
        //while loop
        while (i <= 5) {
            
            if (i == 3) {
                break;
            }
            System.out.println("i = "+i);
            i++;
        }

        System.out.println();

        i = 11;

        //do while loop
        do {
            System.out.println("i = "+i);
            i++;
        } while (i <= 10);

        //nested loops: outer, inner
        outer:
        for (i = 0; i < 5; i++) {
            
            inner:
            for (j = 0; j < 11; j++) {
                System.out.println(j);
                if (j == 9) {
                    break outer;
                }
            }
            System.out.println();
        }
    }

}


