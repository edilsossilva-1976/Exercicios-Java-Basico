/*
 * 21.	Escreva um programa Java para converter um número decimal em um número octal.
 * a.	Input Data:
 * b.	Input a Decimal Number: 15
 */

import java.util.Scanner;

public class ConverterIntParaOctal {
    public static void main(String[] args) {
        int numeroDecimal, resto, quota, i=1, j;
        int[] numeroOctal = new int[100];

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero decimal: ");
        numeroDecimal = input.nextInt();

        input.close();

        quota = numeroDecimal;

        while (quota != 0) {
            numeroOctal[i++] = quota % 8;
            quota = quota / 8;
        }

        System.out.print("O numero octal é: ");

        for(j = i - 1; j > 0; j--){
            System.out.print(numeroOctal[j]);
        }

    }
}
