package Exercicios2;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        int num;

        System.out.print("Digite um número: ");
        num = Integer.parseInt(tec.nextLine());

        if (num > 0){
            System.out.println("Você digitou um número positivo!");
        }else if (num < 0){
            System.out.println("Você digitou um númeor negativo!");
        }else{
            System.out.println("0 é um número neutro, nem positivo e nem negativo!");
        }





        tec.close();
    }
}
