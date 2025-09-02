/*
 * 17.	Escreva um programa Java para somar dois números binários.
 * a.	Input Data:	
 * b.	Input first binary number: 10
 * c.	Input second binary number: 11
 */

import java.util.Scanner;

public class Soma2Binarios {
    public static void main(String[] args) {
        long binario1, binario2;
        int i = 0, resto = 0;

        //Criar uma matriz para guardar a soma dos binarios
        int[] soma = new int[20];
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o primeiro numero binário: ");
        binario1 = in.nextLong();

        System.out.print("Digite o segundo numero binário: ");
        binario2 = in.nextLong();


        while (binario1 !=0 || binario2 != 0) {
            //calcular a soma dos digitos binarios e atualizar o resto;
            soma[i++] = (int)((binario1 % 10 + binario2 % 10 + resto) % 2);
            resto = (int)((binario1 % 10 + binario2 % 10 + resto) / 2);
            binario1 = binario1 / 10;
            binario2 = binario2 / 10;
        }
        

        //Se houver algum valor restante, adiciono à soma
        if (resto != 0) {
            soma[i++] = resto;
        }

        // Decrementar o indexador para impressão
        --i;

        //Imprimir a soma de 2 numeros binarios:
        System.out.print("Soma de 2 numeros binarios: ");
        while (i >= 0) {
            System.out.print(soma[i--]);
        }
        System.out.println("\n");

        in.close();
    }
}
