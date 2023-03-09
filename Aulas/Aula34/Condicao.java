package Aulas.Aula34;

import java.util.Scanner;

public class Condicao {
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);
        int hora;

        System.out.println("Que horas são?");
        hora = Integer.parseInt(tec.nextLine());

        if (hora >= 0 && hora < 12){
            System.out.println("Bom dia");

        }
        else if (hora < 18){
            System.out.println("Boa tarde");

        }
        else{
            System.out.println("Boa noite");
        }
        
        tec.close();
    }
}
