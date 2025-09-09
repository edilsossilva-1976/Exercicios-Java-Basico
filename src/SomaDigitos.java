/*
 * 33.	Escreva um programa Java e calcule a soma dos dígitos de um inteiro.
 * a.	Dados de Entrada:
 * b.	Insira um inteiro: 25
 */

import java.util.Scanner;

public class SomaDigitos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long inteiro, soma = 0;
        
        System.out.print("Digite um numero inteiro: ");
        inteiro = input.nextLong();

        while (inteiro != 0) {
            soma += (inteiro % 10);
            inteiro /= 10;
        }

        System.out.printf("A soma dos digitos é: %d\n ", soma);

        input.close();
    }
}
