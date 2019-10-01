import java.util.Scanner;
class Info{
    String name,start,visit,date;
    void input(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter details:");
        name=scan.nextLine();
        start=scan.nextLine();
        visit=scan.nextLine();
        date=scan.nextLine();
    }
    void output(){
        System.out.println("Display details:");
        System.out.println("Name: "+name+" Start place: "+start+ " Visit place: "+visit+" Date: "+date);
    }
}
class Base{
    Info[] info;
    int n;
    Base(int m){
        n=m;
        info=new Info[n];
        System.out.println("Constructor");
    }
    void enter(){
        for(int i=0;i<n;i++){
            info[i]=new Info();
            info[i].input();
        }
    }
    void display(Info i){
        System.out.println("Display Base Class details:");
        i.output();
    }
}
class MoreInfo{
    int age;
    void input(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Age details:");
        age=scan.nextInt();
    }
    void output(){
        System.out.println("Display Age : "+age);
    }
}
class Derived extends Base{
    MoreInfo[] moreInfo;
    int n;
    Derived(int m){
        super(m);
        n=m;
        moreInfo=new MoreInfo[n];
    }
    void enter(){
        super.enter();
        for(int i=0;i<n;i++){
            moreInfo[i]=new MoreInfo();
            moreInfo[i].input();
        }
    }
    void display(){
        System.out.println("Display Derived Class Details:");
        //super.display();
        for(int i=0;i<n;i++){
            if(moreInfo[i].age<12){
                super.display(super.info[i]);
                moreInfo[i].output();
            }

        }
    }
}
public class Travel {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n;
        System.out.println("Enter no. of passengers: ");
        n=scan.nextInt();

        Derived derived=new Derived(n);
        derived.enter();
        derived.display();
    }
}
