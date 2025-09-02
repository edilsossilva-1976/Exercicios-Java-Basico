/*
 * 24.	Escreva um programa Java para converter um número binário em um número octal.
 * a.	Input Data:
 * b.	Input a Binary Number: 111
 */

import java.util.Scanner;

public class ConverterBinarioParaOctal {
    public static void main(String[] args) {
        int numeroBinario, numeroBinario1, resto, numeroDecimal = 0, quota, i = 1, j;
        int[] numeroOctal = new int[100];

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero binario: ");
        numeroBinario = input.nextInt();
        numeroBinario1 = numeroBinario;

        //Converter numero binario em decimal
        while (numeroBinario > 0) {
            resto = numeroBinario % 10;
            numeroDecimal = numeroDecimal + resto * i;
            i = i * 2;
            numeroBinario = numeroBinario / 10;
        }
        i = 1;
        quota = numeroDecimal;

        //Converter numero decimal para octal
        while (quota > 0) {
            numeroOctal[i++] = quota % 8;
            quota = quota / 8;
        }

        //Mostrar o octal equivalente ao numero binario original
        for(j = i - 1; j > 0; j--){
            System.out.print(numeroOctal[j]);
        }
    }
    
}
