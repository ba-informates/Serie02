
import java.util.Locale;
import java.util.Scanner;


public class IMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double poids = 74.5;
        double taille = 1.75;
        System.out.println("Entrez votre taille (en m):");
        taille = scanner.nextDouble();
        System.out.println("Entrez votre poids (en kg) :");
        poids = scanner.nextDouble();
        double imc = poids / (taille * taille);
        System.out.println("Pour " + poids +"kg et " + taille + "m, votre IMC est de " + imc);
    }
}
