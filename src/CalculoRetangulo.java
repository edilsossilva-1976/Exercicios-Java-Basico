/*
 * Escreva um programa Java para imprimir a área e o perímetro de um retângulo.
 *  a.	Test Data: Width = 5.5 Height = 8.5
 */

import java.util.Locale;
import java.util.Scanner;

public class CalculoRetangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double largura, altura, area, perimetro;

        System.out.println("***** Calculo do retangulo *****");
        System.out.print("Digite a altura do retangulo: ");
        altura = input.nextDouble();
        System.out.print("Digite a largura do retangulo: ");
        largura = input.nextDouble();

        input.close();
        
        area = largura * altura;
        perimetro = 2 * (altura + largura);

        System.out.printf("A área do retangulo é: %.2f\n", area);
        System.out.printf("A perimetro do retangulo é: %.2f\n", perimetro);
    }
}
