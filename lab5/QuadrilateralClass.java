import java.util.Scanner;

class Quadrilateral{
    int x1,x2,x3,x4,y1,y2,y3,y4;
    void input(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter coordinates:");
        x1=scan.nextInt();
        y1=scan.nextInt();
        x2=scan.nextInt();
        y2=scan.nextInt();
        x3=scan.nextInt();
        y3=scan.nextInt();
        x4=scan.nextInt();
        y4=scan.nextInt();
    }
}
class Trapezoid extends Quadrilateral{
    void input(){
        super.input();
        if(y1!=y2 || y3!=y4){
            System.out.println("Enter proper coordinates");
            super.input();
        }
    }
    void find_area(){
        int temp=(x3-x4)+(x2-x1);
        int height=y4-y1;
        System.out.println("Area of trapaezoid: "+(temp*height)/2);
    }
}
class Parallelogram extends Quadrilateral{
    void input(){
        super.input();
        if(y1!=y2 || y3!=y4 || (x2-x1)!=(x3-x4) || (x4-x1)!=(x3-x2)){
            System.out.println("Enter proper coordinates");
            super.input();
        }
    }
    void find_area(){
        int base=(x3-x4);
        int height=y4-y1;
        System.out.println("Area of parallelogram: "+base*height);
    }
}
class Rectangle extends Quadrilateral{
    void input(){
        super.input();
        if(y1!=y2 || y3!=y4 || x4!=x1 ||x3!=x2 ){
            System.out.println("Enter proper coordinates");
            super.input();
        }
    }
    void find_area(){
        int base=(x3-x4);
        int height=y4-y1;
        System.out.println("Area of rectangle: "+base*height);
    }
}
class Square extends Quadrilateral{
    void input(){
        super.input();
        if(y1!=y2 || y3!=y4 || x4!=x1 ||x3!=x2 || (x2-x1)!=(x3-x4) || (x4-x1)!=(x3-x2) || (y4-y1)!=(x3-x4)){
            System.out.println("Enter proper coordinates");
            super.input();
        }
    }
    void find_area(){
        int side=(x3-x4);
        System.out.println("Area of square: "+side*side);
    }
}
public class QuadrilateralClass {
    public static void main(String args[]){
        System.out.println("Trapaezoid:");
        Trapezoid trapezoid=new Trapezoid();
        trapezoid.input();
        trapezoid.find_area();
        System.out.println("Parallelogram:");
        Parallelogram parallelogram=new Parallelogram();
        parallelogram.input();
        parallelogram.find_area();
        System.out.println("Recatngle:");
        Rectangle rectangle=new Rectangle();
        rectangle.input();
        rectangle.find_area();
        System.out.println("Square:");
        Square square=new Square();
        square.input();
        square.find_area();
    }
}