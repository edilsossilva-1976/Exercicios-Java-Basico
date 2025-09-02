import java.util.Scanner;

public class ConvertBinarioParaHexadecimal {
    public static void main(String[] args) {
        int[] hex = new int[1000];
        int i = 1, j = 0, resto, numeroDecimal = 0, numeroBinario;

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero binario: ");
        numeroBinario = input.nextInt();
        input.close();

        //Converter binario para decimal
        while (numeroBinario > 0) {
            resto = numeroBinario % 2;
            numeroDecimal = numeroDecimal + resto * i;
            i = i * 2;
            numeroBinario = numeroBinario / 10;
        }
        i = 0;

        //Converter decimal para hexadecimal
        while (numeroDecimal != 0) {
            hex[i] = numeroDecimal % 16;
            numeroDecimal = numeroDecimal / 16;
            i ++;
        }

        //Mostrar o valor hexadecimal
        for (j = i - 1; j >= 0; j--) {
            if (hex[j] > 9) {
                System.out.print((char)(hex[j] + 55));
            }else{
                System.out.print(hex[j]);
            }
        }


    }
}

