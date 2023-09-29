import java.util.Scanner;

public class Fondue {
    public static void main(String[] args){
        final int BASE = 4;
        double fromage = 800.0;
        double eau = 2.0;
        double ail = 2.0;
        double pain = 400.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nombre de convives :");
        int nbConvives = scanner.nextInt();
        fromage = nbConvives * fromage / BASE;
        eau = nbConvives * eau / BASE;
        ail = nbConvives * ail / BASE;
        pain = nbConvives * pain / BASE;
        System.out.println("Pour " + nbConvives + " convives, il vous faudra :");
        System.out.println("- " + fromage +"g de fromage");
        System.out.println("- " + eau +"dl d'eau");
        System.out.println("- " + ail +"gousse(s) d'ail");
        System.out.println("- " + pain +"g de pain");
        System.out.println("- Du poivre à volonté");
    }
}
