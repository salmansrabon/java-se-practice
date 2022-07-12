package function_Array;

import sun.font.TrueTypeFont;

import java.util.Scanner;

//6. Suppose a software system excepts valid credentials from user to logged in to the system.
// if the user inputs wrong password for 3 times, system will say that "Your user has been temporary locked".
// Let the username: admin, password: adm1n
public class user_login {
    public static void main(String[] args) {
        boolean status = false;
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (status != true) {
            System.out.println("Enter username:");
            String username = scanner.next();
            System.out.println("Enter password:");
            String password = scanner.next();
            status = login(username, password);
            if (status == true) {
                System.out.printf("Login successful");
            } else if (status == false) {
                count++;
                //login(username, password);
                if (count == 3) {
                    System.out.println("Temporary blocked");
                    break;
                }
            }

        }

    }


    private static boolean login(String username, String password) {
        String _USERNAME = "admin";
        String _PASSWORD = "adm1n";
        if (username.equals(_USERNAME) && password.equals(_PASSWORD)) {
            return true;
        } else {
            return false;
        }
    }
}
