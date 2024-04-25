package Aulas.Aula219;

import java.io.File;
import java.util.Scanner;

public class InformaçõesDoCaminho {
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String strPath = tec.nextLine();

        File path = new File(strPath);

        System.out.println("getName: " + path.getName());
        System.out.println("getParent: " + path.getParent());
        System.out.println("getPath: " + path.getPath());

    }
}
