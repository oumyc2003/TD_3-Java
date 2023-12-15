import java.util.Random;

public class SomeMatrices {
    public static void main(String[] args) {
        int[][] matrice1 = new int[5][10];
        int[][] matrice2 = new int[5][10];
        int[][] sommeMatrices = new int[5][10];

        Random gen = new Random();

      
        for (int i = 0; i < matrice1.length; i++) {
            for (int j = 0; j < matrice1[0].length; j++) {
                matrice1[i][j] = gen.nextInt(10);
                matrice2[i][j] = gen.nextInt(10);
            }
        }


        for (int i = 0; i < matrice1.length; i++) {
            for (int j = 0; j < matrice1[0].length; j++) {
                sommeMatrices[i][j] = matrice1[i][j] + matrice2[i][j];
            }
        }

      
        for (int i = 0; i < sommeMatrices.length; i++) {
            for (int j = 0; j < sommeMatrices[0].length; j++) {
                System.out.print(sommeMatrices[i][j] + " ");
            }
            System.out.println();
        }
    }
}

