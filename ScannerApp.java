import java.util.Scanner;

public class ScannerApp {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        String x = sc.next();
        System.out.println("You entered: " + x);
    }
}