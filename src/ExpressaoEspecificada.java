/*
 * 9.	Escreva um programa Java para calcular as expressões especificadas e imprimir a saída.
 *  a.	((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
 */
public class ExpressaoEspecificada {
    public static void main(String[] args) {
        double expressao = 0.0;
        expressao = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        System.out.printf("%.15f" , expressao);
    }
}
