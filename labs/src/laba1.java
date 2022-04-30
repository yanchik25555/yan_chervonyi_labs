public class laba1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int n = 2;
        int m = 2;
        int C = 3;
        double Suma = 0;

        if (a <= -C & -C <= n){
            System.out.println("Error! can not be divided by zero!");
        }
        for (long i = a; i<=n ; i++){
            for (long j =  b; j<=m; j++){
                Suma += (double) (i-j) / (i-C);
            }
        }
        System.out.println(Suma);


    }
}
