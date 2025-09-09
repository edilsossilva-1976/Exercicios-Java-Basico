/*
 * 34.	Escreva um programa em Java para calcular a área do hexágono.
 * a.	Área de um hexágono = (6 * s^2)/(4*tan(π/6))
 * b.	onde s é o comprimento de um lado
 * c.	Dados de Entrada:
 * d.	Insira o comprimento de um lado do hexágono: 6
*/

import java.util.Scanner;

public class AreaHexagonal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double aresta = 0.0;

        System.out.println("Digite o tamanho da aresta: ");
        aresta = input.nextDouble();

        aresta = (6 * (aresta * aresta)) / (4 * Math.tan(Math.PI / 6));
        System.out.printf("A area do hexagono é: %.2f\n", aresta);

        input.close();
    }
}
