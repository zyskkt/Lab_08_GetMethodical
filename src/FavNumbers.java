import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        //Initialize variables
        Scanner in = new Scanner(System.in);
        int favInt = 0;
        double favDouble = 0;
        //Call the methods

        favInt = SafeInput.getInt(in, "Enter your favorite whole number");
        favDouble = SafeInput.getDouble(in, "Enter your favorite number with a decimal.");

        System.out.println("\nYour favorite whole number is: " + favInt);
        System.out.println("\nYour favorite non-whole number is is: " + favDouble);
    }
}


