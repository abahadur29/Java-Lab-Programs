abstract class Student {
    int rollNo;
    long regNo;

    abstract void course();

    void getInput(int rollNo, long regNo) 	{
        this.rollNo = rollNo;
        this.regNo = regNo;
    }
}

class Kiitian extends Student {
    void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }
}


public class Maink {
    public static void main(String[] args) {
        Kiitian kiitian = new Kiitian();
        kiitian.getInput(2205180, 1234567890);
        System.out.println("Rollno - " + kiitian.rollNo);
        System.out.println("Registration no - " + kiitian.regNo);
        kiitian.course();
    }
}
