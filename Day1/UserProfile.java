package Day1;

import java.util.Scanner;

public class UserProfile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        String acctype = sc.next();
        int balance = sc.nextInt();

        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Account Type : "+acctype);
        System.out.println("Initial Balance : "+balance);
    }
}