import java.util.Scanner;

class Plate {
    double length;
    double width;

    Plate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length and width for Plate:");
        length = scanner.nextDouble();
        width = scanner.nextDouble();
    }
}

class Box extends Plate {
    double height;

    Box() {
        super(); // Call the constructor of the base class (Plate)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter height for Box:");
        height = scanner.nextDouble();
    }
}

class WoodBox extends Box {
    double thickness;

    WoodBox() {
        super(); // Call the constructor of the base class (Box)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter thickness for Wood Box:");
        thickness = scanner.nextDouble();
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        WoodBox woodBox = new WoodBox();
        System.out.println("Dimensions: " + woodBox.length + " x " + woodBox.width + " x " + woodBox.height + " x " + woodBox.thickness);
    }
}
