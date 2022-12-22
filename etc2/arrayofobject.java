class Game {
        
    int game_Id;
    String game_title;
        
    Game (int gid, String n) {
        
        game_Id = gid;
        game_title = n;
        
    }
    
    public void display() {
            
        System.out.println("#"+game_Id + " " +" Title: "+game_title);
        System.out.println();
    
    }
}

public class arrayofobject {
    public static void main(String[] args) {
        
        int[] a = new int[5]; //declaration and instatiation
        a[0] = 10; 
        a[1] = 20; 
        a[2] = 70; 
        a[3] = 40; 
        a[4] = 50;

        //printing array 
        for (int i=0; i<a.length; i++) { //length is the property of array

            System.out.println(a[i]);

        }

        System.out.println();
        System.out.println();
        System.out.println();

        //create an array of product object 
        Game obj[] = new Game[5];

        //create and initialize actual product object using constructor 
        obj[0] = new Game (23907,"God of War: Ragnarok");
        obj[1] = new Game (91240,"Detroit Become Human");
        obj[2] = new Game (29823,"Call Of Duty: Black Ops");
        obj[3] = new Game (11908,"Phasmophobia");
        obj[4] = new Game (43590,"Final Fantasy XIV");

        //display the product object data 
        System.out.println("1\\ ");
        obj[0].display();
        System.out.println("2\\ ");
        obj[1].display();
        System.out.println("3\\ ");
        obj[2].display();
        System.out.println("4\\ ");
        obj[3].display();
        System.out.println("5\\ ");
        obj[4].display();
    }
}