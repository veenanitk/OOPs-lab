import java.util.Scanner;
class Sort{
    private String str[];
    private int listsize;
    Sort(int size){
        listsize=size;
    }
    void InputList(){
        str = new String[listsize];
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter list of names: ");
        for(int i=0;i<listsize;i++){
            str[i]=scan.nextLine();
        }
    }
    void SortList(String opt){
        for(int i=0;i<listsize;i++){
            int pos=i;
            if(opt.equals("a")) {
                for (int j = i + 1; j < listsize; j++) {
                    if (str[j].compareToIgnoreCase(str[pos]) < 0) {
                        pos = j;
                    }
                }
            }
            else if(opt.equals("d")){
                for (int j = i + 1; j < listsize; j++) {
                    if (str[j].compareToIgnoreCase(str[pos]) > 0) {
                        pos = j;
                    }
                }
            }
            String temp=str[pos];
            str[pos]=str[i];
            str[i]=temp;
        }
    }
    void OutputList(){
        for(int i=0;i<listsize;i++){
            System.out.println(str[i]);
        }
    }
}
public class SortNames {
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter size of list : ");
        int size=scan.nextInt();
        Sort obj=new Sort(size);
        obj.InputList();

        //System.out.println("List without sorting : ");
        //obj.OutputList();
        System.out.println("Enter your choice: ");
        String temp=scan.nextLine();
        String ch;
        ch = scan.nextLine();

        obj.SortList(ch);
        System.out.println("List with sorting : ");
        obj.OutputList();
        System.out.println("Enter your choice: ");
        ch = scan.nextLine();
        obj.SortList(ch);
        System.out.println("List with sorting : ");
        obj.OutputList();
    }
}
