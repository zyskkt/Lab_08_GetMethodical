import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        //Init scanner and variables
        Scanner pipe = new Scanner(System.in);
        double total = 0.0;
        double price = 0.0;
        boolean moreItems = true;
        //While Y, let them add more items
        while (moreItems) {
            price = SafeInput.getRangedDouble(pipe, "Enter the price of your item", 0.50, 9.99);
            total += price;
            moreItems = SafeInput.getYNConfirm(pipe, "Do you have more items to add? (y/n)");
        }
        //Print their total, formatted to 2 decimals
        System.out.printf("Total cost of item(s): $%.2f\n", total);
    }
}