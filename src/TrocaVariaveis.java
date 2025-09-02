/*
 * Escreva um programa Java para imprimir uma bandeira americana na tela.
 */
public class TrocaVariaveis {
    public static void main(String[] args) {
        int numA, numB, numTemp;

        numA = 15;
        numB = 27;

        System.out.printf("Antes da troca: a = %d e b = %d\n", numA, numB);


        numTemp = numA;
        numA = numB;
        numB = numTemp;

        System.out.printf(" Após da troca: a = %d e b = %d\n", numA, numB);
    }
}
