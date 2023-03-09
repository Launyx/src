package Aulas.Aula49;

import java.util.Scanner;

public class EstruturaFor {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int N = tec.nextInt();
        int soma = 0;

        for (int i=0; i < N; i++){
            int x = tec.nextInt();
            soma += x;
        }

        System.out.println(soma);

        tec.close();
    }
}
