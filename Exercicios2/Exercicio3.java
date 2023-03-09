package Exercicios2;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        int A, B;

        System.out.print("Digite um número inteiro: ");
        A = Integer.parseInt(tec.nextLine());

        System.out.print("Digite outro número inteiro: ");
        B = Integer.parseInt(tec.nextLine());

        if (A % B == 0 || B % A == 0){
            System.out.println("São múltiplos");
        }else{
            System.out.println("Não são múltiplos");
        }

        tec.close();
    }
}
