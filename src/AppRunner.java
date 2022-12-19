import java.io.Console;
import java.util.Scanner;

public class AppRunner {
    public static void main(String[] args) {

        Console console = System.console();
        if (console != null){
            //console.writer().println("We have a console");
            Scanner id_scanner = new Scanner(console.reader());
            System.out.println("Please enter your name: ");
//            User userID = new User;
//            String userName = id_scanner.nextLine();
//            Scanner pw_scanner = new Scanner(console.reader());
//            System.out.println("Please enter your password: ");
//            char[] password = console.readPassword();
//            String passwordstr = new String(password);
//            System.out.println("Welcome to USSD Banking " + userID + ". Your password is " + passwordstr);
    }
        else {
            System.out.println("We do not have console");
        }
    }
}