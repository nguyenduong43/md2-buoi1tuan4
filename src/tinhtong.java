import java.io.*;
import java.util.Scanner;
import java.util.*;
public class tinhtong {
    public static void main(String[] args) {

        try {
            File file = new File("numbers.txt");
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader buffered = new BufferedReader(fileReader);
            String line=" ";int sum=0;
            while ((line=buffered.readLine())!=null)
                {
                System.out.println(line);
                sum=sum+Integer.parseInt(line);
                }
            buffered.close();
            System.out.println("The sum is "+sum);
        } catch (IOException e) {
            System.out.println("Error opening file");
        }

    }
}
