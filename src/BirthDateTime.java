import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = 0;
        int month = 0;
        int day = 0;
        int hour = 0;
        int minute = 0;
        int highDay = 0;

        year = SafeInput.getRangedInt(in, "Enter birth year", 1950, 2010);
        month = SafeInput.getRangedInt(in, "Enter birth month", 1, 12);
        hour = SafeInput.getRangedInt(in, "Enter birth hour", 0, 23);
        minute = SafeInput.getRangedInt(in, "Enter birth minute", 0, 59);
        switch (month) {
            case 2:
                highDay = 29;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                highDay = 30;
                break;
            default:
                highDay = 31;
                break;
        }
        day = SafeInput.getRangedInt(in, "Enter birth day", 1, highDay);


        System.out.println("\nYou were born in " + year + " on day " + day + " of month " + month + " at " + hour + " hour and " + minute + " minutes.");
    }
}


