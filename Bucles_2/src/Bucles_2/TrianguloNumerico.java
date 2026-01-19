package Bucles_2;


public class TrianguloNumerico {

    public static void main(String[] args) {
        imprimirTriangulo(5);
    }

    static void imprimirTriangulo(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
