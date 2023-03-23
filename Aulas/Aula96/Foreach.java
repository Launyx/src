package Aulas.Aula96;

public class Foreach {
    public static void main(String[] args) {
        
        String[] vect = new String[] {"Maria", "Bob", "Alex"};

        for (int i=0; i < vect.length; i++){
            System.out.println(vect[i]);
        }

        System.out.println("-----------------------");

        // para cada objeto obj, contido no vetor vect
        for (String obj : vect){
            System.out.println(obj);
        }

    }
}
