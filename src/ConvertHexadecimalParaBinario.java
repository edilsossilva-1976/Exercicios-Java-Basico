/*
 * Escreva um programa Java para converter um número hexadecimal em um número binário.
 * a.	Input Data:
 * b.	Enter Hexadecimal Number : 37
 */

import java.util.Scanner;

public class ConvertHexadecimalParaBinario {

    public static int hexToBinary(String s){
        String digitos = "0123456789ABCDEF";
        s = s.toUpperCase();
        int valor = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digitos.indexOf(c);
            valor = 16 * valor + d;
        }
        return valor;
    }

    public static void main(String[] args) {
        String numeroHexadecimal;
        int numeroDecimal, i = 1, j;
        int[] numBinario = new int[100];
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o numero hexadecimal: ");
        numeroHexadecimal = input.nextLine();

        input.close();
        
        numeroDecimal = hexToBinary(numeroHexadecimal);

        while (numeroDecimal != 0) {
            numBinario[i++] = numeroDecimal % 2;
            numeroDecimal = numeroDecimal / 2;
        }

        System.out.print("Numero binario equivalente: ");
        for(j = i - 1; j > 0; j--){
            System.out.print(numBinario[j]);
        }
    }
}
