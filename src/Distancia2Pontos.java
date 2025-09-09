/*
 * 36.	Escreva um programa Java para calcular a distância entre dois pontos na superfície da Terra.
 * a.	Distância entre os dois pontos [(x1,y1) e (x2,y2)]	
 * b.	d = raio * arccos(sin(x1) * sen(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
 * c.	Raio da Terra r = 6371,01 quilômetros
 * d.	Dados de Entrada:
 * e.	Insira a latitude da coordenada 1: 25
 * f.	Insira a longitude da coordenada 1: 35
 * g.	Insira a latitude da coordenada 2: 35,5
 * h.	Insira a longitude da coordenada 2: 25,5
 */

import java.util.Locale;
import java.util.Scanner;

public class Distancia2Pontos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        double latitude1, latitude2, longitude1, longitude2;
        double terraRadius = 6371.01;

        System.out.print("Digite a latitude da coordenada 1: ");
        latitude1 = input.nextDouble();
        System.out.print("Digite a longitude da coordenada 1: ");
        longitude1 = input.nextDouble();

        System.out.print("Digite a latitude da coordenada 2: ");
        latitude2 = input.nextDouble();
        System.out.print("Digite a longitude da coordenada 2: ");
        longitude2 = input.nextDouble();

        latitude1 = Math.toRadians(latitude1);
        longitude1 = Math.toRadians(longitude1);
        latitude2 = Math.toRadians(latitude2);
        longitude2 = Math.toRadians(longitude2);

        double retorno = terraRadius * Math.acos(Math.sin(latitude1) * Math.sin(latitude2) + Math.cos(latitude1) * Math.cos(latitude2) * Math.cos(longitude1 - longitude2));

        System.out.printf("A distancia entre estes pontos é de: %f", retorno);

        input.close();
    }
}


