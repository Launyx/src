package Exercicios2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        int num;

        System.out.print("Digite um número: ");
        num = Integer.parseInt(tec.nextLine());

        if (num % 2 == 0){
            System.out.printf("%d é um número par", num);
        }else{
            System.out.printf("%d é um número ímpar", num);
        }


        tec.close();
    }
}
