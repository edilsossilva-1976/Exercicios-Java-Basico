/*
 * 10.	Escreva um programa Java para calcular uma fórmula específica.
 *  a.	Fórmula específica: 4,0 * (1 - (1,0/3) + (1,0/5) - (1,0/7) + (1,0/9) - (1,0/11))
 */
public class ExpressaoEspecificada2 {
    public static void main(String[] args) {
        double expressao = 0.0;
        expressao = (4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
        System.out.printf("%.16f", expressao);
    }
}
