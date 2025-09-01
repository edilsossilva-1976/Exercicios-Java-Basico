/*
 * Escreva um programa Java que receba um número como entrada e imprima sua tabuada de multiplicação até 10.
 */

import java.util.Scanner;

public class TabuadaMultiplaAte10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroInput, controle = 0;

        System.out.println("*** Multiplicação ***:");
        System.out.print("Digite um numero:");
        numeroInput = input.nextInt();

        do{
            System.out.printf("%d x %d = %d%n", numeroInput, controle, (numeroInput * controle));
            controle++;
        }while(controle <= 10);

        input.close();
    }
}
