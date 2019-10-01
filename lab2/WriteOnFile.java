import java.util.Scanner;
import java.io.*;
public class WriteOnFile {
    public static void main(String args[]) throws IOException{
        Scanner scan= new Scanner(System.in);
        File file = new File("/home/student/Desktop/filewrite.txt");
        //file.createNewFile();
        System.out.println(file);
        FileWriter fileWriter = new FileWriter(file);
        System.out.println("Enter content to write on file :");
        String str;
        str = scan.nextLine();
        fileWriter.write(str);
        fileWriter.close();
    }
}
