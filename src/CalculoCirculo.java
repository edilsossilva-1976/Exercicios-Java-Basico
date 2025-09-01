/*
 * Escreva um programa Java para imprimir a área e o perímetro de um círculo.
 */

import java.util.Locale;
import java.util.Scanner;

public class CalculoCirculo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double raio, area, perimetro;

        System.out.println("Digite o raio do circulo: ");
        raio = input.nextDouble();

        perimetro = 3.14159265359 * raio * 2;
        area = 3.14159265359 * raio * raio;

        System.out.printf("O perímetro é: %.14f\n", perimetro);
        System.out.printf("A área é: %.14f\n", area);

        input.close();
    }
}
