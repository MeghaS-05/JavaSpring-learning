/*Build a console banking application:

=========================
     DIGITAL BANK
=========================

1. Check Balance
2. Deposit
3. Withdraw
4. Transfer
5. Transaction Summary
6. Exit

Choose option:
Requirements
Keep showing the menu until the user chooses 6.
Use switch for menu handling.
Use while/do-while for the main loop.

Balance starts at ₹10,000.

Deposit:
amount must be > 0
otherwise reject

Withdraw:
amount must be > 0
amount cannot exceed balance
maximum withdrawal = ₹25,000

Transfer:
amount must be > 0
amount cannot exceed balance
minimum transfer = ₹500

Invalid menu choice should not terminate the program.

Keep track of:
successful transactions
failed transactions
total deposited
total withdrawn

6 should cleanly exit.


You'll practice:
if/else + switch + loops + validation + counters + state + break + continue.*/

package Day2;

import java.util.Scanner;

public class ATMSimulation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Check Balance\n2. Deposit\n3. Withdraw\n4. Transfer\n 5.Transaction Summary\n6.Exit");
        int balance = 10000;
        int successfultransaction = 0;
        int failedtransaction = 0;
        int totaldeposited = 0;
        int totalwithdrawn=0;
        while(true){
            System.out.println("Enter the option:");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Your current balance is "+balance);
                break;
                
            case 2:
                System.out.println("Enter the amount you want to deposit :");
                int amount = sc.nextInt();
                if(amount>0){
                    balance +=amount;
                    totaldeposited += amount;
                    successfultransaction++;
                    System.out.println(amount+" deposited in your account");
                    System.out.println("Your current balance is "+balance+"\n");
                } else{
                    failedtransaction++;
                    System.out.println("Enter the sufficient amount\n");
                }
                break;
            
            case 3:
                System.out.println("Enter the amount you want to withdraw:");
                int with = sc.nextInt();
                if (with > 0 && with <= balance && with <= 25000){
                    balance -= with;
                    totalwithdrawn+=with;
                    successfultransaction++;
                    System.out.println(with+" amount is withdrawl successfully");
                    System.out.println("Your current balance is "+balance+"\n");
                }else{
                    failedtransaction++;
                    System.out.println("Enter sufficient amount to withdraw\n");
                }
                break;
            
            case 4:
                System.out.println("Enter the amount you want to transfer:");
                int trans = sc.nextInt();
                if(trans>=500 && trans<=balance){
                    balance = balance-trans;
                    successfultransaction++;
                    System.out.println(trans+" amount transfer successfully");
                    System.out.println("Your current balance is "+balance+"\n");
                }else{
                    failedtransaction++;
                    System.out.println("Failed Transfer\n");
                }
                break;
            
            case 5:
                System.out.println("===================================\n        Transaction Summary     \n===================================");
                System.out.println("Balance :"+balance);
                System.out.println("Total Withdraw :"+totalwithdrawn);
                System.out.println("Total Successful Transaction :"+successfultransaction);
                System.out.println("Total Failed Transaction :"+failedtransaction);
                break;
            
            case 6:
                System.out.println("Thank you for using ATM Stimulation\n");
                break;
            
            default:
                break;
            }
            if(option == 6){
            break;
        }
        }
    }
}
