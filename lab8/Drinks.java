public class Drinks {

    String drinkname1;
    double drinkprice;
    String temp;
    double calorie;

    public Drinks(String drinkname1, double drinkprice, String temp, double calorie) {
        this.drinkname1 = drinkname;
        this.drinkprice = drinkprice;
        this.temp = temp;
        this.calorie = calorie;
    }

    public String getDrinkname() {
        return drinkname1;
    }

    public double getDrinkprice() {
        return drinkprice;
    }

    public String getTemp() {
        return temp;
    }

    public void setDrinkname(String drinkname1) {
        this.drinkname1 = drinkname1;
    }

    public void setDrinkprice(double drinkprice) {
        this.drinkprice = drinkprice;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }
    void drinkscaloriecalc(int grams){

        calorie = 13*grams;

    }
    void displayitem(){

        System.out.println("DRINK NAME:"+drinkname1);
        System.out.println("DRINK PRICE:"+drinkprice);
        System.out.println("DRIK CALORIE:"+calorie);
        System.out.println("DRINK TEMP:"+temp);


    }
}
