import java.util.Locale;
import java.util.Scanner;
import java.util.Date;

public class Annee_naissance {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int age;
        System.out.println("Entrez votre âge :");
        age = scanner.nextInt();
        int month;
        System.out.println("Entrez le nb de votre mois :");
        month = scanner.nextInt();
        int annee = 2023 - age;
        if (month > 10){
            --annee;
        }
        System.out.println("Votre année de naissance est : " + annee);
    }
}
