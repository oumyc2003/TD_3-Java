import java.util.Random;
public class InitialisationAleatoire {
    public static void main(String[] args) {
     
          int[][] matrice = new int[5][10];
          Random gen = new Random();
        
         for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[0].length; j++) {
               matrice[i][j] = gen.nextInt(10);
            }
         }
        for (int i = 0; i < matrice.length; i++) {
           for (int j = 0; j < matrice[0].length; j++) {
             System.out.print(matrice[i][j]+" " );
         }
       System.out.println();
     }
  }
  
}

