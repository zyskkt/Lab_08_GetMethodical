import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args) {
        //Import scanner
        Scanner pipe = new Scanner(System.in);
        //Init message variable
        String message = "";
        //Ask for input
        System.out.print("Enter a message to make pretty: ");
        message = pipe.next();
        SafeInput.prettyHeader(message);
    }
}
