package Aulas.Aula26;

import java.util.Scanner;

public class Aula26 {
    public static void main(String[] args) {
        int x;
        String s1, s2, s3;
        
        Scanner tec = new Scanner(System.in);

        x = Integer.parseInt(tec.nextLine());
        s1 = tec.nextLine();
        s2 = tec.nextLine();
        s3 = tec.nextLine();


        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        tec.close();
    }
}
