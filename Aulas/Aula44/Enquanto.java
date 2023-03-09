package Aulas.Aula44;

import java.util.Scanner;

public class Enquanto {
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        int x = tec.nextInt();

        while (x != 0){
            x = tec.nextInt();
        }


        tec.close();
    }
}
