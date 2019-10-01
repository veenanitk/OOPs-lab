import java.util.Scanner;

//interface pizza{
//     void cheese();
//     void chicken();
//     void mutton();
//     void special();
//
//}

public class pizzahut {
    pizzahut(){

    }

    void cal3(int y){
        int carbo=4;
        int protein=4;
        int fat=9;
        System.out.println("carbohydrates  "+carbo*y);
        System.out.println("proteins  "+protein*y);
        System.out.println("fat  "+fat*y);

    }

    public static void main(String[] args) {

        System.out.println("1. cheese_pizza");
        System.out.println("2. chicken_pizza");
        System.out.println("3. mutton_pizza");
        System.out.println("4. special_pizza");
        int totcharge=0;


        System.out.println("enter ur preferance 1. for eat in and" +
                " 2. for take off the order");
        int pre;
        Scanner b = new Scanner(System.in);
        pre = b.nextInt();

        int pre2;
        int no;
        Scanner c = new Scanner(System.in);
        if (pre == 1) {
            System.out.println("enter ur preferance 1. Ac and 2. for NONAC");

            pre2 = b.nextInt();


            System.out.println("enter the pizza no you want to order" +
                    " if doesnt want any then press -1");


            no = c.nextInt();

            while (no != -1) {


                if (pre2 == 1) {
                    AC ac = new AC();
                    if (no == 1) {

                        totcharge+=400;
                        ac.cheese();
                    } else if (no == 2) {

                        totcharge+=600;
                        ac.chicken();
                    } else if (no == 3) {
                        totcharge+=600;
                        ac.mutton();
                    } else if (no == 4) {
                        totcharge+=800;
                        ac.special();
                    } else {
                        System.out.println("Sorry pizza you have ordered is not in stock");
                    }
                } else if (pre2 == 2) {
                    //System.out.println("sorry sir mutton is not deliverable");
                    nonac non = new nonac();
                    if (no == 1) {

                        totcharge+=200;
                        non.cheese();
                    } else if (no == 2) {
                        totcharge+=400;

                        non.chicken();
                    } else if (no == 3) {
                        totcharge+=400;
                        non.mutton();
                    } else if (no == 4) {
                        totcharge+=600;
                        non.special();
                    } else {
                        System.out.println("Sorry pizza you have ordered is not in stock");
                    }

                }
                System.out.println("enter if you want to order more" +
                        " if doesnt want any then press -1");


                no = c.nextInt();
            }
            System.out.println("do u want any drinks");
            System.out.println("1. coke");
            System.out.println("2. lime juice");
            System.out.println("3. apple juice");
            System.out.println("4. mango juice");
            System.out.println("-1 for no drinks");
            drinks dr = new drinks();
            int y=dr.choice();
            totcharge+=y;

            System.out.println("do u want any salad");
            System.out.println("1. if u want salad");
            System.out.println("-1 for no salad");
            int g=dr.choice();
            totcharge+=g;

        } else if (pre == 2) {
            System.out.println("enter the pizza no you want to order" +
                    " if doesnt want any then press -1");


            no = c.nextInt();
            while (no != -1) {
                System.out.println("enter the pizza no you want to order");
                no = c.nextInt();
                delivery del = new delivery();
                if (no == 1) {
                    new restrau("pepper", "masala", "chilli", "sause");
                    del.cheese();
                    del.dele();
                } else if (no == 2) {
                    new restrau("pepper", "extra chicken", "chilli", "sause");
                    del.chicken();
                    del.dele();
                } else if (no == 3) {
                    System.out.println("sorry sir mutton pizza is not deliverable");
                } else if (no == 4) {
                    new restrau("pepper", "extra chicken", "chilli", "sause");
                    del.special();
                    del.dele();
                } else {
                    System.out.println("Sorry pizza you have ordered is not in stock");
                }

                System.out.println("enter if you want to order more pizza" +
                        " if doesnt want any then press -1");

                no = c.nextInt();
            }
            System.out.println("do u want any drinks");
            System.out.println("1. coke");
            System.out.println("2. lime juice");
            System.out.println("3. apple juice");
            System.out.println("4. mango juice");
            System.out.println("-1 for no drinks");
            drinks2 dr=new drinks2();
            int j=dr.choice();
            totcharge+=j;
        }
        System.out.println("total charge  "+totcharge);


    }

}
class restrau extends pizzahut {
    String ing1;
    String ing2;
    String ing3;
    String ing4;
    restrau(){

    }
    public restrau(String ing1,String ing2, String ing3, String ing4) {
        this.ing1=ing1;
        this.ing2=ing2;
        this.ing3=ing3;
        this.ing4=ing4;
    }

    int drink(int x){
        if(x==1){
            System.out.println("coke");
            System.out.println("price 50");
            return 50;
        }
        else if(x==2){
            System.out.println("lime juice");
            System.out.println("price 60");
            return 60;
        }
        else if(x==3){
            System.out.println("apple juice");
            System.out.println("price 70");
            return 70;
        }
        else if(x==4){
            System.out.println("mango juice");
            System.out.println("price 80");
            return 80;
        }
        return 0;

    }
    void cal(int y){
        int carbo=4;
        int protein=4;
        int fat=9;
        System.out.println("carbohydrates  "+carbo*y);
        System.out.println("proteins  "+protein*y);
        System.out.println("fat  "+fat*y);

    }


}
class drinks extends restrau{
    int choice;
    Scanner f=new Scanner(System.in);

    int choice() {
        choice = f.nextInt();
int y=0;
        if(choice!=-1)
         y=super.drink(choice);
        return y;
    }
}

class drinks2 extends delivery{
    int choice1;
    Scanner f1=new Scanner(System.in);

    int choice() {
        choice1 = f1.nextInt();
int y=0,l=0;
        if(choice1!=-1) {
            y=super.drink(choice1);
            l=super.dele1();
        }
        return (y+l);
    }
}

class AC extends restrau{

        void cheese(){

            System.out.println("cheese pizza");
            System.out.println("price  200");
            System.out.println("calories 20");
            System.out.println("offer  10%off");
            super.cal(20);
        }
        void chicken(){
            System.out.println("chicken pizza");
        System.out.println("price  400");
        System.out.println("calories 60");
        System.out.println("offer  10%off");
            super.cal(60);

    }
    void mutton(){
            System.out.println("mutton pizza");
        System.out.println("price  400");
        System.out.println("calories 60");
        System.out.println("offer  10%off");
        super.cal(60);

    }
    void special(){
            System.out.println("special pizza");
        System.out.println("price  600");
        System.out.println("calories 50");
        System.out.println("offer  10%off");
        super.cal(50);
    }
}



class nonac extends restrau{
    void cheese(){
        new restrau("pepper", "extra cheese", "chilli", "sause");
        System.out.println("cheese pizza");
        System.out.println("price  400");
        System.out.println("calories 20");
        System.out.println("no offer");
        super.cal(20);
    }
    void chicken(){
        new restrau("pepper", "extra chicken", "chilli", "sause");
        System.out.println("chicken pizza");
        System.out.println("price  600");
        System.out.println("calories 60");
        System.out.println("offer  10%off");
        super.cal(60);
    }
    void mutton(){
        new restrau("pepper", "extra mutton", "chilli", "sause");
        System.out.println("mutton pizza");
        System.out.println("price  600");
        System.out.println("calories 60");
        System.out.println("no offer");
        super.cal(60);
    }
    void special(){
        new restrau("pepper","sweet pepper","chilli","sause");
        System.out.println("special pizza");
        System.out.println("price  800");
        System.out.println("calories 50");
        System.out.println("offer  10%off");
        super.cal(50);
    }

}
class delivery extends pizzahut{

    void cheese(){
        System.out.println("cheese pizza");
        System.out.println("price  400");
        System.out.println("calories 20");
        System.out.println("no offer");
        super.cal3(20);
    }
    void chicken(){
        System.out.println("chicken pizza");
        System.out.println("price  600");
        System.out.println("calories 60");
        System.out.println("offer  10%off");
        super.cal3(60);

    }
    void special(){
        System.out.println("special pizza");
        System.out.println("price  800");
        System.out.println("calories 50");
        System.out.println("offer  10%off");
    super.cal3(50);
    }
    void dele(){
        System.out.println("delivery charges  50rs");
    }
    int dele1(){
        System.out.println("deleivery charges 10rs");
        return 10;
    }

    int drink(int x){
        if(x==1){
            System.out.println("coke");
            System.out.println("price 50");
            return 50;
        }
        else if(x==2){
            System.out.println("lime juice");
            System.out.println("price 60");
            return 60;
        }
        else if(x==3){
            System.out.println("apple juice");
            System.out.println("price 70");
            return 70;
        }
        else if(x==4){
            System.out.println("mango juice");
            System.out.println("price 80");
            return 80;
        }
        return 0;

    }

}