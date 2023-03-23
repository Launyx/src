package ExerciciosFixacao;

import java.util.Locale;
import java.util.Scanner;

public class Aula72 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);

        Double dollarPrice, quantity;



        System.out.println("What is the dollar price? ");
        dollarPrice = tec.nextDouble();

        System.out.println("How many dollars do you want do buy?");
        quantity = tec.nextDouble();

        System.out.println("Amount to be paid in Reais: " + CurrencyConverter.conversor(dollarPrice, quantity));

        tec.close();
    }
}
