/*
 * 30.	Escreva um programa Java para converter um valor hexadecimal em um número octal.
 * a.	Input Data:
 * b.	Input a hexadecimal number: 40
 */

import java.util.Scanner;

public class ConverterHexadecimalParaOctal {
    
    public static int hexToOctal(String s){
        String digitos = "0123456789ABCDEF";
        s = s.toUpperCase();
        int valor = 0;

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int d = digitos.indexOf(c);
            valor = 16 * valor + d;
        }
        return valor;

    }
    
    public static void main(String[] args) {
        String  numeroHexadecimal;
        int numeroDecimal, i = 1, j;
        int[] numeroOctal = new int[100];
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero hexadecimal: ");
        numeroHexadecimal = input.nextLine();

        input.close();

        numeroDecimal = hexToOctal(numeroHexadecimal);

        while (numeroDecimal != 0) {
            numeroOctal[i++] = numeroDecimal % 8;
            numeroDecimal = numeroDecimal / 8;
        }

        //Mostrar o numero octal equivalente
        System.out.print("Valor octal equivalente: ");
        for(j = i - 1; j > 0; j--){
            System.out.print(numeroOctal[j]);
        }   
     }
}
