import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String Username;
        String Password;

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter your Username that you will use (minimum 5): ");
        String username1 = sc2.next();
        if (username1.matches("^[A-Z][a-zA-Z0-9]{4,}$")){
            username1 = username1;
        }else {
            throw new IllegalArgumentException("Ivalid Username");
        }
        Username = username1;

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter your Password that you will use (minimum 8): ");
        String password1 = sc3.next();
        if (password1.matches("^(?=.*[0-9])(?=.[a-z])(?=.[A-Z])(?=.[!@#&()–[{}]:;',?/*~$^+=<>]).{8,}$")){
            password1 = password1;
        }else {
            throw new IllegalArgumentException("Ivalid Password");
        }
        Password = password1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Username: ");
        String username = sc.next();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Password: ");
        String password = sc1.next();

        if (username.equals(Username) && password.equals(Password)){
            System.out.println("Access Granted!");
        } else if (username.equals(Username)) {
            System.out.println("Invalid Username or Password!");
        } else if (password.equals(Password)) {
            System.out.println("Invalid Username or Password!");
        }else {
            System.out.println("Invalid Username or Password!");
        }
    }
}