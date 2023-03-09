package Aulas.Aula60;

import java.util.Scanner;

public class FuncoesSintaxe {
    public static void main(String[] args) {
         
        Scanner tec = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = tec.nextInt();
        int b = tec.nextInt();
        int c = tec.nextInt();

        int higher = max(a, b, c);

        showResult(higher);

        tec.close();
    }

    public static int max(int x, int y, int z){
        int aux;
        if (x > y && x > z){
            aux = x;
        }else if(y > z){
            aux = y;
        }else{
            aux = z;
        }
        return aux;
    }

    public static void showResult(int value){
        System.out.println("Higher = " + value);
    }
}
