import java.util.Scanner;

public class RosesBlanches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int PRIXCAFE= 2;
        final int PRIXFLASH = 4;
        final int PRIXMETRO = 3;
        System.out.println("Combien avez-vous reçu d'argent (Frs) ?");
        int argentT = scanner.nextInt();
        int livres = argentT*  3 / 4;
        int loisirs = argentT / 4;
        int reste = argentT % 4;
        reste += loisirs % 3;
        int cafe = loisirs / 3 / PRIXCAFE;
        reste += (loisirs/3) % PRIXCAFE;
        int flash = loisirs/3 / PRIXFLASH;
        reste += (loisirs/3) % PRIXFLASH;
        int metro = loisirs / 3 / PRIXMETRO;
        reste += (loisirs/3) % PRIXMETRO;
        System.out.println("Livres et fournitures : " + livres + " CHF");
        System.out.println("Vous pouvez ensuite acheter :");
        System.out.println(cafe + " café(s) à Sat");
        System.out.println(flash + " numéro(s) du Flash");
        System.out.println(metro+ " billet(s) de métro");
        System.out.println("Et il vous restera "+ reste + "CHF");
    }
}
