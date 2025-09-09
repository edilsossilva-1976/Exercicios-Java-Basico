/*
 * 35.	Escreva um programa Java para calcular a área de um polígono.
 * a.	Área de um polígono = (n*s^2)/(4*tan(π/n))
 * b.	onde n é um polígono de n lados e s é o comprimento de um lado.
 * c.	Dados de Entrada:
 * d.	Insira o número de lados do polígono: 7.
 * e.	Insira o comprimento de um dos lados: 6.36.
 */

import java.util.Scanner;

public class AreaPoligono {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arestas;
        double tamanhoAresta, area = 0.0;

        System.out.println("Digite o nº de arestas do poligono: ");
        arestas = input.nextInt();
        System.out.println("Digite o tamanho das arestas: ");
        tamanhoAresta = input.nextDouble();

        area = (arestas * (tamanhoAresta * tamanhoAresta)) / (4.0 * Math.tan(Math.PI / arestas));
        System.out.printf("A área do poligono é: %f", area);

        input.close();
    }
}
