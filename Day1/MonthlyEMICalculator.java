/*Log in
You said:

note we have to prepare for mnc's level, specifically for fintech/banking and ai based company

i'll share you my today's target, you have to give me 15 problem to solve that topic which will cover your full topic, make sure you give no soution just state the problem. and also no theory about the topic. also add mnc's level aptitude or technical round question based on that problme

ChatGPT said:
Got it.

For each day’s target/topic you share, I’ll give you exactly 15 problems designed around MNC-level preparation, with emphasis on:

FinTech / Banking

AI-based companies

Product-based MNCs

Aptitude + technical interview rounds

Problems ranging from fundamental → intermediate → MNC-level challenging

Format I’ll follow
Topic: [Your topic]

Problem 1 — [difficulty]
Problem statement only.

Problem 2 — [difficulty]
Problem statement only.

...

Problem 15 — [difficulty]
Problem statement only.

For relevant problems, I’ll additionally attach an MNC Interview Question such as:

Technical-round variation

Aptitude-round variation

Edge-case question

Optimization question

Follow-up interview question

FinTech/Banking/AI-oriented variation

Important: I will not provide solutions, hints, formulas, theory, or explanations unless you explicitly ask for them later.

Send me today’s target/topic, and I’ll create the 15 problems.


Log in for more personalized help with work, projects, and career goals.


Log in

Sign up for free
You said:

Day 1 — Syntax, Variables, Operators, I/O Concepts: primitive types, type casting, operators, Scanner, compilation vs runtime. Problems: EMI calculator from user input (fintech-flavored from day 1); Temperature converter with validation; swap two numbers without a third variable; BMI calculator with category. GitHub: day01-java-basics — EMI calculator as the pinned mini-project. Fintech Interview Q: "An EMI calculation involves floating-point money math — why is double dangerous for currency, and what should you use instead (BigDecimal)?"

ChatGPT said:
Day 1 — Java Basics: Syntax, Variables, Operators & I/O
1. EMI Calculator — FinTech
A banking application accepts principal loan amount, annual interest rate, and loan tenure in months from the user. Calculate the monthly EMI and display the result rounded to two decimal places.

MNC Technical Round:
The application receives the interest rate as 7.5 and the loan amount as 500000. Identify the data types you would choose for each input and explain what could go wrong if integer types are used.

2. EMI with Different Tenures — FinTech
Accept a loan amount, annual interest rate, and three different loan tenures from the user. Calculate the EMI for each tenure and display all three results.

MNC Aptitude Round:
For the same principal and interest rate, determine which tenure produces the highest total repayment and calculate the difference between the total repayments.*/

package Day1;

import java.util.Scanner;

public class MonthlyEMICalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount : ");
        double principal = sc.nextDouble();
        System.out.println("Enter the annual rate of interest : ");
        double roi = sc.nextDouble();
        double interest = roi/12/100;
        System.out.println("Enter the loan tenure in months :");
        int time = sc.nextInt();
        
        double emi = principal*interest*Math.pow(1+interest, time)/(Math.pow(1+interest, time)-1);
        System.out.printf("Your monthly EMI would be %.2f%n", emi,"\n");


        System.out.println("EMI with Different Tenure");
        System.out.printf("EMI with first interest will be %.2f%n",emi,"\n");
        System.out.println("Enter the second rate of interest :");
        double roi2 = sc.nextDouble();
        double interest2 = roi2/12/100;
        double emi2 = principal*interest2*Math.pow(1+interest2, time)/(Math.pow(1+interest2, time)-1);
        System.out.printf("The Second EMI will be %.2f%n",emi2,"\n");
        System.out.println("The Third rate of interest :");
        double roi3 = sc.nextDouble();
        double interest3 = roi3/12/100;
        double emi3 = principal*interest3*Math.pow(1+interest3, time)/(Math.pow(1+interest3, time)-1);
        System.out.printf("The Second EMI will be %.2f%n",emi3);
        sc.close();
    }
}
