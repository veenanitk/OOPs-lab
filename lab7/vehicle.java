import java.util.Scanner;

public class vehicle {
    protected int regno;
    protected  int mileage;
    protected String color;
    protected String ownername;
    void insert(){
        Scanner a= new Scanner(System.in);
        regno=a.nextInt();
        mileage=a.nextInt();
        a.nextLine();
        color=a.nextLine();
        //a.nextLine();
        ownername=a.nextLine();
    }

    void showdata(){
        System.out.println(regno +"  "+mileage+"  "+color+" "+ownername);
        System.out.println("This is a vehicle class");
    }


    public static void main(String[] args){

        bus bus1=new bus();
        bus1.insert();
        bus1.display();

        car car1=new car();
        car1.insert();
        car1.display();
    }
}

class bus extends vehicle{
    int routeno;

    void insert(){
        super.insert();
        Scanner a= new Scanner(System.in);
        routeno=a.nextInt();
    }
    void display(){
        super.showdata();
        System.out.println("route number   "+routeno);
    }

}

class  car extends vehicle{

    String manuname;
    void insert(){
        super.insert();
        Scanner a= new Scanner(System.in);
        manuname=a.nextLine();
    }
    void display(){
        super.showdata();
        System.out.println("manufacturer name   "+manuname);
    }

}