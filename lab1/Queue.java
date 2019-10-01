import java.util.Scanner;

public class Queue {
    static int f,r;
    static int q[];

    public Queue(int n){
        r=-1;
        f=-1;
        q= new int[n];
    }
    static void enq(int size){
        if(r==size-1){
        System.out.println("queue is full");
        }
        else if(r==-1){
        System.out.print("enter the number");
        r++;
        f++;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        q[r]=n;
        }
        else
        {   System.out.print("enter number");
            r++;
            Scanner scan=new Scanner(System.in);
            int n=scan.nextInt();
            q[r]=n;
        }
    }
    static void deq()
    {
        if (r==-1)
        {
            System.out.println("Queue is empty");
        }
        else if(r<f)
        {
            System.out.println("queue is empty");

        }
        else {
            int n=q[f];
            System.out.print("dequeued no. is:   ");
            System.out.println(n);
            f++;
        }
    }
    static void traverse()
    {
        if(f==r+1)
            System.out.println("queue is empty");
        else
        {    for (int i=f;i<=r;i++)
            {
                System.out.println(q[i]);
            }
        }
    }
    public static void main(String args[])
    {
        int ch,n1;
        System.out.println("enter size");
        Scanner scan = new Scanner(System.in);
        n1 = scan.nextInt();
        Queue q=new Queue(n1);
        System.out.println("enter 1 for enq");
        System.out.println("2 for deq");
        System.out.println("3 for traversing");
        System.out.println("4 for exit");
        do{
            System.out.print("enter your choice:   ");
            ch= scan.nextInt();
            switch (ch){
                case 1:
                    q.enq(n1);
                    break;
                case 2:
                    q.deq();
                    break;
                case 3:
                    q.traverse();
                    break;
            }
        }while(ch!=4);
    }

}