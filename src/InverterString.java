/*
 * 37.	Escreva um programa Java para inverter uma string.
 * a.	Dados de Entrada:
 * b.	Insira uma string: A rápida raposa marrom
 */

import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        char[] letras = input.nextLine().toCharArray();

        System.out.println("INVERTENDO STRINGS...");

        for(int i = letras.length - 1; i >= 0; i-- ){
            System.out.print(letras[i]);
        }

        input.close();
    }
}
