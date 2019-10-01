import java.util.Scanner;

public class Rectangle {
    double len, br; //variable for length, breadth and color
    String color;
    double area;

    void read() //function to enter values from keyboard/user
    {
        System.out.println("Enter Length and Width of Rectangle");
        Scanner s1 = new Scanner(System.in);
        len = s1.nextDouble();
        Scanner s2 = new Scanner(System.in);
        br = s2.nextDouble();
        System.out.println("Enter Color of Rectangle");
        Scanner s = new Scanner(System.in);
        color = s.nextLine();
    }

    void display(double area) {
        System.out.println("Length and Width of Rectangle : " + len + "," + br);
        System.out.println("Color of Rectangle  " + color);
        System.out.println("Area of Rectangle is  " + area);
    }

    double findArea() {
        area = len * br;
        return area;
    }

    String getColor() {
        return color;
    }

    public static void main(String[] args) {
        Rectangle r1, r2;
        r1 = new Rectangle();
        r2 = new Rectangle();
        System.out.println("     First Rectangle      ");
        r1.read();
        System.out.println("      Second Rectangle      ");
        r2.read();
        double a1 = r1.findArea();
        double a2 = r2.findArea();
        System.out.println("    First Rectangle     ");
        r1.display(a1);
        System.out.println("    Second Rectangle      ");
        r2.display(a2);

        String c1 = r1.getColor();
        String c2 = r2.getColor();
        if ((a1 == a2) && (c1.equalsIgnoreCase(c2)))
            System.out.println("Rectangles are matching");
        else
            System.out.println("Rectangles are not matching");
    }
}
