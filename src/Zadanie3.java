import java.util.Random;

public class Zadanie3 {
    public static void main(String[] args) {
        int[][] tab = new int[5][5];
        Random random = new Random();

        // tab.length - wielkość jednego wymaru
        // tab[0].length - wielkosć drugiego wyniaru

        for(int i = 0; i < tab.length; i++) {
            for(int j = 0; j < tab[i].length; j++) {
                tab[j][i] = random.nextInt(101);
            }
        }

        for(int[] row : tab) {
            for(int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        for(int[] row : tab) {
            int max = row[0];
            for(int i = 1; i < row.length; i++) {
                if(row[i] > max) {
                    max = row[i];
                }
            }
            System.out.println("Jajwieksza wartość to: " + max);
        }
    }
}
