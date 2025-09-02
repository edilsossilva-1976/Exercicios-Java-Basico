/*
 * 20.	Escreva um programa Java para converter um número decimal em um número hexadecimal.
 * a.	Input Data:
 * b.	Input a decimal number: 15
 */

import java.util.Scanner;

public class ConvertInteiroParaHexadecimal {
    public static void main(String[] args) {
        int numeroDecimal, resto;
        String numeroHexadecimal = "";

        char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero decimal: ");
        numeroDecimal = input.nextInt();

        input.close();

        //Converter numero decimal para hexadecimal
        while (numeroDecimal > 0) {
            resto = numeroDecimal % 16;
            numeroHexadecimal = hex[resto] + numeroHexadecimal;
            numeroDecimal = numeroDecimal / 16;
        }

        //Mostrar o hexadecimal que representa o numero decimal
        System.out.println("O numero hexadecimal é: " + numeroHexadecimal + "\n");
    }
}
