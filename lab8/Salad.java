public class Salad {
    String saladname;
    String dressingName;
    double saladprice;
    double calorie;

    public Salad(String saladname, String dressingName, double saladprice, double calorie) {
        this.saladname = saladname;
        this.dressingName = dressingName;
        this.saladprice = saladprice;
        this.calorie = calorie;
    }

    public String getSaladname() {
        return saladname;
    }

    public String getDressingName() {
        return dressingName;
    }

    public double getSaladprice() {
        return saladprice;
    }

    public double getCalorie() {
        return calorie;
    }

    public void setSaladname(String saladname) {
        this.saladname = saladname;
    }

    public void setDressingName(String dressingName) {
        this.dressingName = dressingName;
    }

    public void setSaladprice(double saladprice) {
        this.saladprice = saladprice;
    }

    public void setCalorie(double calorie) {
        this.calorie = calorie;
    }
    void  saladcaloriecalc (int grams){
        calorie= 13*grams;

    }
    void displayitem(){

        System.out.println("SALD NAME "+saladname);
        System.out.println("SALAD DRESSING:"+dressingName);
        System.out.println("SALAD CALORIE:"+calorie);
        System.out.println("SALAD PRICE:"+saladprice);


    }
}
