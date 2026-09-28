package Day1;
import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal amount:");
        int principal = sc.nextInt();
        System.out.println("Enter the rate of interest: ");
        double roi = sc.nextDouble();
        System.out.println("Enter the time in month:");
        int yrs = sc.nextInt();

        double simpleInterest = (principal*roi*yrs)/100;
        int SimpleInterest = (int) simpleInterest;
        int TotalAmount = principal + SimpleInterest;
        System.out.println("Principal : "+principal);
        System.out.println("Rate of Interest :"+roi);
        System.out.println("Time :"+yrs);
        System.out.println("Interest :"+SimpleInterest);
        System.out.println("Total Amount :"+TotalAmount);
    }
}
