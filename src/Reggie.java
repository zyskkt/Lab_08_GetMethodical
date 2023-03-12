import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        //Init scanner
        Scanner pipe = new Scanner(System.in);
        //Init variables
        String ssn;
        String mNumber;
        String menuChoice;
        //Run strings through method to get answers and test validity
        ssn = SafeInput.getRegExString(pipe, "Enter your SSN (###-##-####): ", "\\d{3}-\\d{2}-\\d{4}");
        mNumber = SafeInput.getRegExString(pipe, "Enter your UC student M number (M|m)#####: ", "[Mm]\\d{5}");
        menuChoice = SafeInput.getRegExString(pipe, "Enter a menu choice (O, S, V, or Q): ", "[OoSsVvQq]");
        //Print results
        System.out.println("Your SSN is " + ssn);
        System.out.println("Your UC student M number is " + mNumber);
        System.out.println("Your menu choice is " + menuChoice.toUpperCase());
    }
}
