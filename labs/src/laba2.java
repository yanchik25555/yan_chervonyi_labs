public class laba2 {
    public static void main(String[] args) {
        //№ Залікової книги 1529 => c5=4 c7=3 c11=0

        //int n = input.nextInt();
        int matrix1[][] = {{11, 3, 11},
                {16, 5, 8},
                {4, 18, 9},
                {12, 1, 3},
                {7, 4, 18}};
        int matrix2[][] = {{8,5, 4, 15, 7},
                {2, 7, 13, 5, 8},
                {4, 2, 1, 13, 9}};

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
        if (matrix1.length == matrix2[0].length) {
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
            for (int i = 0; i < matrix3.length; i++) {
                int min = matrix3[0][i];
                for (int j = 0; j < matrix3[i].length; j++) {
                    if (matrix3[j][i] < min) {
                        min = matrix3[j][i];
                    }
                }
                Suma += min;
            }
            System.out.println("Сума найменших елементів у кожному cтовпчику дорівнює: " + Suma);
        }else{
            System.out.println("cannot be multiplyed because matrix are invalid ");
        }
    }
}