/*
 * 28.	Escreva um programa Java para converter um valor hexadecimal em um número decimal.
 * a.	Input Data:	
 * b.	Input a hexadecimal number: 25
 */

import java.util.Scanner;

public class ConvertHexadecimalParaDecimal {

    public static int HexToDecimal(String s){
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

    public static void main(String[] args){
        String numeroHexadecimal;
        int numeroDecimal;
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero hexadecimal: ");
        numeroHexadecimal = input.nextLine();

        numeroDecimal = HexToDecimal(numeroHexadecimal);

        System.out.println("Numero decimal equivalente: " + numeroDecimal);
    }
    
}
