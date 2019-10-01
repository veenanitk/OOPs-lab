public class Item {

    String itemname;
    int grams;
    double itemcalorie;
    double itemprice;
    double itemcomboprice;
    int numberofingredients;
    String ingredientType;



    public Item(String itemname, int grams,double itemcalorie, double itemprice, double itemcomboprice, int numberofingredients) {
        this.itemname = itemname;
        this.grams = grams;
        this.itemcalorie = itemcalorie;
        this.itemprice = itemprice;
        this.itemcomboprice = itemcomboprice;
        this.numberofingredients = numberofingredients;
    }

    public String getItemname() {
        return itemname;
    }

    public double getItemcalorie() {
        return itemcalorie;
    }

    public double getItemcomboprice() {
        return itemcomboprice;
    }

    public double getItemprice() {
        return itemprice;
    }

    public void setItemprice(double itemprice) {
        this.itemprice = itemprice;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public void setItemcomboprice(double itemcomboprice) {
        this.itemcomboprice = itemcomboprice;
    }

    public void setItemcalorie(double itemcalorie) {
        this.itemcalorie = itemcalorie;
    }

    public int getNumberofingredients() {
        return numberofingredients;
    }

    public void setNumberofingredients(int numberofingredients) {
        this.numberofingredients = numberofingredients;
    }

    void caloriecalc(){

        itemcalorie = 13*grams;

    }

    void displayitem(){

        System.out.println("ITEM NAME:"+itemname);
        System.out.println("ITEM PRICE:"+itemprice);
        System.out.println("ITEM CALORIE:"+itemcalorie);
        System.out.println("ITEM COMBO PRICE:"+itemcomboprice);
        System.out.println("NUMBER OF INGREDIENTS:"+numberofingredients);
        System.out.println("INGREDIENT NAME:"+ingredientType);

    }

}
