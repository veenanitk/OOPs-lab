

public class Student {
    private int rollno, mark1, mark2, mark3;
    String name;
    String nam;
    Student(){

    }
    public Student(int rollno, int mark1, int mark2, int mark3, String name) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.rollno = rollno;
        this.name = name;

    }

    Student(Student s) {
        System.out.println("Copy constructor called");
        mark1 = s.mark1;
        mark2 = s.mark2;
        mark3 = s.mark3;
        rollno = s.rollno;
        name = s.name;
    }


    public static void main(String[] args) {

        Student c = new Student();
        System.out.println("null constructor called   " + c.nam);
        Student s1 = new Student(1, 10, 15, 11,"veena");
        Student s2 = new Student(s1);

        System.out.println("    rollno " + s2.rollno + "    mark1  "+ s2.mark1 + "     mark2  "+ s2.mark2 + "       mark3 " + s2.mark3 + "        name  " + s2.name); // toString() of c2 is called here
    }
}
