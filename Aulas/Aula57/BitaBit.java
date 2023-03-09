package Aulas.Aula57;

import java.util.Scanner;

public class BitaBit {
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        
        int mask = 0b100000;
        int n = tec.nextInt();

        if ((n & mask) != 0){
            System.out.println("6º bit é verdadeiro");

        }else{
            System.out.println("6º bit é falso");

        }


        tec.close();
    }
}
