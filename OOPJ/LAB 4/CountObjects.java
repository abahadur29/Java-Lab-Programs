public class CountObjects {
    private static int count;  // Static variable to count objects

    public CountObjects() {  // Constructor
        count++;
    }

    public static void main(String[] args) {
        CountObjects obj1 = new CountObjects();  // Create objects
        CountObjects obj2 = new CountObjects();
        CountObjects obj3 = new CountObjects();

        System.out.println("Total number of objects created: " + count);
    }
}
