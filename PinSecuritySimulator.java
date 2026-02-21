//Arlette Torres L20582656
//Cybersecurity: Systems (CPSC-4363-48F)_OL
//Professor Liu
//9/23/25
package cOSC3com;
import java.util.Scanner;

public class PinSecuritySimulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 4-character password (letters and numbers only, case-sensitive): ");
        String pin = scanner.nextLine();

        long hackTime = simulateHackTime(pin);
        System.out.println("Your password could be cracked in " + hackTime + " ms");

        scanner.close();
    }

    public static long simulateHackTime(String pin) {
        boolean hasLower = false, hasUpper = false, hasDigit = false;

        for (char c : pin.toCharArray()) {
            if (Character.isLowerCase(c)) hasLower = true;
            else if (Character.isUpperCase(c)) hasUpper = true;
            else if (Character.isDigit(c)) hasDigit = true;
        }

        // Base hack time for numbers-only password
        long baseTime = 22; // in ms

        // Precise multiplier for mixed passwords
        if ((hasLower || hasUpper) && hasDigit) baseTime = 404;

        return baseTime;
    }
}
