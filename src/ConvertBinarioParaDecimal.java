/*
 * 22.	Escreva um programa Java para converter um número binário em um número decimal.
 * a.	Input Data:
 * b.	Input a binary number: 100
 */

import java.util.Scanner;

public class ConvertBinarioParaDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long numeroBinario, numeroDecimal = 0, j = 1, resto;

        System.out.print("Digite um numero binario: ");
        numeroBinario = input.nextLong();

        input.close();

        //Converter binario para decimal
        while (numeroBinario != 0) {
            resto = numeroBinario % 10;
            numeroDecimal = numeroDecimal + resto * j;
            j = j * 2;
            numeroBinario = numeroBinario / 10;
        }
        System.out.print("Numero decimal: " + numeroDecimal);

    }
}
