import java.io.*;
import java.util.Scanner;

class student1 {
    String name;
    int rollno;
    String department;
    float cgpa;
    int salary;
    String email;
    int dob;
    public student1(String name1,int rollno1,String department1,float cgpa1,int salary1,String email1,int dob1)
    {

        name=name1;
        rollno=rollno1;
        department=department1;
        cgpa=cgpa1;
        salary=salary1;
        email=email1;
        dob=dob1;
    }
}

public class Student {
    public static void main(String[] args) {
        int n;
        int s;
        int r;
        float cgp;
        String nam;
        String depa;
        String e;
        int dbo;
       // String temp1;
        System.out.println("enter the number");
        Scanner s1= new Scanner(System.in);
        n = s1.nextInt();
        student1[] arr=new student1[n];
        for(int i=0;i<n;i++) {
            System.out.println("enter name, rollno, department, cgpa ,salary,  email, date-of-birth");
            // temp1=input.nextLine();
            Scanner s2= new Scanner(System.in);
            nam = s2.nextLine();
            r = s2.nextInt();
            s2.nextLine();
            depa = s2.nextLine();
            cgp = s2.nextFloat();
            s = s2.nextInt();
            s2.nextLine();
            e=s2.nextLine();
            dbo=s2.nextInt();
            s2.nextLine();
            //temp1=input.nextLine();
            arr[i] = new student1(nam, r, depa,  cgp , s , e , dbo);
        }
        float[] avg=new float[n];
        //float[] avg1=new float[n];
        for(int i=0;i<n;i++)                      // to calculate average of cgpa
        {
            int k=0;
            for(int j=0;j<n;j++)
            {

                if(arr[i].department.equals(arr[j].department)){
                    avg[i]=avg[i]+arr[j].salary;
                    k++;
                }
            }
            avg[i]=avg[i]/k;
            System.out.println(avg[i]);
        }
        float maxi=avg[0];
        int maxindex = 0;
        for(int i=0;i<n;i++)              //department with maximun average cgpa
        {
            if(maxi<avg[i])
            {
                maxi=avg[i];
                maxindex = i;
            }
        }
        System.out.println("the department with highest average cgpa is "+arr[maxindex].department);

        for(int i=0;i<n;i++)      //sorting
        {
            for(int j=0;j<n;j++)
            {
                if(arr[maxindex].department.equals(arr[i].department))
                {
                    if(arr[i].cgpa<arr[j].cgpa)
                    {
                        student1 temp = new student1(arr[j].name,arr[j].rollno,arr[j].department,arr[j].cgpa,arr[j].salary,arr[j].email,arr[j].dob);
                        arr[j]=arr[i];
                        arr[i]=temp;

                    }
                }
            }
        }
        System.out.println(" name "+"  "+"rollno"+"   "+"  department   "+" cgpa "+" salary "+" email "+" date-of-birth ");
        for(int i=0;i<n;i++)              // printing students with highest cgpa
        {
            if(arr[maxindex].department.equals(arr[i].department))
            {
                System.out.println(arr[i].name +"   "+ arr[i].department +"   " + arr[i].cgpa + "    " + arr[i].salary +
                        "  "+arr[i].email+"    "+arr[i].dob);
            }
        }



        //float[] avg=new float[n];
        float[] avg1=new float[n];
        for(int i=0;i<n;i++)                      // to calculate average of salary
        {
            int k=0;
            for(int j=0;j<n;j++)
            {

                if(arr[i].department.equals(arr[j].department)){
                    avg1[i]=avg1[i]+arr[j].cgpa;
                    k++;
                }
            }
            avg1[i]=avg1[i]/k;
            System.out.println(avg1[i]);
        }
        float maxi1=avg[0];
        int maxindex1 = 0;
        for(int i=0;i<n;i++)              //department with maximun average salary
        {
            if(maxi1<avg[i])
            {
                maxi1=avg[i];
                maxindex1 = i;
            }
        }
        System.out.println("the department with highest average salary is "+arr[maxindex1].department);

        for(int i=0;i<n;i++)      //sorting
        {
            for(int j=0;j<n;j++)
            {
                if(arr[maxindex].department.equals(arr[i].department))
                {
                    if(arr[i].dob<arr[j].dob)
                    {
                        student1 temp = new student1(arr[j].name,arr[j].rollno,arr[j].department,arr[j].cgpa,arr[j].salary,arr[j].email,arr[j].dob);
                        arr[j]=arr[i];
                        arr[i]=temp;

                    }
                }
            }
        }
        System.out.println(" name "+"  "+"rollno"+"   "+"  department   "+" cgpa "+" salary "+" email "+" date-of-birth ");
        for(int i=0;i<n;i++)              // printing students with highest salary
        {
            if(arr[maxindex].department.equals(arr[i].department))
            {
                System.out.println(arr[i].name +"   "+ arr[i].department +"   " + arr[i].cgpa + "    " + arr[i].salary +
                        "  "+arr[i].email+"    "+arr[i].dob);
            }
        }
    }
}