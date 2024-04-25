package ExerciciosFixacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import ExerciciosFixacao.entities.Product;

public class Aula220 {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner tec = new Scanner(System.in);

        List<Product> list = new ArrayList<>();
        
        System.out.println("Enter the file path: ");
        String sourceFileStr = tec.nextLine();

        File sourceFile = new File(sourceFileStr);
        File sourceFolderStr = new File(sourceFile + "\\out");

        boolean success = sourceFolderStr.mkdir();

        System.out.println("Sucesso na criação da nova pasta: " + success);

        String targetFileStr = sourceFolderStr + "\\out\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))){
            
            String itemCsv = br.readLine();
            while (itemCsv != null){
                System.out.println(itemCsv);
                itemCsv = br.readLine();
            }

        } catch (IOException e){
        System.out.println("Error writing file: " + e.getMessage());
       }
        tec.close();
    }
}
