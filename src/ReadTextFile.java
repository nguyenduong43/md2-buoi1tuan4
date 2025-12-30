import java.io.*;

public class ReadTextFile {
    public static void main(String[] args) {
        try {
            // Tạo đối tượng File đại diện cho file cần đọc
            File inFile = new File("Hello.txt");

            // Tạo FileReader để đọc ký tự từ file
            FileReader fileReader = new FileReader(inFile);

            // Tạo BufferedReader để đọc hiệu quả hơn (theo từng dòng)
            BufferedReader reader = new BufferedReader(fileReader);

            String line;

            // Đọc từng dòng cho đến khi hết file
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Đóng reader để giải phóng tài nguyên
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}