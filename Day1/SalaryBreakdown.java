package Day1;

import java.util.Scanner;

public class SalaryBreakdown {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the basic salary :");
        double basic = sc.nextDouble();
        
        double hra = (basic * 20)/100;
        double da = (basic * 10)/100;
        double pf = (basic * 12)/100;

        double NetSalary =  basic+hra+da-pf;
        System.out.println("Net Salary is "+NetSalary);

        System.out.println("Addtitonal in Basic Salary:");
        double addbasic = sc.nextDouble();

        double hike = ((addbasic-basic)/basic)*100;
        System.out.println("Percentage Change :"+hike);
    }
}
