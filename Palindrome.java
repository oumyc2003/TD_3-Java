import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
           System.out.println("Tapez un mot : ");
               texte = scan.nextLine();

        if (UnPalindrome(texte)) {
            System.out.println(texte + " est un palindrome");
        } else {
            System.out.println(texte + " n’est pas un palindrome");
        }
    }

    static boolean UnPalindrome(String mot) {
        int longueur = mot.length();
        for (int i = 0; i < longueur / 2; i++) {
            if (mot.charAt(i) != mot.charAt(longueur - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
}
