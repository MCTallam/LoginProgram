import java.util.Scanner;
public class LoginProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctUsername = "Maureen"; // System Username
        String correctPassword = "123456789"; // System Password
        int maxTries = 3; // maximum login tries
        int tries = 0;

        while (tries < maxTries) {
            System.out.println("****Login****");
            System.out.print("Enter username: ");
            String enteredUsername = scanner.nextLine();
            System.out.print("Enter password: ");
            String enteredPassword = scanner.nextLine();
             // If login successful
            if (correctUsername.equals(enteredUsername) && correctPassword.equals(enteredPassword)) {
                System.out.println("Login successful!");
                break;
            }
             // If Login not succesfull you get the first try
            else {
                System.out.println("Login failed. Please try again.");
                tries++;
            }
             // If login unsuccessful again you get more tries to the maximum attemps
            if (tries < maxTries) {
                System.out.println("You have " + (maxTries - tries) + " attempts remaining.\n");
            }
             // If you have excusted all the attempts you get notified
            else {
                System.out.println("You have exceeded the maximum number of login attempts.");
            }
        }
        scanner.close();
    }
}
