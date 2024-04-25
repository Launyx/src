package Aulas.Aula217;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterBufferedWriter {
    public static void main(String[] args) {
        
        String[] lines = new String[] {"Good morning", "Good Afternoon", "Good Night"};

        String path = "C:\\Users\\lunyx\\AppData\\Local\\Temp\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for (String line : lines){
                bw.write(line);
                bw.newLine();
            }
        }catch (IOException e){
            System.out.println("Error: " + e.getStackTrace());
        }
    }
}
