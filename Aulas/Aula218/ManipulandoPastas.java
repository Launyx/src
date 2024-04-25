package Aulas.Aula218;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPastas {
    public static void main(String[] args) {
        
        Scanner tec = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = tec.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory); // Lista somente quem é diretório ou pasta
        System.out.println("FOLDERS:");
        for (File folder : folders){
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile); // Lista somente arquivos
        System.out.println("FILES:");
        for (File file : files){
            System.out.println(file);
        }

        boolean succes = new File(strPath + "\\subdir").mkdir();    // Cria uma pasta no caminho indicado
        System.out.println("Directory created succesfully:" + succes);

        tec.close();
    }
}