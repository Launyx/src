package Aulas.Aula43;

import java.util.Locale;
import java.util.Scanner;

public class UsandoDebug {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);

        double largura = tec.nextDouble();
        double comprimento = tec.nextDouble();
        double metroQuadrado = tec.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRECO = %.2f%n", preco);


        tec.close();
    }
}
