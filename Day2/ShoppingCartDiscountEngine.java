/*A customer enters their cart total and membership type (REGULAR, SILVER, GOLD). Calculate the discount using conditions.
Add rules such as:

Gold → 20%

Silver → 10%

Regular → 0%

Orders above ₹5,000 get an additional discount.*/

package Day2;

import java.util.Scanner;

public class ShoppingCartDiscountEngine{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total amount in cart :");
        double total = sc.nextDouble();
        System.out.println("Enter your membership type :");
        String membership = sc.next().toUpperCase();
        double carttotal, discount;

        if(membership.equals("GOLD")){
            //customer gets 20% discount
            discount = 0.2;
            carttotal = total - (total*discount);
            System.out.println("Total Amount will be "+carttotal);
        } else if(membership.equals("SILVER")){
            //customer gets 10% discount
            discount = 0.1;
            carttotal = total - (total*discount);
            System.out.println("Total Amount will be "+carttotal);
        } else{
            carttotal = total;
            System.out.println("Total Amount will be "+carttotal);
        }

        if(carttotal >=5000){
            discount = 0.05;
            carttotal = carttotal - (carttotal*discount);
            System.out.println("total Amount after additional discount will be "+carttotal);
        }
    }
}