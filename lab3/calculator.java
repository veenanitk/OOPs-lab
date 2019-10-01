
import java.util.Scanner;

public class calculator {

    public static void main(String[] agrs) {

        int n1;
        int n2;
        System.out.println("enter 1st number ");
        Scanner s = new Scanner(System.in);
        n1 = s.nextInt();
        System.out.println("enter operartor ");

        Scanner s2 = new Scanner(System.in);
        char op = s2.next().charAt(0);
        System.out.println("enter 2nd number ");
        Scanner s1 = new Scanner(System.in);
        n2 = s1.nextInt();
        if(n2==0){
            System.out.println("error");
        }
        else {
            int result = 0;
            switch (op) {
                case '+':
                    result = n1 + n2;
                    System.out.println("result = " + result);
                    break;

                case '*':
                    result = n1 * n2;
                    System.out.println("result = " + result);
                    break;
                case '/':
                    result = n1 / n2;
                    System.out.println("result = " + result);
                    break;
                case '-':
                    result = n1 - n2;
                    System.out.println("result = " + result);
                    break;
                default:
                    System.out.print("error");

            }
        }

    }
}
