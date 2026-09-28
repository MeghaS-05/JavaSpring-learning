package Day1;

public class TransactionReceiptPrinting {
    public static void main(String[] args){
        String AccountHolder = "Rahul";
    String Transaction = "Deposit";
    int Amount = 5000;
    String Status = "SUCCESS";

    System.out.println("==========================");
    System.out.println("   TRANSACTION RECEIPT    ");
    System.out.println("==========================");
    System.out.println("Account Holder : "+AccountHolder);
    System.out.println("Transaction : "+Transaction);
    System.out.println("Amount : "+Amount);
    System.out.println("Status : "+Status);
    System.out.println("==========================");
    }
}
