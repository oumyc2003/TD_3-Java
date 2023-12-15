import java.util.Random;

public class ProduitMatrices {
    public static void main(String[] args) {
        int[][] matrice1 = new int[5][3];
        int[][] matrice2 = new int[3][5];
        int[][] produit;

        Random gen = new Random();

        // Remplissage des matrices
        for (int i = 0; i < matrice1.length; i++) {
            for (int j = 0; j < matrice1[0].length; j++) {
                matrice1[i][j] = gen.nextInt(10);
                matrice2[j][i] = gen.nextInt(10);
            }
        }
        int[][] produit = new int[matrice1.length][matrice2[0].length];
           for (int ligne = 0; ligne < matrice1.length; ligne++) {
            for (int colonne = 0; colonne < matrice2[0].length; colonne++) {
                for (int m = 0; m < matrice1[0].length; m++) {
                    produit[ligne][colonne] += matrice1[ligne][m] * matrice2[m][colonne];
                }
                    }
           }

      

         for (int i = 0; i < produit.length; i++) {
            for (int j = 0; j < produit[0].length; j++) {
                      System.out.print(produit[i][j]+" " );
                    }
                      System.out.println();
                       }
          }
    }
}

