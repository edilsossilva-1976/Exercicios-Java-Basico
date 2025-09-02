/*
 * 26.	Escreva um programa Java para converter um número octal em um número binário.
 * a.	Input Data:
 * b.	Input any octal number: 7
 */

import java.util.Scanner;

public class ConverterOctalParaBinario {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Definir um array para mapear digitos octal aos equivalentes binarios
        int[] octalValues = {0, 1, 10, 11, 100, 101, 110, 111};

        long numeroOctal, tempOctal, numeroBinario, lugar;
        int resto;

        System.out.println("Digite qualquer  numero octal:");
        numeroOctal = input.nextLong();
        tempOctal = numeroOctal;
        numeroBinario = 0;
        lugar = 1;

        input.close();

        //Converter numero octal para binario usando array
        while (tempOctal != 0) {
            resto = (int)(tempOctal % 10);
            numeroBinario = octalValues[resto] * lugar + numeroBinario;
            tempOctal = tempOctal / 10;
            lugar = lugar * 1000;
        }
        System.out.println("Numero binario equivalente: " + numeroBinario);
    }
}
