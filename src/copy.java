import java.util.*;
import java.io.*;
public class copy {
    public static void main(String[] args) {
        try {
            File file = new File("numbers.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            FileWriter file2 = new FileWriter("numbers1.txt");
            BufferedWriter bw = new BufferedWriter(file2);
            String line;
            while ((line = br.readLine()) != null) {
                bw.write(line);
                bw.newLine();
            }
            bw.close();br.close();

        }
        catch (Exception e) {
            System.out.println("file khong hop le");
        }
    }
}
