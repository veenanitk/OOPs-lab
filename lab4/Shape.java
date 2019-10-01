import java.io.*;
import java.util.Scanner;


    abstract class Shape{
        int l;
        int b;
        abstract void area();
    }
    class triangle extends Shape{
        void area(){
            System.out.println(" enter length of the  triangle ");
            Scanner s1 = new Scanner(System.in);
            l = s1.nextInt();
            System.out.println(" enter height of the triangle ");
            b = s1.nextInt();
            System.out.println("area  " + (l*b)/2); }
    }
    class rectangle extends Shape{
        void area(){
            System.out.println("enter length of the rectangle  ");
            Scanner s3 = new Scanner(System.in);
            l = s3.nextInt();
            System.out.println("enter breath of the rectangle  ");
            b = s3.nextInt();
            System.out.println("area   "  + (l*b)); }
    }
    class circle extends Shape{
        void area(){
            System.out.println("enter radius of the circle  ");
            Scanner s1 = new Scanner(System.in);
            l = s1.nextInt();
            System.out.println("area   "+ (3.14*l*l)); }
    }
class Main {
    public static void main(String[] args) {

        Shape a = new triangle();
        a.area();


        Shape b = new rectangle();
        b.area();


        Shape c = new circle();
        c.area();
    }
}

