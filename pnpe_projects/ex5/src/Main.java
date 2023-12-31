import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matrix1 = new int[3][3];

        for(int i = 0; i < matrix1.length; i++)

        {
            for(int j = 0; j < matrix1.length; j++)
            {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The matrix is: ");
        for(int i = 0; i < matrix1.length; i++)
        {
            for(int j = 0; j < matrix1.length; j++)
            {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        diagCalum(matrix1);

        diagCalum2(matrix1);

        scanner.close();
    }
    public static void diagCalum2(int[][] matrix1) {
        int sum = 0;
        for(int i = 0; i < matrix1.length; i++)
        {
            sum += matrix1[i][i];
        }
        for (int i = 0; i < matrix1.length; i++) {
            if(i != (matrix1.length) - 1 - i) {
                sum += matrix1[i][matrix1.length - 1 - i];
            }
        }
        System.out.println("Sum of both diagonals without center digit is: " + sum);
    }
    public static void diagCalum(int[][] matrix1) {
        int sum = 0;
        for(int i = 0; i < matrix1.length; i++)
        {
            sum += matrix1[i][i];
        }
        for (int i = 0; i < matrix1.length; i++) {
            sum += matrix1[i][matrix1.length - 1 - i];
        }
        System.out.println("Sum of both diagonals is: " + sum);
    }

}