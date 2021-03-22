package exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int optiune = 0;
            while (optiune != -1) {
                System.out.println("Introduceti primul numar");
                int x = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Introduceti al doilea numar");
                int y = scanner.nextInt();
                scanner.nextLine();
                try {
                    Calculator calculator = new Calculator();
                    int rezultat = x / y;
                    int rezultat2 = calculator.impartire(x, y);
                    System.out.println(rezultat2);
                } catch (MyCustomException ex) {
                    System.out.println("Nu putem imparti la 0");
                } catch (ArithmeticException ex) {
                    System.out.println("Nu putem imparti normal la 0");
                } finally {
                    System.out.println("---------------");
                }
            }
    }
}