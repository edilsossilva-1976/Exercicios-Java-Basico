/*
 * 27.	Escreva um programa Java para converter um número octal em um número hexadecimal.
 * a.	Input Data:
 * b.	Input a octal number : 100
 */

import java.util.Scanner;

public class ConvertOctalParaHexadecimal {
    public static void main(String[] args) {
        String numeroOctal, numeroHexadecimal;
        int numeroDecimal;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero octal: ");
        numeroOctal = input.nextLine();

        input.close();
        
        //Converter numero octal ao decimal equivalente usando parseInt
        numeroDecimal = Integer.parseInt(numeroOctal, 8);

        //Converter numero decimal ao equivalente hexadecimal
        numeroHexadecimal = Integer.toHexString(numeroDecimal);

        //Mostrar o numero hexadecimal correspondente
        System.out.println("Numero hexadecimal equivalente: " + numeroHexadecimal);
    }
}
