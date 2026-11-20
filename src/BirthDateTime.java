
import java.util.Scanner;

public class BirthDateTime {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int year;
        int month;
        int day;
        int hours;
        int minutes;
        int maxDays = 0;

        year = SafeInput.getRangedInt(
                in, "Enter birth year", 1921, 2020);

        month = SafeInput.getRangedInt(
                in, "Enter birth month", 1, 12);

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                maxDays = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                maxDays = 30;
                break;

            case 2:
                maxDays = 29;
                break;
        }

        day = SafeInput.getRangedInt(
                in, "Enter birth day", 1, maxDays);

        hours = SafeInput.getRangedInt(
                in, "Enter birth hour", 1, 24);

        minutes = SafeInput.getRangedInt(
                in, "Enter birth minutes", 1, 59);

        System.out.println("\nYour birth information:");
        System.out.println("Date: " + month + "/" + day + "/" + year);
        System.out.println("Time: " + hours + ":" + minutes);
    }
}

