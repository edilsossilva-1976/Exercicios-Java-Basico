/*
 * 38.	Escreva um programa Java para contar letras, espaços, números e outros caracteres em uma string de entrada.
 */

import java.util.Scanner;

public class ContaCaracteres {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String frase;
        int letras = 0, espacos = 0, numeros = 0, outro = 0;

        System.out.println("Digite uma frase: ");
        frase = input.nextLine();

        char[] caracteres = frase.toCharArray();

        for (int i = 0; i < caracteres.length; i++) {
            if (Character.isLetter(caracteres[i])) {
                letras++;
            }else if (Character.isDigit(caracteres[i])) {
                numeros++;
            }else if (Character.isSpaceChar(caracteres[i])) {
                espacos++;
            }else{
                outro++;
            }
        }

        System.out.println("Voce digitou: "+frase);
        System.out.println("A frase possui %d letras: "+letras);
        System.out.println("A frase possui %d espaços: "+espacos);
        System.out.println("A frase possui %d numeros: "+numeros);
        System.out.println("A frase possui %d outros: "+outro);
        
        input.close();
    }
}
