
package exercicio07;

import java.util.Scanner;

/**
 *
 * @author Wellington F.
 */
public class Exercicio07 {

    public static void main(String[] args) {
        double real;
        double cotacao;
        double dolar;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Qual o valor da cotação do dólar hoje? ");
        cotacao = leitor.nextDouble();
        System.out.print("Quantos dólares deseja converter? ");
        dolar = leitor.nextDouble();
        real = dolar * cotacao;
        System.out.println(dolar + " dólares na cotação de hoje é " + real
                + " reais");
    
    }
    
}
