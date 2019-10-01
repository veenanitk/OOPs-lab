import java.util.Scanner;
class SampleClass {
    int a;
    SampleClass(){
        System.out.println("Constructor called");
        a=-1;
    }
    SampleClass(int n){
        System.out.println("Constructor called with an integer parameter");
        a=n;
        System.out.println("Parameter value = " + a);
    }
    SampleClass(SampleClass s){
        System.out.println("Constructor called with object as a parameter");
        a=s.a ;
        System.out.println("Parameter value = " + a);
    }
}

public class Sample{
    public static void main(String args[]){
        SampleClass s1 = new SampleClass();
        System.out.println("Value of a= "+s1.a);
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt();
        SampleClass s2 = new SampleClass(n);
        SampleClass s3 = new SampleClass(s1);
    }
}
