import java.util.Scanner;

public class stack {

    static int top;
    static int s[];

    public stack(int n){
        top=-1;
        s= new int[n];
    }
    static void push(int size){
        if(top==size-1){
            System.out.println("stack is full");
        }
        else if(top==-1){
            System.out.print("enter the number");
            top++;
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            s[top]=n;
        }
        else
        {   System.out.print("enter number");
            top++;
            Scanner scan=new Scanner(System.in);
            int n=scan.nextInt();
            s[top]=n;
        }
    }
    static void pop()
    {
        if (top==-1)
        {
            System.out.println("stack is empty");
        }
//        else if(top>size-1)
//        {
//            System.out.println("stack is empty");
//
//        }
        else {
            int n=s[top--];
            System.out.print("poped no. is:   ");
            System.out.println(n);
        }
    }
    static void traverse(int size)
    {
        if(top==-1)
            System.out.println("stack is empty");
        else
        {    for (int i=top;i>-1;i--)
        {
            System.out.println(s[i]);
        }
        }
    }
    public static void main(String args[])
    {
        int ch,n1;
        System.out.println("enter size");
        Scanner scan = new Scanner(System.in);
        n1 = scan.nextInt();
        stack q=new stack(n1);
        System.out.println("enter 1 for push");
        System.out.println("2 for pop");
        System.out.println("3 for traversing");
        System.out.println("4 for exit");
        do{
            System.out.print("enter your choice:   ");
            ch= scan.nextInt();
            switch (ch){
                case 1:
                    q.push(n1);
                    break;
                case 2:
                    q.pop();
                    break;
                case 3:
                    q.traverse(n1);
                    break;
            }
        }while(ch!=4);
    }

}
