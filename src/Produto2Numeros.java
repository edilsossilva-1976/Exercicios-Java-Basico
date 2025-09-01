/*
 * Escreva um programa Java que receba dois números como entrada e exiba o produto dos dois números.
 */

import java.util.Scanner;

public class Produto2Numeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero1, numero2, produto;
        System.out.println("Produto de 2 numeros:");
        System.out.print("Digite o primeiro numero:");
        numero1 = sc.nextInt();
        System.out.print("Digite o segundo numero:");
        numero2 = sc.nextInt();

        produto = numero1 * numero2;
        System.out.printf("%d x %d = %d%n", numero1, numero2, produto);

        sc.close();
    }
}
