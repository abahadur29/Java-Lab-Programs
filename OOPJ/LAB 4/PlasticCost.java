import java.util.*;

class TwoD {
    double length;
    double width;

    TwoD() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and width for 2D sheet:");
        length = sc.nextDouble();
        width = sc.nextDouble();
    }
}

class ThreeD extends TwoD {
    double height;

    ThreeD() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height for 3D box:");
        height = sc.nextDouble();
    }

    double calculateCost() {
        double costSheet = length * width * 40; // Rs 40/ per square ft.
        double costBox = length * width * height * 60; // Rs 60/ per cubic ft.
        return costSheet + costBox;
    }
}

public class PlasticCost {
    public static void main(String[] args) {
        ThreeD plastic = new ThreeD();
        double totalCost = plastic.calculateCost();
        System.out.println("Total cost of plastic: Rs " + totalCost);
    }
}
