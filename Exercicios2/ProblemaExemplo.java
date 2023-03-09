package Exercicios2;

import java.util.Scanner;

public class ProblemaExemplo {
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        int minutos;
        double conta = 50.0;

        System.out.println("Quantos minutos você consumiu?");
        minutos = Integer.parseInt(tec.nextLine());

        if (minutos > 100){
            conta += (minutos - 100) * 2.0;
        }

        System.out.printf("Valor a pagar: R$%.2f%n", conta);

        tec.close();
    }
}
