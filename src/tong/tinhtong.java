package tong;

import java.io.*;

public class tinhtong {
    public void readFileText(String nhap) {

        try {
            File file = new File(nhap);
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
