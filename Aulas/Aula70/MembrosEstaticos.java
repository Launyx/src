package Aulas.Aula70;

import java.util.Locale;
import java.util.Scanner;

import Aulas.Utilitarios.Calculator;

public class MembrosEstaticos {

    // Constante sempre com letra maiuscula, caso haja espaços usar _. EX: NOME_SOLDADO
    // Não é possivel usar métodos não estáticos dentro de métodos estáticos

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);
        
        System.out.println("Enter radius: ");
        double radius = tec.nextDouble();
        
        double c = Calculator.circumference(radius);

        double v = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI: %.2f%n", Calculator.PI);


        tec.close();
    }
}
