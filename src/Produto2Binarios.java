/*
 * 18.	Escreva um programa Java para multiplicar dois números binários.
 * a.	Input Data:
 * b.	Input the first binary number: 10
 * c.	Input the second binary number: 11
 */

import java.util.Scanner;

public class Produto2Binarios {
    public static void main(String[] args) {
        long binario1, binario2, produto = 0;
        int digito, fator = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("***** Multiplicação de numeros binários ***** ");
        System.out.print("Digite o 1º numero binário: ");
        binario1 = input.nextLong();

        System.out.print("Digite o 2º numero binário: ");
        binario2 = input.nextLong();

        input.close();

        //Processar binario2 para calcular o produto
        while (binario2 != 0) {
            digito = (int)(binario2 % 10);
            if (digito == 1) {
                binario1 = binario1 * fator;
                produto = produtoBinario((int)binario1, (int)produto);
            }else{
                binario1 = binario1 * fator;
            }
            binario2 = binario2 / 10;
            fator = 10;
        }
        System.out.print("Produto de dois numeros binários: " + produto + "\n");
    }

    //Metodo para calcular o produto de 2 binarios

    static int produtoBinario(int binario1, int binario2){
        int i = 0, resto = 0;
        int[] soma = new int[20];
        int produtoBinarioRes = 0;

        while (binario1 != 0 || binario2 != 0) {
            soma[i++] = (binario1 % 10 + binario2 % 10 + resto) % 2;
            resto = (binario1 % 10 + binario2 % 10 + resto) / 2;
            binario1 = binario1 / 10;
            binario2 = binario2 / 10;
        }

        if (resto != 0) {
            soma[i++] = resto;
        }

        --i;

        while (i >= 0) {
            produtoBinarioRes = produtoBinarioRes * 10 + soma[i--];
        }

        return produtoBinarioRes;

    }


}
