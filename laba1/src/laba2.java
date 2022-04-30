import java.util.Scanner;
public class laba2 {
    public static void main(String[] args) {
        //№ Залікової книги 1529 => c5=4 c7=3 c11=0
        //Scanner input = new Scanner(System.in);
        //System.out.println("Введите число:");


        //int n = input.nextInt();
        int matrix1[][] = {{1, 3, 7},
                {6, 5, 8},
                {4, 8, 9},
                {2, 1, 3},
                {7, 4, 8}};
        int matrix2[][] = {{18,15, 4, 5, 6},
                {12, 17, 3, 5, 6},
                {4, 12, 1, 3, 1}};

        int Suma = 0;

        // output of matrix A and B
        System.out.println("first matrix:");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("second matrix:");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println("");
        }
        // multiplication of A and B
        int matrix3[][] = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        // output of matrix3
        System.out.println("final matrix:");
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[i].length; j++) {
                System.out.print(matrix3[i][j] + " ");

            }
            System.out.println();
        }
        // finding min element in a column of matrix3
        for (int i=0; i<matrix3.length; i++) {
            int min = matrix3[0][i];
            for (int j=0; j<matrix3[i].length; j++) {
                if (matrix3[j][i]<min) {
                    min = matrix3[j][i];
                }
            }
            Suma += min;
        }
        System.out.println("Сума найменших елементів у кожному рядку дорівнює: "+Suma);
    }
}