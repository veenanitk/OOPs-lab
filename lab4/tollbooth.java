public class tollbooth {
    int veh;
    double amount;

    tollbooth() {
        veh = 0;
        amount = 0;
    }

    void payingvehicle() {
        veh++;
        amount = amount + 50;
    }

    void nonpayvehicles() {
        veh++;
    }

    void display() {
        System.out.println("total no. of vehicles  " + veh);
        System.out.println("total amount  " + amount);
    }


    public static void main(String[] args){
        System.out.println("called paying vehicle");
        tollbooth a = new tollbooth();
        a.payingvehicle();

        System.out.println("called nonpaying vehicle");
        a.nonpayvehicles();

        System.out.println("display");
        a.display();
    }
}


