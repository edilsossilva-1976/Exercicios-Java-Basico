/*
 * Tem-se um conjunto de dados contendo a altura e o sexo (masculino, feminino) de 10 pessoas. 
 * Fazer um algoritmo que calcule e escreva:
 * a. a maior e a menor altura do grupo;
 * b. média de altura dos homens;
 * c. o número de mulheres.
 */

import java.util.Locale;
import java.util.Scanner;

public class AlturaESexo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int sexo, qtdMulheres = 0, qtdHomens = 0;
        float altura, somaAltura = 0f, mediaHomens = 0f, maior = 0f, menor = 4.0f;

        for (int i = 0; i < 10; i++) {
            System.out.print("Escolha o sexo da pessoa (1-Mulher, 2-Homem): ");
            sexo = input.nextInt();

            System.out.print("Digite a altura: ");
            altura = input.nextFloat();

            if (sexo == 1) {
                qtdMulheres++;

            }else if (sexo == 2) {
                qtdHomens++;
                somaAltura = somaAltura + altura;

            }else{
                System.out.println("Opção de sexo inválida!");
            }

            if (altura > maior) {
                maior = altura;   
            }else if (altura < menor) {
                menor = altura;
            }

        }

        mediaHomens = somaAltura / qtdHomens;

        System.out.printf("A maior altura do grupo é de %.2f centimetros. E a menor é de: %.2f\n", maior, menor);
        System.out.printf("A média de altura dos homens é de %.2f centimetros\n.", mediaHomens);
        System.out.printf("O numero de mulheres é  %d.\n", qtdMulheres);

        input.close();
    }
}
