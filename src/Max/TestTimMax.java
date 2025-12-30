package Max;
import java.util.*;
public class TestTimMax {
    public static void main(String[] args) {
        timMax x = new timMax();
        List<Integer> numbers = x.taoFile("numbers.txt");
        x.writeFile("numbers.txt",x.lonnhat(numbers));
    }
}
