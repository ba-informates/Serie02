import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;
public class Degre3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Entrez a (int) :");
        int a = scanner.nextInt();
        System.out.println("Entrez b (int) :");
        int b = scanner.nextInt();
        System.out.println("Entrez c (int) :");
        int c = scanner.nextInt();
        System.out.println("Entrez x (double) :");
        double x = scanner.nextDouble();
        double value = ((a+b)/2.0)*Math.pow(x, 3) + Math.pow(a+b, 2)*Math.pow(x, 2) + a + b + c;
        System.out.println("La valeur est de " + value);
    }
}
