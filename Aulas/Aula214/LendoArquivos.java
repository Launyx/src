package Aulas.Aula214;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LendoArquivos {
    public static void main(String[] args) {
        
        File file = new File("C:\\Users\\lunyx\\AppData\\Local\\Temp\\in.txt");
        Scanner tec = null;

        try{
            tec = new Scanner(file);
            
            while (tec.hasNextLine()){
                System.out.println(tec.nextLine());
            }

        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        

        // Bloco finally para colocar tec.close, caso fosse colocado no try ou no catch, haveria a possibilidade de não ser fechado 
        // (EX: da erro no bloco try e ele nem chega ao comando de tec.close)
        }finally{ 
            if (tec != null){ // Caso de um erro e o scanner nem chegue a ser instanciado, ele estará como nulo e o tec.close retornará erro "null pointer exception"
                tec.close();
            }
        }



    }
}
