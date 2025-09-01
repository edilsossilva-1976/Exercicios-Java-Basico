/*
 * Escreva um programa Java que receba três números como entrada para calcular e imprimir a média dos números.
 */

import java.util.Locale;
import java.util.Scanner;

public class Media3Numeros {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double numero1, numero2, numero3, media;

        System.out.println("***** Calculo de media *****");
        System.out.print("Primeiro Numero:");
        numero1 = input.nextDouble();
        System.out.print("Segundo Numero:");
        numero2 = input.nextDouble();
        System.out.print("Terceiro Numero:");
        numero3 = input.nextDouble();

        media = (numero1 + numero2 + numero3) / 3;

        System.out.printf("Média: %.2f\n", media);

        input.close();
    }
}
