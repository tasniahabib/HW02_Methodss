
import java.util.Scanner;

public class Reggie {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String ssn;
        String studentNumber;
        String zipCode;

        ssn = SafeInput.getRegExString(
                in,
                "Enter your SSN (123-45-6789)",
                "\\d{3}-\\d{2}-\\d{4}");

        studentNumber = SafeInput.getRegExString(
                in,
                "Enter UC M number (M12345)",
                "(M|m)\\d{5}");

        zipCode = SafeInput.getRegExString(
                in,
                "Enter ZIP+4 (45219-1234)",
                "\\d{5}-\\d{4}");

        System.out.println("\nYour information:");
        System.out.println("SSN: " + ssn);
        System.out.println("UC M Number: " + studentNumber);
        System.out.println("ZIP+4: " + zipCode);
    }
}

