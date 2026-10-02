/*Build a small supermarket checkout system.

=========================
     SMART MART
=========================

1. Add Product
2. Remove Product
3. View Cart Total
4. Apply Discount
5. Checkout
6. Cancel Order

Choose:
Assume you have a limited inventory.

Product categories
1 → Grocery
2 → Electronics
3 → Clothing
4 → Exit

Use switch to determine category-specific pricing/discount rules.

Requirements
When adding an item:
quantity must be positive
quantity cannot exceed available stock
invalid product → reject
invalid quantity → reject
successful purchase decreases stock

Discounts
For example:
Cart < ₹1,000       → 0%
₹1,000–₹4,999       → 5%
₹5,000–₹9,999       → 10%
₹10,000+            → 15%

Then:
Gold customer → additional discount
Regular customer → no additional discount

Checkout
Print:
Subtotal
Discount
Tax
Final Amount
Don't modify inventory until the order has passed validation.

Challenge
If the user enters an invalid product:
Invalid product.
Try again.
The program should continue rather than terminate.

You'll practice:
nested conditions
switch
validation
continue
state management
counters
calculations
real-world business rules

*/

package Day2;

import java.util.Scanner;

public class SmartStoreCheckoutSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int successfulAddItem = 0;
        int failedAddItem = 0;
        int Cancelorder = 0;
        int totalproduct = 0;
        //here we have to add an totalproduct count 

        while(true){
            System.out.println("1. Grocery\n2. Electronic\n3. Clothing\n4. Exit");
            int catoption = sc.nextInt();
            while(true){
                 System.out.println("1. Add Product\n2. Remove Product\n3. View Cart Total\n4. Apply Discount\n5. Checkout\n6. Cancel Order");
                 int option = sc.nextInt();
                 switch (option) {
                    case 1 :
                        System.out.println("Enter the product you wanna add :");
                        String productname = sc.next();
                        break;
                    
                    case 2 :
                        System.out.println("Enter the product you want to remove :");
                        break;
                    
                    case 3:
                        System.out.println("View the cart total:");
                    
                    case 4 :
                        System.out.println("Discounted Amount would be :");
                    
                    case 5 :
                        System.out.println("Checkout");
                    
                    case 6 :
                        break;
                 }
                 if(option==6){
                    break;
                 }
            }
        }

    }
}
