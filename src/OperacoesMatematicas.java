/*
 * Escreva um programa Java para imprimir a soma (adição), multiplicação, subtração, divisão e resto de dois números.
 */

import java.util.Scanner;

public class OperacoesMatematicas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double numero1, numero2;

        System.out.println("*** Operações Matemáticas ***");
        System.out.print("Digite o primeiro numero: ");
        numero1 = input.nextDouble();

        System.out.print("Digite o segundo numero: ");
        numero2 = input.nextDouble();

        System.out.print("Soma: ");
        System.out.printf("%.1f + %.1f = %.1f\n", numero1, numero2, (numero1 + numero2));

        System.out.print("Subtração: ");
        System.out.printf("%.1f - %.1f = %.1f\n", numero1, numero2, (numero1 - numero2));

        System.out.print("Multiplicação: ");
        System.out.printf("%.1f x %.1f = %.1f\n", numero1, numero2, (numero1 * numero2));

        System.out.print("Divisao: ");
        System.out.printf("%.1f / %.1f = %.1f\n", numero1, numero2, (numero1 / numero2));

        System.out.print("Módulo: ");
        System.out.printf("%.1f mod %.1f = %.1f\n", numero1, numero2, (numero1 % numero2));

        input.close();
    }
    
}
