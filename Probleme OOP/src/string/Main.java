package string;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String propozitie = scanner.nextLine();
        int endIndex = propozitie.lastIndexOf('.');
        int startIndex = propozitie.lastIndexOf(' ') + 1;
        String cuvant = propozitie.substring(startIndex, endIndex);
        System.out.println("ultimul cuvant este: " + cuvant);

        String[] cuvinte = propozitie.split(" ");
        for(String cuv : cuvinte) {
            if(cuv.contains(".")) {
                cuv = cuv.replace(".", "");
                System.out.println(cuv);
                System.out.println(".");
            }
            System.out.println(cuv);
        }
    }
}
