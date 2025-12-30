package Max;
import java.util.*;
import java.io.*;
public class timMax {
    public List<Integer> taoFile(String nhap) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(nhap);
            if (!file.exists())
            {throw new FileNotFoundException();}
            FileReader in = new FileReader(file);
            BufferedReader br = new BufferedReader(in);
            String line;
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        }
        catch (IOException e)
            {
                System.out.println("file khong ton tai hoac trong");
            }
        return numbers;
    }
    public void writeFile(String nhap,int max) {
        try {
            FileWriter file = new FileWriter(nhap, true);
            BufferedWriter bw = new BufferedWriter(file);
            bw.write("gia tri lon nhat max=" + max + "\n");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public int lonnhat(List<Integer> numbers) {
         int max=numbers.get(0);
         for (int i=1;i<numbers.size();i++)
             if (numbers.get(i)>max) max=numbers.get(i);
         return max;
    }
}
