public class solid {

    static int volumeCube(int l) {
        return l*l*l; //formula for cube:
    }

    static int volumeSquarePrism(int l, int w) {
        return l*w*w; //formula for square prism
    }
    
    static int volumeRectangularPrism(int l, int w, int h) {
        return l*w*h; //formula for rectangular prism
    }
    
    public static void main(String[] args) {   
         
       System.out.println("Volume of cube: " +volumeCube(3));  
       System.out.println("Volume of square prism: " +volumeSquarePrism(3, 4));
       System.out.println("Volume of rectangular prism: " +volumeRectangularPrism(3, 4, 5));
    }   

}
