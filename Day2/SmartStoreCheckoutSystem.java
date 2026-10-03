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
        String[] products = {"Rice","Milk","Headphone","Keyboard","T-Shirt","Jeans","Fridge","Sugar"};
        int[] category = {1,1,2,2,3,3,2,1};
        double[] price = {500,60,2000,1500,800,1200,2500,70};
        int[] stock = {10,20,5,8,15,10,15,30}; 
        int[] cart = new int[products.length];

        int successfulAddItem = 0;
        int failedAddItem = 0;

        boolean running = true;
        boolean discountApplied = false;
        boolean isGoldCustomer = false;

        while(running){
            System.out.println("\n====================\n Smart Mart \n====================");
            System.out.println("1. Add Product\n2. Remove Product\n3. View Cart Total\n4. Apply Discount\n5. Checkout\n6. Cancel Order\n7. Exit");
            System.out.print("Choose: ");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Product Categories:");
                    System.out.println("1. Grocery\n2. Electronic\n3. Clothing\n4. Exit");
                    System.out.print("Choose Category:");
                    int catoption= sc.nextInt();

                    if(catoption == 4){
                        continue;
                    }

                    if(catoption<1 || catoption>3){
                        System.out.println("Invalid Category");
                        continue;
                    }

                    System.out.println("\nAvailable Product:");
                    for(int i=0; i<products.length; i++){
                        if(category[i]==catoption){
                            System.out.println(
                                (i + 1) + ". " +
                                    products[i] +
                                    " - ₹" + price[i] +
                                    " | Stock: " + stock[i]
                            );
                        }
                    }

                    System.out.println("Enter product number:");
                    int productChoice = sc.nextInt();

                    if(productChoice<1 || productChoice>products.length || category[productChoice-1]!=catoption){
                        System.out.println("Invalid product");
                        System.out.println("Try Again");
                        failedAddItem++;
                        continue;
                    }

                    int index = productChoice-1;
                    System.out.print("Enter quantity:");
                    int quantity = sc.nextInt();

                    if(quantity<=0){
                        System.out.println("Invalid quantity");
                        failedAddItem++;
                        continue;
                    }

                    if(quantity>stock[index]){
                        System.out.println("Quantity exceeds available stock");
                        failedAddItem++;
                        continue;
                    }

                    switch (category[index]) {
                        case 1:
                            System.out.println("Grocery item selected.");
                            break;
                        
                        case 2:
                            System.out.println("Electronic item selected");
                    
                        case 3:
                            System.out.println("Clothing item selected");
                            break;
                    }
                    cart[index] += quantity;

                    stock[index] -= quantity;
                    successfulAddItem++;
                    System.out.println(quantity + " "+ products[index]+ " added successfully.");
                    break;

                
                case 2:
                    System.out.println("\nYour Cart: ");
                    boolean cartEmpty = true;

                    for(int i=0; i<products.length; i++){
                        if(cart[i]>0){
                            cartEmpty = false;
                            System.out.println((i+1)+" . "+products[i]+" | Quantity: "+cart[i]);
                        }
                    }

                    if(cartEmpty){
                        System.out.println("Cart is empty.");
                        continue;
                    }

                    System.out.println("Enter product number to remove: ");
                    int removeChoice = sc.nextInt();
                    if(removeChoice<1 || removeChoice>products.length || cart[removeChoice-1]==0){
                        System.out.println("Invalid product");
                        continue;
                    }

                    int removeIndex = removeChoice-1;
                    System.out.print("Enter quantity to remove:");
                    int removequantity = sc.nextInt();

                    if(removequantity<=0 || removequantity > cart[removeIndex]){
                        System.out.println("Invalid quantity");
                        continue;
                    }

                    cart[removeIndex] -= removequantity;
                    stock[removeIndex] += removequantity;
                    System.out.println("Product removed successfully");
                    break;

                case 3:
                    double subtotal = 0;
                    System.out.println("\n======CART======");
                    for(int i=0; i<products.length; i++){
                        if(cart[i]>0){
                            double itemTotal = price[i]*cart[i];
                            subtotal += itemTotal;
                            System.out.println(products[i]+" x "+cart[i]+" = Rps"+itemTotal);
                        }
                    }
                    System.out.println("-------------------------");
                    System.out.println("Subtotal: Rps."+subtotal);
                    break;
                
                case 4:
                    double currentSubtotal = 0;
                    for (int i = 0; i < products.length; i++) {
                        currentSubtotal += price[i] * cart[i];
                    }
                    if (currentSubtotal == 0) {
                        System.out.println("Cart is empty.");
                        continue;
                    }

                    double discountPercent;
                    if (currentSubtotal < 1000) {
                        discountPercent = 0;
                    } else if (currentSubtotal < 5000) {
                        discountPercent = 5;
                    } else if (currentSubtotal < 10000) {
                        discountPercent = 10;
                    } else {
                        discountPercent = 15;
                    }

                    System.out.print("Are you a Gold customer? (yes/no): ");
                    String customerType = sc.next();
                    if (customerType.equalsIgnoreCase("yes")) {
                        isGoldCustomer = true;
                        discountPercent += 5;
                    } else {
                        isGoldCustomer = false;
                    }

                    discountApplied = true;
                    double discountAmount = currentSubtotal * discountPercent / 100;
                    System.out.println( "Discount: " + discountPercent +"%");
                    System.out.println("Discount Amount: ₹" + discountAmount);
                    break;

                case 5:
                    double checkoutSubtotal = 0;
                    for (int i = 0; i < products.length; i++) {
                        checkoutSubtotal +=
                                price[i] * cart[i];
                    }
                    if (checkoutSubtotal == 0) {
                        System.out.println("Cart is empty.");
                        continue;
                    }

                    double checkoutDiscountPercent;
                    if (checkoutSubtotal < 1000) {
                        checkoutDiscountPercent = 0;
                    } else if (checkoutSubtotal < 5000) {
                        checkoutDiscountPercent = 5;
                    } else if (checkoutSubtotal < 10000) {
                        checkoutDiscountPercent = 10;
                    } else {
                        checkoutDiscountPercent = 15;
                    }

                    if (isGoldCustomer) {
                        checkoutDiscountPercent += 5;
                    }
                    discountAmount = checkoutSubtotal * checkoutDiscountPercent / 100;
                    double amountAfterDiscount = checkoutSubtotal - discountAmount;
                    double tax = amountAfterDiscount * 0.18;
                    double finalAmount = amountAfterDiscount + tax;

                    System.out.println("\n=========================");
                    System.out.println("        CHECKOUT");
                    System.out.println("=========================");

                    System.out.println("Subtotal       : ₹" +checkoutSubtotal);
                    System.out.println("Discount       : ₹" +discountAmount);
                    System.out.println("Tax (18%)      : ₹" +tax);
                    System.out.println("Final Amount   : ₹" +finalAmount);
                    System.out.println("=========================");
                    System.out.println("Order completed successfully!");
                    // Clear cart after successful checkout
                    for (int i = 0; i < products.length; i++) {
                        cart[i] = 0;
                    }
                    discountApplied = false;
                    isGoldCustomer = false;
                    break;


               case 6:
                    boolean hasItems = false;
                    for (int i = 0; i < products.length; i++) {
                        if (cart[i] > 0) {
                            hasItems = true;
                            stock[i] += cart[i];
                            cart[i] = 0;
                        }
                    }
                    if (hasItems) {
                        System.out.println(
                                "Order cancelled successfully."
                        );
                    } else {
                        System.out.println("No active order.");
                    }
                    discountApplied = false;
                    isGoldCustomer = false;
                    break;
            
                case 7:
                    running = false;
                    System.out.println("ThankYou for Shopping");
                    break;
                
                default:
                    System.out.println("Invalid Option");
            }
        }

        System.out.println("\nSuccessful additions: "+successfulAddItem);
        System.out.println("Failed AddItem: "+failedAddItem);
        sc.close();
    }
}
