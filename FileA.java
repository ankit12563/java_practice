import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileA {
    public static void main(String args[]) throws IOException{
      File file = new File("article.txt");
      FileWriter filewriter = new FileWriter(file);
      filewriter.write("Hello, Nepal");
      filewriter.close();

      Scanner scan = new Scanner(file);
      while(scan.hasNextLine()){
        String line = scan.next();
        System.out.println(line);
      }
      scan.close();
    }
}