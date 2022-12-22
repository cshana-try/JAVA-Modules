class grandmep {
    float hike = 3000;

    void show() {
        System.out.println("text from grand");
    }
}

class employee extends grandmep {
    
    float salary = 40000;

}

class inheritprogrammer extends employee {
    
    void show() {
        System.out.println("text from programmer");
    }
    
    int bonus = 10000;

    public static void main(String[] args) {
        inheritprogrammer p = new inheritprogrammer();
        System.out.println("Programmer salary is: RM "+p.salary);
        System.out.println("Bonus of programmer is: RM "+p.bonus);
        p.show();
    }
}
