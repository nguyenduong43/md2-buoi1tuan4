import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("scores.txt");
        Scanner input = new Scanner(file);

        // Read data from a file
        while (input.hasNext()) {
            String firstName = input.next();
            String mi = input.next();
            String lastName = input.next();
            int score = input.nextInt();

            System.out.println(
                    firstName + " " + mi + " " + lastName + " " + score
            );
        }

        input.close();
    }
}
