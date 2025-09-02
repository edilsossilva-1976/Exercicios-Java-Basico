/*
 * Escreva um programa Java para converter um número inteiro em um número binário.
 * a.	Input Data:
 * b.	Input a Decimal Number : 5
 */

import java.util.Scanner;

public class ConverterIntParaBin {
    public static void main(String[] args) {
        int numeroDecimal, quota, i = 1, j;
        int[] numeroBinario = new int[100];

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero decimal:");
        numeroDecimal = input.nextInt();

        quota = numeroDecimal;

        while (quota !=0) {
            numeroBinario[i++] = quota % 2;
            quota = quota / 2;
        }

        //Mostrar representação binaria de um numero decimal
        System.out.println("O numero binário é: ");

        for(j = i - 1; j > 0; j--){
            System.out.print(numeroBinario[j]);
        }

        input.close();
    }
}
