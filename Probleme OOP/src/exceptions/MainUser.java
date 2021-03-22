package exceptions;

import java.util.Scanner;

public class MainUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int optiune = 0;
            while (optiune != -1) {
                try {
                    System.out.println("Enter name of user: ");
                    String name = scanner.nextLine();
                    User user = new User();
                    user.setName(name);
                } catch (EmptyNameException e) {
                    System.out.println("Name is empty!");
                } catch (TooLongNameException e) {
                    System.out.println("Name is too long. Enter a shorter name: ");
                }
            }
    }
}