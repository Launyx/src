package Aulas.Aula98;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) {
        
        // entre <> colocar o tipo da lista
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        // posição, elemento
        list.add(2, "Marco");

        System.out.println(list.size());

        // A lista é capaz de remover um dado em comparação com um dado informado

        // para cada x em lista
        for (String x: list){
            System.out.println(x);
        }


        System.out.println("-------------------");

        list.removeIf(x -> x.charAt(0) == 'M'); // Predicado

        for (String x: list){
            System.out.println(x);
        }

        System.out.println("-------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Marco: " + list.indexOf("Marco"));

        System.out.println("-------------------");
        // converte a lista para stream, utiliza o filter que aceita expressão lambda depois com o collect, converte para list novamente
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());

        for (String x: result){
            System.out.println(x);
        }

        System.out.println("-------------------");
        // Encontrar primeiro elemento
        String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst() .orElse(null);       
        System.out.println(name);
    }
}
