
import java.util.Scanner;

public class SafeInput {

    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";

        do {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;
    }

    public static int getInt(Scanner pipe, String prompt) {
        int value = 0;
        boolean valid = false;

        do {
            System.out.print("\n" + prompt + ": ");

            if (pipe.hasNextInt()) {
                value = pipe.nextInt();
                pipe.nextLine();
                valid = true;
            } else {
                System.out.println("Invalid input. Enter an integer.");
                pipe.nextLine();
            }
        } while (!valid);

        return value;
    }

    public static double getDouble(Scanner pipe, String prompt) {
        double value = 0;
        boolean valid = false;

        do {
            System.out.print("\n" + prompt + ": ");

            if (pipe.hasNextDouble()) {
                value = pipe.nextDouble();
                pipe.nextLine();
                valid = true;
            } else {
                System.out.println("Invalid input. Enter a number.");
                pipe.nextLine();
            }
        } while (!valid);

        return value;
    }

    public static int getRangedInt(Scanner pipe, String prompt,
                                   int low, int high) {
        int value;

        do {
            value = getInt(pipe, prompt + " [" + low + " - " + high + "]");

            if (value < low || value > high) {
                System.out.println("Enter a value between " + low + " and " + high);
            }
        } while (value < low || value > high);

        return value;
    }

    public static double getRangedDouble(Scanner pipe, String prompt,
                                         double low, double high) {
        double value;

        do {
            value = getDouble(pipe, prompt + " [" + low + " - " + high + "]");

            if (value < low || value > high) {
                System.out.println("Enter a value between " + low + " and " + high);
            }
        } while (value < low || value > high);

        return value;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String response;

        do {
            System.out.print("\n" + prompt + " [Y/N]: ");
            response = pipe.nextLine().trim();

            if (response.equalsIgnoreCase("Y") ||
                    response.equalsIgnoreCase("YES")) {
                return true;
            } else if (response.equalsIgnoreCase("N") ||
                    response.equalsIgnoreCase("NO")) {
                return false;
            } else {
                System.out.println("Please enter Y or N.");
            }
        } while (true);
    }

    public static String getRegExString(Scanner pipe, String prompt,
                                        String regEx) {
        String value;

        do {
            System.out.print("\n" + prompt + ": ");
            value = pipe.nextLine();

            if (!value.matches(regEx)) {
                System.out.println("Invalid format. Try again.");
            }
        } while (!value.matches(regEx));

        return value;
    }
}
