import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.APPEND;

public class UserAccount {
    Scanner scanner = new Scanner(System.in);
    //File filename = new File(".txt");
    String filename = "C:\\Users\\user\\Documents\\bankUSSD\\bankUser.txt";
    public UserAccount(){
        try{
            System.out.println("=============================");
            System.out.println("BANK USSD APP");
            System.out.println();
            System.out.println("1. Create user account");
            System.out.println("2. Login");
            System.out.println("=============================");
            System.out.println("Enter choice: ");
            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                createAccount();
            } else if (choice.equals("2")) {
                login();

            }else {
                System.out.println("Please enter the valid choice");
                new UserAccount();
        }
            }catch(Exception ex){
        }
    }

    public void login(){
        try{
            Path path = Paths.get(filename.toString());
            InputStream input = Files.newInputStream(path);
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            System.out.println("======== LOGIN ========");
            System.out.println("Enter username: ");
            String username = scanner.nextLine();
            System.out.println("Enter password");
            String password = scanner.nextLine();
            String _temp = null;
            String _name = "";
            String _surname = "";
            String _user;
            String _pass;
            boolean found = false;
            while ((_temp = reader.readLine()) != null){
                String[] account = _temp.split(" , ");
                _name += account[0];
                _surname += account[1];
                _user = account[4];
                _pass = account[5];
                if (_user.equals(username) && _pass.equals(password)){
                    found = true;
                }
            }

            if (found == true){
                System.out.println("Access granted");
                System.out.println("Welcome " + _name + "  " + _surname );
            } else {
                System.out.println("Access denied! Invalid username or Password");
            }
            reader.close();;
            System.out.println("Press any key to continue...");
            String proc = scanner.nextLine();
            new UserAccount();
        }catch (Exception ex){
            System.out.print(ex.getMessage());
        }
    }

    public void createAccount(){
        try {
            Path path = Paths.get(filename.toString());
            OutputStream output = new BufferedOutputStream(Files.newOutputStream(path, APPEND));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));
            System.out.println("========= CREATE ACCOUNT =========");
            System.out.println("Enter your Name: ");
            String name = scanner.nextLine();
            System.out.println("Enter your Surname: ");
            String surname = scanner.nextLine();
            System.out.println("Enter your Email: ");
            String email = scanner.nextLine();
            System.out.println("Enter your phone number: ");
            String phoneNo = scanner.nextLine();
            System.out.println("Create username: ");
            String username = scanner.nextLine();
            System.out.println("Create password: ");
            String password = scanner.nextLine();

            writer.write(name + " , " + surname + " , " + email + " , " + phoneNo + " , " + username + " , " + password);
            writer.newLine();
            System.out.println("New account has been created!");
            writer.close();
            output.close();

            System.out.println("Press any key to continue...");
            scanner.nextLine();

            new UserAccount();
        }catch (Exception ex){
            System.out.print(ex.getMessage());
        }
    }
}
