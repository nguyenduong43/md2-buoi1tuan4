package tong;
import java.util.*;
import java.io.*;
public class tinhtong2 {
    public static void main(String[] args) {
        System.out.println("nhap duong dan ");
        Scanner sc = new Scanner(System.in);
        String nhap = sc.nextLine();
        tinhtong readfileEx = new tinhtong();
        readfileEx.readFileText(nhap);
    }
}
