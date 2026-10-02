package Day2;

import java.util.Scanner;

public class PINAuthenticationSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your correct pin:");
        int pin=sc.nextInt();
        for(int i=1; i<=3;i++){
            System.out.println("Enter your pin :");
            int attpin = sc.nextInt();
            if(pin == attpin){
                System.out.println("Access Granted");
            } else{
                System.out.println("Access Denied");
            }
        }
        System.out.println("Account locked");
    }
}
