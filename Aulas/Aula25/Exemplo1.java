package Aulas.Aula25;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);

        String x;
        int y;
        double z;
        x = tec.next();
        y = tec.nextInt();
        z = tec.nextDouble();
        System.out.println("Você digitou: " + x);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        tec.close();
    }
}
