import java.util.Arrays;
import java.util.Scanner;

public class Column_sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size= scanner.nextInt();
        int size2=scanner.nextInt();
        int[][] matrix = new int[size][size2];
        int [] result = new int[size2];
        for(int i=0;i<size;i++) {
            for (int j = 0; j < size2; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for(int j = 0; j < size2; j++) {
            for (int i=0;i<size;i++) {
                result[j]+=matrix[i][j];
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
