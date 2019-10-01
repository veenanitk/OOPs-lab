import java.util.Scanner;

class Employee{
    String name,desig;
    int sal;
    void input(){
        Scanner scan =new Scanner(System.in);
        System.out.println("Employee details:");
        name=scan.nextLine();
        desig=scan.nextLine();
        //String temp=scan.nextLine();
        sal=scan.nextInt();
    }
}
class Manager extends Employee{
    String dep;
    void input(){
        super.input();
        Scanner scan =new Scanner(System.in);
        System.out.println("Manager details:");
        dep=scan.nextLine();
    }
    void print(){
        System.out.println("Manager details:");
        System.out.println("Name: "+name+" : Dep: "+dep+" : Sal: "+sal);
    }
}
class Executive extends Manager{
    void input(){
        System.out.println("Enter Executive details:");
        super.input();
    }
    void print(){
        System.out.println("Executive");
        super.print();
    }
}
public class Office {
    public static void main(String args[]){
        Executive executive=new Executive();
        executive.input();
        executive.print();
    }
}
