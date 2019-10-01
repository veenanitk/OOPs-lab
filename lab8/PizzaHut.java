import java.util.Scanner;

public class PizzaHut {


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("SELECT THE ORDER TYPE: 1. DELIVERY 2.EAT IN ");
        int a = sc.nextInt();
        switch(a) {

            case 1: {
                double totalprice = 0, totalcalorie = 0;
                int itemcount = 0, drinkscount = 0, saladcount = 0;
                Item i[] = new Item[10];
                Drinks d[] = new Drinks[10];
                System.out.println("THANK YOU FOR CHOOSING DELIVERY. DELIVERY CHARGES ARE : 1. ITEM= rs.50 2. DRINKS = rs. 10 ");
                int finish = 0;
                int itemtyp;
                int pizzatype;
                int ingredienttype;
                int drinktype;
                while (finish == 0) {
                    System.out.println("SELECT THE ITEM type: 1.PIZZA 2. drinks 3. finish order ");
                    itemtyp = sc.nextInt();
                    switch (itemtyp) {

                        case 1: {
                            System.out.println("SELECT THE FIRST ITEM: 1.VEG PIZZA 2. NON VEG PIZZA 3. PANEER PIZZA ");
                            pizzatype = sc.nextInt();

                            if (pizzatype == 1) {

                                i[itemcount] = new Item("vegpizza", 100, 0, 100, 100, 0);
                                i[itemcount].caloriecalc();
                            } else if (pizzatype == 2) {

                                i[itemcount] = new Item("nonvegpizza", 120, 0, 150, 150, 0);
                                i[itemcount].caloriecalc();
                            } else if (pizzatype == 3) {

                                i[itemcount] = new Item("paneerpizza", 150, 0, 120, 120, 0);
                                i[itemcount].caloriecalc();
                            }

                            System.out.println("DO YO WANT EXTRA INGREDIENTS? SELECT CATEGORY AND THE AMOUNT : 1. CHEESE(20) 2. Topping(20)");
                            ingredienttype = sc.nextInt();
                            int ingredientno = sc.nextInt();
                            if (ingredienttype == 1) {
                                i[itemcount].ingredientType = "CHEESE";
                                i[itemcount].numberofingredients = ingredientno;
                                i[itemcount].itemprice = i[itemcount].itemprice + 20 * ingredientno;

                            }
                            if (ingredienttype == 1) {
                                i[itemcount].ingredientType = "TOPPING";
                                i[itemcount].numberofingredients = ingredientno;
                                i[itemcount].itemprice = i[itemcount].itemprice + 20 * ingredientno;

                            }

                            totalprice += i[itemcount].itemprice;
                            totalcalorie += i[itemcount].itemcalorie;
                            itemcount++;
                            break;
                        }
                        case 2: {
                            System.out.println("SELECT THE DRINK TYPE: 1.aerated 2.nonaerated");
                            drinktype = sc.nextInt();
                            if (drinktype == 1) {
                                d[drinkscount] = new Drinks("aerated", 100, "room", 0);
                                d[drinkscount].drinkscaloriecalc(100);
                            } else if (drinktype == 2) {
                                d[drinkscount] = new Drinks("nonaerated", 120, "room", 0);
                                d[drinkscount].drinkscaloriecalc(100);
                            }


                            totalcalorie += d[drinkscount].calorie;
                            totalprice += d[drinkscount].drinkprice;
                            drinkscount++;
                            break;
                        }
                        case 3:
                            finish = 1;
                    }
                }
                double delivery=itemcount * 50 + drinkscount * 10;
                totalprice += delivery;

                System.out.println("ORDER DETAILS\nDELIVERY");
                System.out.println();
                System.out.println("ITEMS: total number: " + itemcount);
                for(int ii =0;ii<itemcount;ii++)
                    i[ii].displayitem();
                System.out.println();
                System.out.println("DRINKS: total number: " + drinkscount);
                for(int ii =0;ii<drinkscount;ii++)
                    d[ii].displayitem();
                System.out.println();
                System.out.println("TOTAL PRICE:"+ totalprice);
                System.out.println("DELIVERY CHARGES:"+ delivery);
                System.out.println("TOTAL CALORIE:"+totalcalorie);



                break;
            }

            case 2: {
                double totalprice = 0, totalcalorie = 0;
                int itemcount = 0, drinkscount = 0, saladcount = 0;
                Item i[] = new Item[10];
                Drinks d[] = new Drinks[10];
                Salad s[] = new Salad[10];

                System.out.println("THANK YOU FOR CHOOSING EAT IN. AC CHARGES ARE: rs.100. ENTER 1 for AC");
                int ac = sc.nextInt();
                if (ac == 1) {
                    totalprice += 100;
                }
                int finish = 0;
                int itemtyp;
                int pizzatype;
                int ingredienttype;
                int drinktype;
                while (finish == 0) {
                    System.out.println("SELECT THE ITEM type: 1.PIZZA 2. drinks 3.SALAD 4. finish order ");
                    itemtyp = sc.nextInt();
                    switch (itemtyp) {

                        case 1: {
                            System.out.println("SELECT THE FIRST ITEM: 1.VEG PIZZA 2. NON VEG PIZZA 3. PANEER PIZZA ");
                            pizzatype = sc.nextInt();

                            if (pizzatype == 1) {

                                i[itemcount] = new Item("vegpizza", 100, 0, 100, 100, 0);
                                i[itemcount].caloriecalc();
                            } else if (pizzatype == 2) {

                                i[itemcount] = new Item("nonvegpizza", 120, 0, 150, 150, 0);
                                i[itemcount].caloriecalc();
                            } else if (pizzatype == 3) {

                                i[itemcount] = new Item("paneerpizza", 150, 0, 120, 120, 0);
                                i[itemcount].caloriecalc();
                            }

                            System.out.println("DO YO WANT EXTRA INGREDIENTS? SELECT CATEGORY AND THE AMOUNT : 1. CHEESE(20) 2. Topping(20)");
                            ingredienttype = sc.nextInt();
                            int ingredientno = sc.nextInt();
                            if (ingredienttype == 1) {
                                i[itemcount].ingredientType = "CHEESE";
                                i[itemcount].numberofingredients = ingredientno;
                                i[itemcount].itemprice = i[itemcount].itemprice + 20 * ingredientno;

                            }
                            if (ingredienttype == 1) {
                                i[itemcount].ingredientType = "TOPPING";
                                i[itemcount].numberofingredients = ingredientno;
                                i[itemcount].itemprice = i[itemcount].itemprice + 20 * ingredientno;

                            }

                            totalprice += i[itemcount].itemprice;
                            totalcalorie += i[itemcount].itemcalorie;
                            itemcount++;
                            break;
                        }
                        case 2: {
                            System.out.println("SELECT THE DRINK TYPE: 1.aerated 2.nonaerated");
                            drinktype = sc.nextInt();
                            if (drinktype == 1) {
                                System.out.println("PRESS 1. FOR COLD 2. ROOM");
                                int temp = sc.nextInt();
                                String temp1;
                                        if(temp==1){
                                            temp1="cold";
                                        }
                                        else
                                            temp1="room";
                                d[drinkscount] = new Drinks("aerated", 100, temp1, 0);
                                d[drinkscount].drinkscaloriecalc(100);
                            } else if (drinktype == 2) {
                                System.out.println("PRESS 1. FOR COLD 2. ROOM");
                                int temp = sc.nextInt();
                                String temp1;
                                if(temp==1){
                                    temp1="cold";
                                }
                                else
                                    temp1="room";
                                d[drinkscount] = new Drinks("nonaerated", 120, temp1, 0);
                                d[drinkscount].drinkscaloriecalc(100);
                            }


                            totalcalorie += d[drinkscount].calorie;
                            totalprice += d[drinkscount].drinkprice;
                            drinkscount++;
                            break;
                        }

                        case 3: {
                            System.out.println("SELECT SALAD: 1. CEASAR 2. JOSEPHIAN");
                            int saladtype = sc.nextInt();
                            if (saladtype == 1) {
                                s[saladcount] = new Salad("CEASAR", "EGG", 100, 0);
                                s[saladcount].saladcaloriecalc(100);

                            } else if (saladtype == 2) {
                                s[saladcount] = new Salad("JOSEPHIAN", "VEG", 120, 0);
                                s[saladcount].saladcaloriecalc(110);
                            }

                            totalcalorie += s[saladcount].calorie;
                            totalprice += s[saladcount].saladprice;
                            saladcount++;
                        }
                        case 4:
                            finish = 1;
                    }

                }
                System.out.println("ORDER DETAILS\n");
                System.out.println();
                System.out.println("ITEMS: total number: " + itemcount);
                for(int ii =0;ii<itemcount;ii++)
                    i[ii].displayitem();
                System.out.println();
                System.out.println("DRINKS: total number: " + drinkscount);
                for(int ii =0;ii<drinkscount;ii++)
                    d[ii].displayitem();
                System.out.println();
                System.out.println("SALADS: total number: " +saladcount);
                for(int ii =0;ii<saladcount;ii++)
                    s[ii].displayitem();
                System.out.println();

                System.out.println("TOTAL PRICE:"+ totalprice);
                if(ac==1){
                    System.out.println("AC CHARGES: 100");
                }
                System.out.println("TOTAL CALORIE:"+totalcalorie);
                break;
            }

        }



    }


}
