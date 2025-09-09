/*
 * 32.	Escreva um programa Java para comparar dois números.
 * a.	Dados de entrada:
 * b.	Primeiro inteiro de entrada: 25
 * c.	Segundo inteiro de entrada: 39
 */

import java.util.Scanner;

public class Compara2Numeros {
    public static void main(String[] args) {
        int numero1, numero2;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        numero1 = input.nextInt();

        System.out.println("Digite o segundo numero:");
        numero2 = input.nextInt();

        if (numero1 == numero2) 
            System.out.printf("%d == %d\n", numero1, numero2);
        if (numero1 != numero2) 
            System.out.printf("%d != %d\n", numero1, numero2);
        if (numero1 < numero2) 
            System.out.printf("%d < %d\n", numero1, numero2);
        if (numero1 > numero2) 
            System.out.printf("%d > %d\n", numero1, numero2);
        if (numero1 <= numero2) 
            System.out.printf("%d <= %d\n", numero1, numero2);
        if (numero1 >= numero2) 
            System.out.printf("%d >= %d\n", numero1, numero2);
        
        input.close();
    }
}
