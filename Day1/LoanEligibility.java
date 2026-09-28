package Day1;

import java.util.Scanner;

public class LoanEligibility {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter monthly income: ");
        double monthlyIncome = sc.nextDouble();

        System.out.print("Enter existing monthly EMI obligations: ");
        double existingEmi = sc.nextDouble();

        System.out.print("Enter credit score: ");
        int creditScore = sc.nextInt();

        System.out.print("Enter requested loan amount: ");
        double loanAmount = sc.nextDouble();

        // Calculate Debt-to-Income Ratio
        double dti = (existingEmi / monthlyIncome) * 100;

        System.out.printf("Debt-to-Income Ratio: %.2f%%%n", dti);

        // Check eligibility
        if (creditScore >= 700 && dti <= 40 && loanAmount <= monthlyIncome * 10) {
            System.out.println("Applicant is eligible for the loan.");
        } else {
            System.out.println("Applicant is not eligible for the loan.");
        }

        sc.close();
    }
}
