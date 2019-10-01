interface turning {
     void turn() ;

}
public class turner{

    public static void main(String[] args){

        leaf l=new leaf();
        l.turn();
        page p=new page();
        p.turn();
        pancake pan=new pancake();
        pan.turn();
        pancake1 p1=new pancake1();
        p1.turn();
        pancake2 pan2=new pancake2();
        pan2.turn();
    }

}

class leaf implements turning{
    @Override
    public void turn(){
        System.out.println("Changing color");

    }

}

class page implements turning{

    @Override
    public void turn(){
        System.out.println( "Going to the next page");

    }

}

class pancake implements turning{

    @Override
    public void turn(){
        System.out.println( "Flipping");

    }
}

class pancake1 implements turning{

    @Override
    public void turn(){
        System.out.println( "Fourth");

    }
}

class pancake2 implements turning{

    @Override
    public void turn(){
        System.out.println( "Fifth");

    }
}