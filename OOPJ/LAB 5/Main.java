class Apple {
    void show() {
        System.out.println("This is the show method of Apple class");
    }
}

class Banana extends Apple {
    void show() {
        System.out.println("This is the show method of Banana class");
    }
}

class Cherry extends Apple {
    void show() {
        System.out.println("This is the show method of Cherry class");
    }
}

public class Main {
    public static void main(String[] args) {
        Apple a1 = new Apple();
        Banana a2 = new Banana();  // Modify the reference type to Banana
        Apple a3 = new Cherry();
        
        a1.show();
        a2.show();
        a3.show();
    }
}